import org.graalvm.compiler.lir.ssa.SSAUtil.PhiValueVisitor;

public interface PersonalCodeBehaviour {
    public String getGender();
    public int getFullYear();
    public String getDOB();
    public int getAge();
}
