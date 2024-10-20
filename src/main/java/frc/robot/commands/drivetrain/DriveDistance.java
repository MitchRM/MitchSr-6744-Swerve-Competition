package frc.robot.commands.drivetrain;

import frc.robot.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

public class DriveDistance extends Command {
    private final DriveSubsystem m_drive;
    private final double m_distance;
    private final double m_speed;

    public DriveDistance(double meters, double speed, DriveSubsystem drive) {
        m_distance = meters;
        m_speed = speed;
        m_drive = drive;
        addRequirements(m_drive);
    }

    @Override
    public void initialize() {
    //  m_drive.resetEncoders();
    //  m_drive.arcadeDrive(0, 0);
    }
  
    @Override
    public void execute() {
    //  m_drive.arcadeDrive(m_speed, 0);
    }
  
    @Override
    public void end(boolean interrupted) {
    //  m_drive.arcadeDrive(0, 0);
    }
  
    @Override
    public boolean isFinished() {
      return true;    //Math.abs(m_drive.getAverageEncoderDistance()) >= m_distance;
    }

}
