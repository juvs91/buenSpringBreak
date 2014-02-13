package entities;

import entities.CommDeviceTags;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-05T20:54:11")
@StaticMetamodel(Module.class)
public class Module_ { 

    public static volatile SingularAttribute<Module, Integer> idModule;
    public static volatile SingularAttribute<Module, String> moduleName;
    public static volatile CollectionAttribute<Module, CommDeviceTags> commDeviceTagsCollection;
    public static volatile SingularAttribute<Module, Date> lastUpdateDate;

}