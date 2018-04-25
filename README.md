# lab-fow0sim
## Description
This project hosts a simple web application to be deployed on multiple cloud platforms.
I use it to peek into cloud internals and practicing deployment methods.

##Build
    gradle clean build
    gradle buildDocker

##Run
    docker run -d -p 8888:8080 simmig.eu/lab-fow0sim