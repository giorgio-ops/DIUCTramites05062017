package ucuenca.tramitesdiuc;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class presupuesto implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(generator = "PRESUPUESTO_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(sequenceName = "PRESUPUESTO_ID_SEQ", name = "PRESUPUESTO_ID_GENERATOR")
   private java.lang.Long id;

   @javax.persistence.OneToMany(cascade = { javax.persistence.CascadeType.ALL }, fetch = javax.persistence.FetchType.EAGER)
   private java.util.List<ucuenca.tramitesdiuc.rubro> rubros;

   private java.lang.String justificacion;

   private java.lang.String presupuesto_reformulado;

   private java.lang.String observaciones;

   private java.util.Date fecha_reformulacion;

   public presupuesto()
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

   public java.util.List<ucuenca.tramitesdiuc.rubro> getRubros()
   {
      return this.rubros;
   }

   public void setRubros(java.util.List<ucuenca.tramitesdiuc.rubro> rubros)
   {
      this.rubros = rubros;
   }

   public java.lang.String getJustificacion()
   {
      return this.justificacion;
   }

   public void setJustificacion(java.lang.String justificacion)
   {
      this.justificacion = justificacion;
   }

   public java.lang.String getPresupuesto_reformulado()
   {
      return this.presupuesto_reformulado;
   }

   public void setPresupuesto_reformulado(java.lang.String presupuesto_reformulado)
   {
      this.presupuesto_reformulado = presupuesto_reformulado;
   }

   public java.lang.String getObservaciones()
   {
      return this.observaciones;
   }

   public void setObservaciones(java.lang.String observaciones)
   {
      this.observaciones = observaciones;
   }

   public java.util.Date getFecha_reformulacion()
   {
      return this.fecha_reformulacion;
   }

   public void setFecha_reformulacion(java.util.Date fecha_reformulacion)
   {
      this.fecha_reformulacion = fecha_reformulacion;
   }

   public presupuesto(java.lang.Long id,
         java.util.List<ucuenca.tramitesdiuc.rubro> rubros,
         java.lang.String justificacion,
         java.lang.String presupuesto_reformulado,
         java.lang.String observaciones, java.util.Date fecha_reformulacion)
   {
      this.id = id;
      this.rubros = rubros;
      this.justificacion = justificacion;
      this.presupuesto_reformulado = presupuesto_reformulado;
      this.observaciones = observaciones;
      this.fecha_reformulacion = fecha_reformulacion;
   }

}