import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.Destroyed;
import javax.enterprise.context.Initialized;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Instance;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Specializes;
import javax.enterprise.inject.Typed;
import javax.enterprise.inject.Vetoed;
import javax.enterprise.util.AnnotationLiteral;
import javax.enterprise.util.Nonbinding;
import javax.inject.Inject;

public class AnnotationLiterals {

    @Any
    @Inject
    private Instance<HelloService> services;

    //@formatter:off
    public void literals() {
        AnnotationLiteral[] literals = {
            Any.Literal.INSTANCE,
            Default.Literal.INSTANCE,
            New.Literal.INSTANCE,
            Specializes.Literal.INSTANCE,
            Vetoed.Literal.INSTANCE,
            Nonbinding.Literal.INSTANCE,
            Initialized.Literal.REQUEST,
            Initialized.Literal.CONVERSATION,
            Initialized.Literal.SESSION,
            Initialized.Literal.APPLICATION,
            Destroyed.Literal.REQUEST,
            Destroyed.Literal.CONVERSATION,
            Destroyed.Literal.SESSION,
            Destroyed.Literal.APPLICATION,
            RequestScoped.Literal.INSTANCE,
            SessionScoped.Literal.INSTANCE,
            ApplicationScoped.Literal.INSTANCE,
            Dependent.Literal.INSTANCE,
            ConversationScoped.Literal.INSTANCE,
            Alternative.Literal.INSTANCE,
            Typed.Literal.INSTANCE,
            Typed.Literal.of(new Class[]{HelloService.class})
        };
        services.select(literals).get();
    }
    //@formatter:on

}
