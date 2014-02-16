package entities;

import entities.Outputs;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-15T20:52:08")
@StaticMetamodel(OutputOriginType.class)
public class OutputOriginType_ { 

    public static volatile SingularAttribute<OutputOriginType, Integer> idOutputOriginType;
    public static volatile SingularAttribute<OutputOriginType, String> originTypeName;
    public static volatile CollectionAttribute<OutputOriginType, Outputs> outputsCollection;
    public static volatile SingularAttribute<OutputOriginType, Date> lastUpdateDate;

}