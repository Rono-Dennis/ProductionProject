/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c.s.docs.model;

import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author John.Simiyu
 */
@Setter
@Getter
public class ClaimVisitStarts {
    private Date minVisitStart;
    private Date maxVisitStart;
    private Boolean sameDay;
    
}


