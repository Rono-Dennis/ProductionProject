package c.s.integ.db.engine.model;

import java.util.Set;
import java.util.HashSet;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Version;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.format.annotation.DateTimeFormat;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@Table(name = "report", schema = "public")
public class AlertSettings {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name = "subject", length = 100)
    private String Subject;

    @Column(name = "body")
    private String body;

    @Column(name = "body_sql")
    private String bodySql;

    @Column(name = "attachement_sql")
    private String attachementSql;

    @Column(name = "attachment_name")
    private String attachementName;

    @Column(name = "recepients")
    private String recepients;

    @Column(name = "datasource")
    private String datasource;          //INTEG,ABACUS,MS

    @Column(name = "frequency")
    private String frequency = "@daily";          //@hourly, @daily, @weekly, @monthly, @yearly

    @Column(name = "status", nullable = false)
    private Integer status;

    @Column(name = "is_active")
    private Integer isActive = 1;

    @Column(name = "send_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd MMM yyyy")
    private LocalDateTime sendDate;

    // @JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="id")
    // @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    // @JoinTable(name = "smartbiz_transaction_tag",
    // joinColumns = @JoinColumn(name = "transaction_id"),
    // inverseJoinColumns = @JoinColumn(name = "tag_id"))
    // private Set<Tag> tags = new HashSet<>();

    @Column(name = "insert_date")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd MMM yyyy hh:mm")
    private java.util.Date insertDate;

    
    // @Column(name = "updated_at")
    // @Temporal(TemporalType.TIMESTAMP)
    // @UpdateTimestamp
    // @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd MMM yyyy hh:mm")
    // private java.util.Date updatedAt;

    public AlertSettings(){

        }
           

    public Integer getId() {
      return this.id;
      }

    public void setId(Integer id) {
      this.id = id;
    }

    public String getSubject() {
      return this.Subject;
    }

    public void setSubject(String Subject) {
      this.Subject = Subject;
    }

    public String getBody() {
      return this.body;
    }

    public void setBody(String body) {
      this.body = body;
    }

    public String getBodySql() {
      return this.bodySql;
    }

    public void setBodySql(String bodySql) {
      this.bodySql = bodySql;
    }

    public String getAttachementSql() {
      return this.attachementSql;
    }

    public void setAttachementSql(String attachementSql) {
      this.attachementSql = attachementSql;
    }

    public String getAttachementName() {
      return this.attachementName;
    }

    public void setAttachementName(String attachementName) {
      this.attachementName = attachementName;
    }

    public String getRecepients() {
      return this.recepients;
    }

    public void setRecepients(String recepients) {
      this.recepients = recepients;
    }

    public String getDatasource() {
      return this.datasource;
    }

    public void setDatasource(String datasource) {
      this.datasource = datasource;
    }

    public Integer getStatus() {
      return this.status;
    }

    public void setStatus(Integer status) {
      this.status = status;
    }

    public LocalDateTime getSendDate() {
      return this.sendDate;
    }

    public void setSendDate(LocalDateTime sendDate) {
      this.sendDate = sendDate;
    }

    public java.util.Date getInsertDate() {
      return this.insertDate;
    }

    public void setInsertDate(java.util.Date insertDate) {
      this.insertDate = insertDate;
    }

    public Integer getIsActive() {
      return this.isActive;
    }

    public void setIsActive(Integer isActive) {
      this.isActive = isActive;
    }
    

      
}
