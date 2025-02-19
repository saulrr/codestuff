package frc.robot;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.math.trajectory.TrapezoidProfile.Constraints;
import edu.wpi.first.math.util.Units;


public final class Constants {

    public static final class ModuleConstants {
        public static final double kWheelDiameterMeters = Units.inchesToMeters(4);
        public static final double kDriveMotorGearRatio = 1 / 6.75;
        public static final double kTurningMotorGearRatio = 1 / 12.8;
        public static final double kDriveEncoderRot2Meter = kDriveMotorGearRatio * Math.PI * kWheelDiameterMeters;
        public static final double kTurningEncoderRot2Rad = kTurningMotorGearRatio * 2 * Math.PI;
        public static final double kDriveEncoderRPM2MeterPerSec = kDriveEncoderRot2Meter / 60;
        public static final double kTurningEncoderRPM2RadPerSec = kTurningEncoderRot2Rad / 60;
        public static final double kPTurning = 0.5; //FIXME may need to adjust
    }

    public static final class DriveConstants {

        public static final double kTrackWidth = Units.inchesToMeters(21.5);
        // Distance between right and left wheels
        public static final double kWheelBase = Units.inchesToMeters(23.5);
        // Distance between front and back wheels
        public static final SwerveDriveKinematics kDriveKinematics = new SwerveDriveKinematics(
                new Translation2d(kWheelBase / 2, -kTrackWidth / 2),
                new Translation2d(kWheelBase / 2, kTrackWidth / 2),
                new Translation2d(-kWheelBase / 2, -kTrackWidth / 2),
                new Translation2d(-kWheelBase / 2, kTrackWidth / 2));

                public static final int kFrontLeftDriveMotorPort = 1;
                public static final int kBackLeftDriveMotorPort = 3;
                public static final int kFrontRightDriveMotorPort = 5;
                public static final int kBackRightDriveMotorPort = 7;
        
                public static final int kFrontLeftTurningMotorPort = 2;
                public static final int kBackLeftTurningMotorPort = 4;
                public static final int kFrontRightTurningMotorPort = 6;
                public static final int kBackRightTurningMotorPort = 8;

       

        public static final boolean kFrontLeftTurningEncoderReversed = true;
        public static final boolean kBackLeftTurningEncoderReversed = true;
        public static final boolean kFrontRightTurningEncoderReversed = true;
        public static final boolean kBackRightTurningEncoderReversed = true;

        public static final boolean kFrontLeftDriveEncoderReversed = false;
        public static final boolean kBackLeftDriveEncoderReversed = false;
        public static final boolean kFrontRightDriveEncoderReversed = false;
        public static final boolean kBackRightDriveEncoderReversed = false;

        public static final int kFrontLeftDriveAbsoluteEncoderPort = 0;
        public static final int kBackLeftDriveAbsoluteEncoderPort = 1;
        public static final int kFrontRightDriveAbsoluteEncoderPort = 3;
        public static final int kBackRightDriveAbsoluteEncoderPort = 2;

        public static final boolean kFrontLeftDriveAbsoluteEncoderReversed = false;
        public static final boolean kBackLeftDriveAbsoluteEncoderReversed = false;
        public static final boolean kFrontRightDriveAbsoluteEncoderReversed = false;
        public static final boolean kBackRightDriveAbsoluteEncoderReversed = false;

        //Took offsets from Former DriveTrain Subsytem
        public static final double kFrontLeftDriveAbsoluteEncoderOffsetRad = -(4.25);
        public static final double kBackLeftDriveAbsoluteEncoderOffsetRad = -(2.96);
        public static final double kFrontRightDriveAbsoluteEncoderOffsetRad = -(3.6);
        public static final double kBackRightDriveAbsoluteEncoderOffsetRad = -(4.55);

        // public static final double kFrontLeftDriveAbsoluteEncoderOffsetRad = -(0);
         //public static final double kBackLeftDriveAbsoluteEncoderOffsetRad = -(0);
         //public static final double kFrontRightDriveAbsoluteEncoderOffsetRad = -(0);
         //public static final double kBackRightDriveAbsoluteEncoderOffsetRad = -(0);


        // public static final double kFrontLeftDriveAbsoluteEncoderOffsetRad = -(4.27) + Math.PI;
        // public static final double kBackLeftDriveAbsoluteEncoderOffsetRad = -(6.12) + Math.PI;
        // public static final double kFrontRightDriveAbsoluteEncoderOffsetRad = -(2.33) + Math.PI;
        // public static final double kBackRightDriveAbsoluteEncoderOffsetRad = -(4.56) + Math.PI;

        public static final double kPhysicalMaxSpeedMetersPerSecond = 4.42;
        public static final double kPhysicalMaxAngularSpeedRadiansPerSecond = 2 * 2 * Math.PI;

        public static final double kTeleDriveMaxSpeedMetersPerSecond = kPhysicalMaxSpeedMetersPerSecond * 0.75; //was divided by 2
        public static final double kTeleDriveMaxAngularSpeedRadiansPerSecond = 
                kPhysicalMaxAngularSpeedRadiansPerSecond/2; //was divided by 4
        public static final double kTeleDriveMaxAccelerationUnitsPerSecond = 3; //was 3 
        public static final double kTeleDriveMaxAngularAccelerationUnitsPerSecond = 3; //was 3
    }

    public static final class AutoConstants {
        public static final double kMaxSpeedMetersPerSecond = DriveConstants.kPhysicalMaxSpeedMetersPerSecond / 4;
        public static final double kMaxAngularSpeedRadiansPerSecond = //
                DriveConstants.kPhysicalMaxAngularSpeedRadiansPerSecond / 10;
        public static final double kMaxAccelerationMetersPerSecondSquared = 3;
        public static final double kMaxAngularAccelerationRadiansPerSecondSquared = Math.PI / 4;
        public static final double kPXController = 1.5;
        public static final double kPYController = 1.5;
        public static final double kPThetaController = 3;

        public static final TrapezoidProfile.Constraints kThetaControllerConstraints = //
                new Constraints(
                        kMaxAngularSpeedRadiansPerSecond,
                        kMaxAngularAccelerationRadiansPerSecondSquared);
    }

    public static final class OIConstants {
        public static final int kDriverControllerPort = 0;

        public static final int kDriverYAxis = 1;
        public static final int kDriverXAxis = 0;
        public static final int kDriverRotAxis = 4;
        public static final int kDriverFieldOrientedButtonIdx = 1;

        public static final double kDeadband = 0.05;
    }

}
