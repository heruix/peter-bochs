Minix 2.0.3 under DOS 

The DOSMINIX.ZIP file contains Minix version 2.0.3, a small
educational UNIX-like system for IBM PC's and compatibles.
This version of the software can be run under DOS. Other
variants of Minix can be found at 
http://www.cs.vu.nl/pub/minix/. 

Unpack the DOSMINIX.ZIP file using one of the popular ZIP
utilities, such as PKZIP or WinZip. If running Windows 95 or
98 reboot and hit F8 just when you see the "Booting
Windows" message. From the menu that appears choose
"Command prompt only", or if that doesn't work "Safe mode
command prompt only". For Windows Me, or Windows 2000
with a FAT file system you need to boot your system with a
DOS floppy, like a Startup Disk. 

At the DOS prompt move to the directory containing the Minix
files and type: 

        boot minix.mnx

Type '=' and presto, you are running Minix. The next step is
to read the installation manual pages, usage(8) and 
dosminix(8), to finish the little details involved with a proper
installation of a UNIX-like system, such as the host name, the
time zone you live in, etc. So log in as root (all powerful
user) or bin (owner of the Minix source) and use the man(1)
command to see the manual pages: 

        man usage

                                                Kees J. Bot (kjb@cs.vu.nl)

