package cwk4;

import java.util.ArrayList;
import java.util.List;

public class WINImpl implements WIN {
    private String admiralName;
    private int warchest;
    private List<Force> asf;
    private List<Force> uffDock;
    private List<Force> destroyedForces;
    private List<Battle> battles;

    public WINImpl(String admiralName, int warchest) {
        this.admiralName = admiralName;
        this.warchest = warchest;
        this.asf = new ArrayList<>();
        this.uffDock = new ArrayList<>();
        this.destroyedForces = new ArrayList<>();
        this.battles = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Admiral Name: ").append(admiralName).append("\n");
        sb.append("War Chest: ").append(warchest).append("\n");
        sb.append("Defeated: ").append(isDefeated()).append("\n");
        sb.append("Active Star Fleet: ");
        if (asf.isEmpty()) {
            sb.append("No forces\n");
        } else {
            sb.append("\n");
            for (Force force : asf) {
                sb.append(force).append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public boolean isDefeated() {
        if (warchest <= 0 && asf.stream().noneMatch(Force::isRecallable)) {
            return true;
        }
        return false;
    }

    @Override
    public int getWarchest() {
        return warchest;
    }

    @Override
    public String getAllForces() {
        StringBuilder sb = new StringBuilder();
        sb.append("Active Star Fleet: ");
        if (asf.isEmpty()) {
            sb.append("No forces\n");
        } else {
            sb.append("\n");
            for (Force force : asf) {
                sb.append(force).append("\n");
            }
        }
        sb.append("United Forces Fleet Dock: ");
        if (uffDock.isEmpty()) {
            sb.append("No forces\n");
        } else {
            sb.append("\n");
            for (Force force : uffDock) {
                sb.append(force).append("\n");
            }
        }
        sb.append("Destroyed Forces: ");
        if (destroyedForces.isEmpty()) {
            sb.append("No destroyed forces\n");
        } else {
            sb.append("\n");
            for (Force force : destroyedForces) {
                sb.append(force).append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public boolean isInUFFDock(String ref) {
        for (Force force : uffDock) {
            if (force.getReferenceCode().equals(ref)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getForcesInDock() {
        StringBuilder sb = new StringBuilder();
        sb.append("United Forces Fleet Dock: ");
        if (uffDock.isEmpty()) {
            sb.append("No forces\n");
        } else {
            sb.append("\n");
            for (Force force : uffDock) {
                sb.append(force).append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public String getDestroyedForces() {
        StringBuilder sb = new
