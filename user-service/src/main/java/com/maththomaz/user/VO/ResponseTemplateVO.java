package com.maththomaz.user.VO;

import com.maththomaz.user.entity.User;
import lombok.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ResponseTemplateVO {

    private User user;
    private Department department;
}
