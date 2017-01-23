# 2017_Main_Robot
Code for the Steamworks game. This readme provide all of the information required to get started and programming for the 2017 season. 

## Requirements for Robot
1. RoboRio must be flashed to latest 2017 image using USB (This only needs to be done once for the season): (http://wpilib.screenstepslive.com/s/4485/m/13503/l/144984-imaging-your-roborio)
2. Radio must be programed (https://wpilib.screenstepslive.com/s/4485/m/13503/l/144986-programming-your-radio-for-home-use)
3. Roborio IP on ethernet must be set to static using web dashboard to : 10.21.68.2
4. Any IP Camera must be set to 10.21.68.90
5. Vision Processor: If Tegra must be set to 10.21.68.71 (for "TK1"), if Beablebone must be set to 10.21.68.33 (for "BB"), if android must be set to 10.21.68.46 (for "AD")

## Requirements for Students
1. In order to program you need to set up your Java development environment using eclipse. Follow instructions here: https://wpilib.screenstepslive.com/s/4485/m/13809/l/599681-installing-eclipse-c-java (If you already had a previous version of the plugin installed you can simply select help->check for updates)
2. Use JDK 8, and try to use latest Eclipse if possible
3. If you would like to have the driverstation on your computer as well then install NI Update suite, but this is not a requirement to run programs, only to flash robot images (https://wpilib.screenstepslive.com/s/4485/m/13809/l/599671-installing-the-frc-2017-update-suite-all-languages)
4. For returning students: understand what has changed in WPI Librarary since 2016 season (https://wpilib.screenstepslive.com/s/4485/m/13503/l/681378-new-for-2017)
5. Understand how the robot is wired as it affects your code. (https://wpilib.screenstepslive.com/s/4485/m/13503/l/599673-wiring-the-2017-frc-control-system)
## Cool things to know
### Radio
1. You can access radio web page by logging into http://10.21.68.1 root/admin
2. Roborio should always be plugged into POE port of the radio only!!!

### Roborio
1. You can access roborio diagnostics webpage by http://roboRIO-2168-FRC.local or http://10.21.68.2
2. You can program roborio over ethernet, usb, or wifi (if USB, NI Update suite needs to be installed to get usb drivers)
3. More information on the control system can be found at our controls website at http://controls.team2168.org
4. Files will be logged to /home/lvuser/Logs
5. You can ftp to files on roborio using filezilla, winscp, or simple ftp at ftp://10.21.68.2
6. You can ssh into roborio using putty or linux at ssh 10.21.68.2 username:lvuser password: blank

### Dashboard (on driver station)
1. Java dashboard will open if Java is selected from the driverstation menu
2. Python dash (if it installed) will open if "default" dashboard is selected from drivestation menue
3. If smartdashboard doesn't update, but you have robot comms, in smart dash preferences toggle "use mDNS" until it does. 


#Robot Design (TBD)
## Subsystems
### Drivetrain

### Shooter

### Turret

### ShooterIndexer

### BallIntake

### GearIntake

### BallHopper

### GearManipulator

### Vision



