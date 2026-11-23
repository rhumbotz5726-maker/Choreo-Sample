// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.subsystems.DriveSubsystem;
import choreo.auto.AutoFactory;

public final class Autos {
  /** Example static factory for an autonomous command. */
  public DriveSubsystem driveSub = new DriveSubsystem();

  public AutoFactory autoFactory = new AutoFactory(null, 
    null, 
    null, 
    false, 
    driveSub
  );
 
  private Autos() {
    throw new UnsupportedOperationException("This is a utility class!");
  }

  public Command driveTest(String name){
    return Commands.sequence(
      autoFactory.resetOdometry(name),
      autoFactory.trajectoryCmd(name)
      );
    }

}
