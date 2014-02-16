package entities;

import entities.Outputs;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-15T18:47:18")
@StaticMetamodel(OutputsTypeValue.class)
public class OutputsTypeValue_ { 

    public static volatile SingularAttribute<OutputsTypeValue, String> typeName;
    public static volatile CollectionAttribute<OutputsTypeValue, Outputs> outputsCollection;
    public static volatile SingularAttribute<OutputsTypeValue, Integer> idOutputsTypeValue;
    public static volatile SingularAttribute<OutputsTypeValue, Date> lastUpdateDate;

}