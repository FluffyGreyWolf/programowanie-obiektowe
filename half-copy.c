#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>
#include <unistd.h>

#define MAX 512

int main(int argc, char *argv[])
{
    char buf[MAX];
    int source_fd, target_fd;
    int read_bytes;
    long rozm;

    if (argc < 3)
    {
        fprintf(stderr, "Too less parameters. Use:\n");
        fprintf(stderr, "%s <source file> <target file>\n", argv[0]);
        exit(1);
    }

    source_fd = open(argv[1], O_RDONLY);
    if (source_fd == -1)
    {
        perror("Source file open error");
        exit(1);
    }

    target_fd = creat(argv[2], 0640);
    if (target_fd == -1)
    {
        perror("Target file open error");
        exit(1);
    }

    rozm = lseek(source_fd, 0, SEEK_END);
    rozm = rozm / 2;
    lseek(source_fd, -rozm, SEEK_END);
    while ((read_bytes = read(source_fd, buf, MAX)) > 0)
    {   

        if (write(target_fd, buf, read_bytes) == -1)
        {
            perror("Target file writing error");
            exit(1);
        }
    }
    if (read_bytes == -1)
    {
        perror("Source file read error");
        exit(1);
    }

    if (close(source_fd) == -1 || close(target_fd) == -1)
    {
        perror("File close error");
        exit(1);
    }

    exit(0);
}
