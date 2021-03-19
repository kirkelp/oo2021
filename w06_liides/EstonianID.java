import java.time.LocalDate;
import java.time.Period;

public class EstonianID implements PersonalCodeBehaviour {

    private String code;
  
    public EstonianID(String code){
      this.code = code;
    }
  
    @Override
    public String getGender() {
        int gender = Integer.parseInt(code.substring(0,1));
        if( gender % 2 == 0) {
            return "Female";
       }else {
           return "Male";
       }
    }
  
    @Override
    public int getFullYear() {
        int fullyear = 1700 + Math.round(Integer.parseInt(code.substring(0,1))/2)*100+(Integer.parseInt(code.substring(1,3)));
        return fullyear;
    }
    
    @Override
    public int getMonth() {
        return Integer.parseInt(code.substring(3, 5));
    }

    @Override
    public int getDay() {
        return Integer.parseInt(code.substring(5, 7));
    }
  
    @Override
    public String getDOB() {
      int dob = Integer.parseInt(code.substring(5,7));
      int mob= Integer.parseInt(code.substring(3,5));
      return dob + "." + mob + "." + getFullYear(); 
    }

    @Override
    public String getAge() {
        LocalDate date = LocalDate.of(getFullYear(), getMonth(), getDay());
        LocalDate now = LocalDate.now();
        String age = Integer.toString(Period.between(date, now).getYears());
        return age;
    }
}