package Explorers;

import Planets.*;

public class RobotExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Loading instructions from system... exploring Mercury");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Loading instructions from system... exploring Mars");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Loading instructions from system... exploring Saturn");
    }

    @Override
    public void visit(Uranus uranus) {
        System.out.println("Loading instructions from system... exploring Uranus");
    }

    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("Loading instructions from system... exploring Jupiter");
    }
}
