package redis.demo2.redisdemo2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class FocusData implements Serializable {

    private Integer id;
    private String Date;

}
