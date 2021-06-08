
package lectureydjeon;

public class CounselRegistered extends AbstractEvent {

    private Long id;
    private String memo;
    private Long courseId;
    private Long classId;
    private String name;
    private String customerType;
    private String counselType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }
    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
    public String getCounselType() {
        return counselType;
    }

    public void setCounselType(String counselType) {
        this.counselType = counselType;
    }
}

