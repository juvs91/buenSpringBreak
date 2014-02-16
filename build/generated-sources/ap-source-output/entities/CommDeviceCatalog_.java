package entities;

import entities.CommDeviceTags;
import entities.CommDeviceType;
import entities.CommProtocol;
import entities.CommType;
import entities.Company;
import entities.OutputType;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-15T20:52:08")
@StaticMetamodel(CommDeviceCatalog.class)
public class CommDeviceCatalog_ { 

    public static volatile SingularAttribute<CommDeviceCatalog, Integer> idCommDeviceCatalog;
    public static volatile SingularAttribute<CommDeviceCatalog, Company> idCompany;
    public static volatile SingularAttribute<CommDeviceCatalog, CommDeviceType> idCommDeviceType;
    public static volatile SingularAttribute<CommDeviceCatalog, String> serialNumber;
    public static volatile SingularAttribute<CommDeviceCatalog, Boolean> active;
    public static volatile SingularAttribute<CommDeviceCatalog, OutputType> idOutputType;
    public static volatile SingularAttribute<CommDeviceCatalog, CommType> idCommType;
    public static volatile CollectionAttribute<CommDeviceCatalog, CommDeviceTags> commDeviceTagsCollection;
    public static volatile SingularAttribute<CommDeviceCatalog, CommProtocol> idCommProtocol;
    public static volatile SingularAttribute<CommDeviceCatalog, String> reference;
    public static volatile SingularAttribute<CommDeviceCatalog, Date> lastUpdateDate;

}