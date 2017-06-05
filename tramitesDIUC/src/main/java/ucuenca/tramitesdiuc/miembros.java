package ucuenca.tramitesdiuc;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class miembros implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(generator = "MIEMBROS_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "MIEMBROS_ID_GENERATOR", sequenceName = "MIEMBROS_ID_SEQ")
   private java.lang.Long id;

   @javax.persistence.OneToMany(cascade = { javax.persistence.CascadeType.ALL }, fetch = javax.persistence.FetchType.EAGER)
   private java.util.List<ucuenca.tramitesdiuc.miembro> lista_miembros;

   public miembros()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.util.List<ucuenca.tramitesdiuc.miembro> getLista_miembros()
   {
      return this.lista_miembros;
   }

   public void setLista_miembros(
         java.util.List<ucuenca.tramitesdiuc.miembro> lista_miembros)
   {
      this.lista_miembros = lista_miembros;
   }

   public miembros(java.lang.Long id,
         java.util.List<ucuenca.tramitesdiuc.miembro> lista_miembros)
   {
      this.id = id;
      this.lista_miembros = lista_miembros;
   }

}