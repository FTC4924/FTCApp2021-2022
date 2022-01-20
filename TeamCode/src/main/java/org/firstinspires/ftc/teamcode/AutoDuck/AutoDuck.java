package org.firstinspires.ftc.teamcode.AutoDuck;

import org.firstinspires.ftc.teamcode.AutoBase;
import org.firstinspires.ftc.teamcode.Constants.AllianceColor;
import org.firstinspires.ftc.teamcode.Commands.*;

import java.util.ArrayList;
import java.util.Arrays;


public abstract class AutoDuck extends AutoBase {
    protected abstract AllianceColor getAllianceColor();
    protected ArrayList<Command> getCommands() {
        return new ArrayList<>(
                Arrays.asList(
                        new BlueRed(
                                new ArrayList<>(Arrays.asList(
                                        new Move(.625, -90, .5)
                                )),
                                new ArrayList<>(Arrays.asList(
                                        new Move(.45, -90, .5)
                                ))
                        ),
                        new Pause(1),
                        new DetectDuckPosition(),
                        new Move(.4, -45.0, 0.5),
                        new BlueRed(
                                new ArrayList<>(Arrays.asList(
                                        new Move(1.55, -90, .5)
                                )),
                                new ArrayList<>(Arrays.asList(
                                        new Turn(90),
                                        new Move(1.65, -90, .5)
                                ))
                        ),
                        new Ducks(),
                        new Pause(5),
                        new Ducks(),
                        new BlueRed(
                                new ArrayList<>(Arrays.asList()),
                                new ArrayList<>(Arrays.asList(
                                        new Turn(0)
                                ))
                        ),
                        new ArmRotate(.35),
                        new ArmExtend(.75),
                        new ArmFullRetract(),
                        new LoadDuckCommands(
                                new ArrayList<>(Arrays.asList(
                                        new ArmRotate(.5)
                                )),
                                new ArrayList<>(Arrays.asList(
                                        new ArmRotate(.75)
                                )),
                                new ArrayList<>(Arrays.asList(
                                        new ArmRotate(.95)
                                ))
                        ),
                        new Move(4.25,90,.5),
                        new Move(1,0, .5),
                        new BristlesOut(),
                        new Pause(3),
                        new BristlesOut(),
                        new Turn(90),
                        new Move(2,90,1.5),
                        new ArmExtend(.2)
                )
        );
    }
}
