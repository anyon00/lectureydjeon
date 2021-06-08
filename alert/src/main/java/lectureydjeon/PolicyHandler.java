package lectureydjeon;

import lectureydjeon.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPaymentCanceled_SendSms(@Payload PaymentCanceled paymentCanceled){

        if(!paymentCanceled.validate()) return;

        System.out.println("\n\n##### listener SendSms : " + paymentCanceled.toJson() + "\n\n");

        // Sample Logic //
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPaymentApproved_SendSms(@Payload PaymentApproved paymentApproved){

        if(!paymentApproved.validate()) return;

        System.out.println("\n\n##### listener SendSms : " + paymentApproved.toJson() + "\n\n");

        // Sample Logic //
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCourseRegistered_SendSms(@Payload CourseRegistered courseRegistered){

        if(!courseRegistered.validate()) return;

        System.out.println("\n\n##### listener SendSms : " + courseRegistered.toJson() + "\n\n");

        // Sample Logic //
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverTextbookDeliveried_SendSms(@Payload TextbookDeliveried textbookDeliveried){

        if(!textbookDeliveried.validate()) return;

        System.out.println("\n\n##### listener SendSms : " + textbookDeliveried.toJson() + "\n\n");

        // Sample Logic //
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverClassModified_SendSms(@Payload ClassModified classModified){

        if(!classModified.validate()) return;

        System.out.println("\n\n##### listener SendSms : " + classModified.toJson() + "\n\n");

        // Sample Logic //
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCourseModified_SendSms(@Payload CourseModified courseModified){

        if(!courseModified.validate()) return;

        System.out.println("\n\n##### listener SendSms : " + courseModified.toJson() + "\n\n");

        // Sample Logic //
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCourseDeleted_SendSms(@Payload CourseDeleted courseDeleted){

        if(!courseDeleted.validate()) return;

        System.out.println("\n\n##### listener SendSms : " + courseDeleted.toJson() + "\n\n");

        // Sample Logic //
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCounselRegistered_SendSms(@Payload CounselRegistered counselRegistered){

        if(!counselRegistered.validate()) return;

        System.out.println("\n\n##### listener SendSms : " + counselRegistered.toJson() + "\n\n");

        // Sample Logic //
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCounselModiied_SendSms(@Payload CounselModiied counselModiied){

        if(!counselModiied.validate()) return;

        System.out.println("\n\n##### listener SendSms : " + counselModiied.toJson() + "\n\n");

        // Sample Logic //
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCounselDelete_SendSms(@Payload CounselDelete counselDelete){

        if(!counselDelete.validate()) return;

        System.out.println("\n\n##### listener SendSms : " + counselDelete.toJson() + "\n\n");

        // Sample Logic //
            
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}


}
