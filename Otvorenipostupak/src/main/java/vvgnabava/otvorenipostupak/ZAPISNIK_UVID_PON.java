package vvgnabava.otvorenipostupak;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("ZAPISNIK UVID PONUDE")
@org.kie.api.definition.type.Description("Zapisnik o uvidu u ponude. Kreira se za pojedinu pravnu osobu koja je došla na pregled")
public class ZAPISNIK_UVID_PON implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "id_zapisnika")
   private java.lang.String id_zapisnika;
   @org.kie.api.definition.type.Description(value = "Mo\u017Ee biti naveden ponu\u0111a\u010D ili osoba")
   @org.kie.api.definition.type.Label(value = "pravna_osoba")
   private java.lang.String pravna_osoba;
   @org.kie.api.definition.type.Label(value = "datum")
   private java.util.Date datum;
   @org.kie.api.definition.type.Label(value = "opis")
   private java.lang.String opis;

   public ZAPISNIK_UVID_PON()
   {
   }

   public java.lang.String getId_zapisnika()
   {
      return this.id_zapisnika;
   }

   public void setId_zapisnika(java.lang.String id_zapisnika)
   {
      this.id_zapisnika = id_zapisnika;
   }

   public java.lang.String getPravna_osoba()
   {
      return this.pravna_osoba;
   }

   public void setPravna_osoba(java.lang.String pravna_osoba)
   {
      this.pravna_osoba = pravna_osoba;
   }

   public java.util.Date getDatum()
   {
      return this.datum;
   }

   public void setDatum(java.util.Date datum)
   {
      this.datum = datum;
   }

   public java.lang.String getOpis()
   {
      return this.opis;
   }

   public void setOpis(java.lang.String opis)
   {
      this.opis = opis;
   }

   public ZAPISNIK_UVID_PON(java.lang.String id_zapisnika,
         java.lang.String pravna_osoba, java.util.Date datum,
         java.lang.String opis)
   {
      this.id_zapisnika = id_zapisnika;
      this.pravna_osoba = pravna_osoba;
      this.datum = datum;
      this.opis = opis;
   }

}