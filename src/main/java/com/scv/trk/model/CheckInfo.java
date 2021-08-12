package com.scv.trk.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class CheckInfo {
    @Getter
    @Setter
    @Id
    @GeneratedValue(generator = "ID_GENERATOR")
    private Long id;

    @Getter
    @Setter
    private LocalDateTime dateTime;

    @Getter
    @Setter
    private String desc;

    @Getter
    @Setter
    private Double value;

    @Getter
    @Setter
    private String comment;

    public CheckInfo() {
    }

    public CheckInfo(CheckInfo checkInfo) {
        this.id = checkInfo.id;
        this.dateTime = checkInfo.dateTime;
        this.desc = checkInfo.desc;
        this.value = checkInfo.value;
        this.comment = checkInfo.comment;
    }

    @Override
    public String toString() {
        return "CheckInfo{" +
                "dateTime=" + dateTime.toString() +
                ", desc='" + desc + '\'' +
                ", value='" + value + '\'' +
                ", comment='" + comment + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if(o == null || getClass() != o.getClass()) {
            return false;
        }

        CheckInfo check = (CheckInfo) o;
        return Objects.equals(id, check.id) &&
                dateTime.isEqual(check.dateTime) &&
                Objects.equals(desc, check.desc) &&
                Objects.equals(value, check.value) &&
                Objects.equals(comment, check.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id,
                this.value,
                this.comment,
                this.desc,
                this.dateTime.toString());
    }
}
