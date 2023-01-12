import java.util.List;
import java.util.Objects;

public class RealTimeStudentResponse {





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RealTimeStudentResponse that = (RealTimeStudentResponse) o;
        return Objects.equals(name, that.name) && Objects.equals(rollNo, that.rollNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo);
    }

    @Override
    public String toString() {
        return "RealTimeStudentResponse{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

        public List<String> name;
    public Integer rollNo;


    }








