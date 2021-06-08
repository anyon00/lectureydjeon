package lectureydjeon;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;

@Entity
@Table(name="Payment_table")
public class Payment {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long classId;
    private Long courseId;
    private Long fee;
    private String student;
    private String status;
    private String textBook;

    @PostPersist
    public void onPostPersist(){
        PaymentApproved paymentApproved = new PaymentApproved();
        BeanUtils.copyProperties(this, paymentApproved);
        paymentApproved.publishAfterCommit();


    }

    @PostUpdate
    public void onPostUpdate(){
        PaymentCanceled paymentCanceled = new PaymentCanceled();
        BeanUtils.copyProperties(this, paymentCanceled);
        paymentCanceled.publishAfterCommit();


    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }
    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseid) {
        this.courseId = courseid;
    }
    public Long getFee() {
        return fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }
    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getTextBook() {
        return textBook;
    }

    public void setTextBook(String textBook) {
        this.textBook = textBook;
    }




}
