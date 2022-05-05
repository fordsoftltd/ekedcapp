/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author odofintimothy
 */
@Entity
@Table(name = "building")
@Data
public class Building implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "ancillaryrole")
    private String ancillaryrole;
    @Column(name = "enabled")
    private String enabled;
    @Column(name = "feederid")
    private String feederid;
    @Column(name = "feederid2")
    private String feederid2;
    @Column(name = "feederinfo")
    private String feederinfo;
    @Column(name = "electrictraceweight")
    private String electrictraceweight;
    @Column(name = "creationuser")
    private String creationuser;
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "datemodified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datemodified;
    @Column(name = "lastuser")
    private String lastuser;
    @Column(name = "datasource")
    private String datasource;
    @Lob
    @Column(name = "comments")
    private String comments;
    @Column(name = "locationid")
    private String locationid;
    @Column(name = "hyperlink")
    private String hyperlink;
    @Column(name = "subtypecd")
    private String subtypecd;
    @Column(name = "consultant")
    private String consultant;
    @Column(name = "contractor")
    private String contractor;
    @Column(name = "installationdate")
    private String installationdate;
    @Column(name = "energizationdate")
    private String energizationdate;

    @Column(name = "lastmaintenancedate")
    private String lastmaintenancedate;
    @Column(name = "status")
    private String status;
    @Column(name = "facilityid")
    private String facilityid;
    @Column(name = "phasedesignation")
    private String phasedesignation;
    @Column(name = "connectiontype")
    private String connectiontype;
    @Column(name = "cutoutsize")
    private String cutoutsize;
    @Column(name = "demanddkw")
    private String demanddkw;
    @Column(name = "voltagelevelkv")
    private String voltagelevelkv;
    @Column(name = "address")
    private String address;
    @Column(name = "servicecurrentrating")
    private String servicecurrentrating;
    @Column(name = "operatingvoltage")
    private String operatingvoltage;
    @Column(name = "symbolrotation")
    private String symbolrotation;
    @Column(name = "customerrelationid")
    private String customerrelationid;
    @Column(name = "edservicepointoid")
    private String edservicepointoid;
    @Column(name = "cableupriserid")
    private String cableupriserid;
    @Column(name = "ltpoleid")
    private String ltpoleid;
    @Column(name = "servicewireno")
    private String servicewireno;
    @Column(name = "transformername")
    private String transformername;
    @Column(name = "districtcode")
    private String districtcode;
    @Column(name = "feedercode")
    private String feedercode;
    @Column(name = "bldcode")
    private String bldcode;
    @Column(name = "bldcodefinal")
    private String bldcodefinal;
    @Column(name = "objectid")
    private String objectid;
    private String building_code_updated;
    private String longitude;
    private String latitude;
    private String feedername;
    private String buname;
    private String dtno;
    private String field;
    private Boolean done;
    private Integer doneby;
    private String capturename;
    private String capturedate;
    private String conntype;
    private String srvwiresize;
    private String srv_wire_no;
    private String bldgusage;
    private String bldgid;
    private String ht_pole_id;
    private String upriserno;
    private String buildingstatus;
    private String buildingtype;
    private String houseno;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "donedate")
    private Date donedate;

    public Building() {
    }


    public Building(Long id) {
        this.id = id;
    }

}
