package src.Asm;

import java.util.HashMap;
import java.util.List;

public abstract class Instruction {
    protected String label;
    protected String name;

    /** 
     * Constructeur
     * @param label label de l'instruction
     * @param name type d'opération
     */
    public Instruction(String label, String name) {
        this.label = label;
        this.name = name;
    }


    /** 
     * Getter du label de l'instruction
     * @return String label de l'instruction
     */
    public String getLabel() {
        return label;
    }

    /**
     * Setter du label de l'instruction
     * @param label label de l'instruction
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Getter de l'opération
     * @return String type d'opération
     */
    public String getName() {
        return name;
    }

    /**
     * Setter de l'opération
     * @param name type d'opération
     */
    public void setName(String name) {
        this.name = name;
    }

    public abstract List<String> getDefinedVariables();
    public abstract List<String> getUsedVariables();
    public abstract List<String> getLiveVariables();
    public abstract void setLiveVariables(List<String> liveVariables);
    public abstract String toAssembly(HashMap<String, String> registerAllocation);
}
