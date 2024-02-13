package org.zerock.b01.dto.upload;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  //게터 세터 정의하기위한 이노테이션씀.
@Builder
@AllArgsConstructor  //생성자!
@NoArgsConstructor   //기본생성자. (디폴트생성자)
public class UploadResultDTO {
    //필드와관련, 바~로 필드로 들어감

    private String uuid;   //필드를 만들거나, DTO니까, 데이터주고받을때 쓰는거니,  업로드니 저장할때 dto가 중요해서 "씀
    private String fileName;
    private boolean img;

    public String getLink(){
        if(img) {
            return "s_" + uuid + "_" + fileName;  //이미지일경우 s붙이고 아니면 그냥그대로,
        }else {
            return uuid+"_"+fileName;
        }
    }
}

//디비저장용!.