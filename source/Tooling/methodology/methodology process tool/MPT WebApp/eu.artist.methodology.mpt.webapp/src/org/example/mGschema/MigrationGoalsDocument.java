/*******************************************************************************
 *  Copyright (c) 2014 Institute of Communication and Computer Systems (ICCS) - National Technical University of Athens (NTUA)
 *
 *  Licensed under the MIT license:
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 *
 * Contributors: Kleopatra Konstanteli
 * 				 Liagouras Georgios Andreas
 *  Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
/*
 * An XML document type.
 * Localname: MigrationGoals
 * Namespace: http://www.example.org/MGschema
 * Java type: org.example.mGschema.MigrationGoalsDocument
 *
 * Automatically generated - do not modify.
 */
package org.example.mGschema;


/**
 * A document containing one MigrationGoals(@http://www.example.org/MGschema) element.
 *
 * This is a complex type.
 */
public interface MigrationGoalsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MigrationGoalsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25740ADC6CCF21E436F914401062A07B").resolveHandle("migrationgoals2dbedoctype");
    
    /**
     * Gets the "MigrationGoals" element
     */
    org.example.mGschema.MigrationGoalsDocument.MigrationGoals getMigrationGoals();
    
    /**
     * Sets the "MigrationGoals" element
     */
    void setMigrationGoals(org.example.mGschema.MigrationGoalsDocument.MigrationGoals migrationGoals);
    
    /**
     * Appends and returns a new empty "MigrationGoals" element
     */
    org.example.mGschema.MigrationGoalsDocument.MigrationGoals addNewMigrationGoals();
    
    /**
     * An XML MigrationGoals(@http://www.example.org/MGschema).
     *
     * This is a complex type.
     */
    public interface MigrationGoals extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MigrationGoals.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25740ADC6CCF21E436F914401062A07B").resolveHandle("migrationgoalsd030elemtype");
        
        /**
         * Gets the "TechnicalGoals" element
         */
        org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals getTechnicalGoals();
        
        /**
         * Sets the "TechnicalGoals" element
         */
        void setTechnicalGoals(org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals technicalGoals);
        
        /**
         * Appends and returns a new empty "TechnicalGoals" element
         */
        org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals addNewTechnicalGoals();
        
        /**
         * Gets the "Business" element
         */
        org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business getBusiness();
        
        /**
         * Sets the "Business" element
         */
        void setBusiness(org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business business);
        
        /**
         * Appends and returns a new empty "Business" element
         */
        org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business addNewBusiness();
        
        /**
         * An XML TechnicalGoals(@http://www.example.org/MGschema).
         *
         * This is a complex type.
         */
        public interface TechnicalGoals extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TechnicalGoals.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25740ADC6CCF21E436F914401062A07B").resolveHandle("technicalgoalsbd8felemtype");
            
            /**
             * Gets the "a_p" element
             */
            org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.AP getAP();
            
            /**
             * Sets the "a_p" element
             */
            void setAP(org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.AP ap);
            
            /**
             * Appends and returns a new empty "a_p" element
             */
            org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.AP addNewAP();
            
            /**
             * Gets the "SLA" element
             */
            org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.SLA getSLA();
            
            /**
             * Sets the "SLA" element
             */
            void setSLA(org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.SLA sla);
            
            /**
             * Appends and returns a new empty "SLA" element
             */
            org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.SLA addNewSLA();
            
            /**
             * Gets the "u_c" element
             */
            org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.UC getUC();
            
            /**
             * Sets the "u_c" element
             */
            void setUC(org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.UC uc);
            
            /**
             * Appends and returns a new empty "u_c" element
             */
            org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.UC addNewUC();
            
            /**
             * Gets the "iaas" element
             */
            org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Iaas getIaas();
            
            /**
             * Sets the "iaas" element
             */
            void setIaas(org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Iaas iaas);
            
            /**
             * Appends and returns a new empty "iaas" element
             */
            org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Iaas addNewIaas();
            
            /**
             * Gets the "interop" element
             */
            org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Interop getInterop();
            
            /**
             * Sets the "interop" element
             */
            void setInterop(org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Interop interop);
            
            /**
             * Appends and returns a new empty "interop" element
             */
            org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Interop addNewInterop();
            
            /**
             * An XML a_p(@http://www.example.org/MGschema).
             *
             * This is a complex type.
             */
            public interface AP extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AP.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25740ADC6CCF21E436F914401062A07B").resolveHandle("apa851elemtype");
                
                /**
                 * Gets the "migratedpl" element
                 */
                java.lang.String getMigratedpl();
                
                /**
                 * Gets (as xml) the "migratedpl" element
                 */
                org.apache.xmlbeans.XmlString xgetMigratedpl();
                
                /**
                 * Sets the "migratedpl" element
                 */
                void setMigratedpl(java.lang.String migratedpl);
                
                /**
                 * Sets (as xml) the "migratedpl" element
                 */
                void xsetMigratedpl(org.apache.xmlbeans.XmlString migratedpl);
                
                /**
                 * Gets the "multitenancy" element
                 */
                java.lang.String getMultitenancy();
                
                /**
                 * Gets (as xml) the "multitenancy" element
                 */
                org.apache.xmlbeans.XmlString xgetMultitenancy();
                
                /**
                 * Sets the "multitenancy" element
                 */
                void setMultitenancy(java.lang.String multitenancy);
                
                /**
                 * Sets (as xml) the "multitenancy" element
                 */
                void xsetMultitenancy(org.apache.xmlbeans.XmlString multitenancy);
                
                /**
                 * Gets the "tdatabasereq" element
                 */
                java.lang.String getTdatabasereq();
                
                /**
                 * Gets (as xml) the "tdatabasereq" element
                 */
                org.apache.xmlbeans.XmlString xgetTdatabasereq();
                
                /**
                 * Sets the "tdatabasereq" element
                 */
                void setTdatabasereq(java.lang.String tdatabasereq);
                
                /**
                 * Sets (as xml) the "tdatabasereq" element
                 */
                void xsetTdatabasereq(org.apache.xmlbeans.XmlString tdatabasereq);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.AP newInstance() {
                      return (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.AP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.AP newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.AP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML SLA(@http://www.example.org/MGschema).
             *
             * This is a complex type.
             */
            public interface SLA extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SLA.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25740ADC6CCF21E436F914401062A07B").resolveHandle("sla8f9belemtype");
                
                /**
                 * Gets the "reliability" element
                 */
                byte getReliability();
                
                /**
                 * Gets (as xml) the "reliability" element
                 */
                org.apache.xmlbeans.XmlByte xgetReliability();
                
                /**
                 * Sets the "reliability" element
                 */
                void setReliability(byte reliability);
                
                /**
                 * Sets (as xml) the "reliability" element
                 */
                void xsetReliability(org.apache.xmlbeans.XmlByte reliability);
                
                /**
                 * Gets the "datalocation" element
                 */
                java.lang.String getDatalocation();
                
                /**
                 * Gets (as xml) the "datalocation" element
                 */
                org.apache.xmlbeans.XmlString xgetDatalocation();
                
                /**
                 * Sets the "datalocation" element
                 */
                void setDatalocation(java.lang.String datalocation);
                
                /**
                 * Sets (as xml) the "datalocation" element
                 */
                void xsetDatalocation(org.apache.xmlbeans.XmlString datalocation);
                
                /**
                 * Gets the "responset" element
                 */
                float getResponset();
                
                /**
                 * Gets (as xml) the "responset" element
                 */
                org.apache.xmlbeans.XmlFloat xgetResponset();
                
                /**
                 * Sets the "responset" element
                 */
                void setResponset(float responset);
                
                /**
                 * Sets (as xml) the "responset" element
                 */
                void xsetResponset(org.apache.xmlbeans.XmlFloat responset);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.SLA newInstance() {
                      return (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.SLA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.SLA newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.SLA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML u_c(@http://www.example.org/MGschema).
             *
             * This is a complex type.
             */
            public interface UC extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UC.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25740ADC6CCF21E436F914401062A07B").resolveHandle("uc11eaelemtype");
                
                /**
                 * Gets the "configreq" element
                 */
                java.lang.String getConfigreq();
                
                /**
                 * Gets (as xml) the "configreq" element
                 */
                org.apache.xmlbeans.XmlString xgetConfigreq();
                
                /**
                 * Sets the "configreq" element
                 */
                void setConfigreq(java.lang.String configreq);
                
                /**
                 * Sets (as xml) the "configreq" element
                 */
                void xsetConfigreq(org.apache.xmlbeans.XmlString configreq);
                
                /**
                 * Gets the "authorreq" element
                 */
                java.lang.String getAuthorreq();
                
                /**
                 * Gets (as xml) the "authorreq" element
                 */
                org.apache.xmlbeans.XmlString xgetAuthorreq();
                
                /**
                 * Sets the "authorreq" element
                 */
                void setAuthorreq(java.lang.String authorreq);
                
                /**
                 * Sets (as xml) the "authorreq" element
                 */
                void xsetAuthorreq(org.apache.xmlbeans.XmlString authorreq);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.UC newInstance() {
                      return (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.UC) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.UC newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.UC) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML iaas(@http://www.example.org/MGschema).
             *
             * This is a complex type.
             */
            public interface Iaas extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Iaas.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25740ADC6CCF21E436F914401062A07B").resolveHandle("iaasf7e9elemtype");
                
                /**
                 * Gets the "targetplat" element
                 */
                java.lang.String getTargetplat();
                
                /**
                 * Gets (as xml) the "targetplat" element
                 */
                org.apache.xmlbeans.XmlString xgetTargetplat();
                
                /**
                 * Sets the "targetplat" element
                 */
                void setTargetplat(java.lang.String targetplat);
                
                /**
                 * Sets (as xml) the "targetplat" element
                 */
                void xsetTargetplat(org.apache.xmlbeans.XmlString targetplat);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Iaas newInstance() {
                      return (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Iaas) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Iaas newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Iaas) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML interop(@http://www.example.org/MGschema).
             *
             * This is a complex type.
             */
            public interface Interop extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Interop.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25740ADC6CCF21E436F914401062A07B").resolveHandle("interop92c6elemtype");
                
                /**
                 * Gets the "interopreq" element
                 */
                java.lang.String getInteropreq();
                
                /**
                 * Gets (as xml) the "interopreq" element
                 */
                org.apache.xmlbeans.XmlString xgetInteropreq();
                
                /**
                 * Sets the "interopreq" element
                 */
                void setInteropreq(java.lang.String interopreq);
                
                /**
                 * Sets (as xml) the "interopreq" element
                 */
                void xsetInteropreq(org.apache.xmlbeans.XmlString interopreq);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Interop newInstance() {
                      return (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Interop) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Interop newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals.Interop) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals newInstance() {
                  return (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.TechnicalGoals) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Business(@http://www.example.org/MGschema).
         *
         * This is a complex type.
         */
        public interface Business extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Business.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25740ADC6CCF21E436F914401062A07B").resolveHandle("businessd5acelemtype");
            
            /**
             * Gets the "mon" element
             */
            org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Mon getMon();
            
            /**
             * Sets the "mon" element
             */
            void setMon(org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Mon mon);
            
            /**
             * Appends and returns a new empty "mon" element
             */
            org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Mon addNewMon();
            
            /**
             * Gets the "use" element
             */
            org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Use getUse();
            
            /**
             * Sets the "use" element
             */
            void setUse(org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Use use);
            
            /**
             * Appends and returns a new empty "use" element
             */
            org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Use addNewUse();
            
            /**
             * Gets the "bil" element
             */
            org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Bil getBil();
            
            /**
             * Sets the "bil" element
             */
            void setBil(org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Bil bil);
            
            /**
             * Appends and returns a new empty "bil" element
             */
            org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Bil addNewBil();
            
            /**
             * Gets the "pro" element
             */
            org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Pro getPro();
            
            /**
             * Sets the "pro" element
             */
            void setPro(org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Pro pro);
            
            /**
             * Appends and returns a new empty "pro" element
             */
            org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Pro addNewPro();
            
            /**
             * An XML mon(@http://www.example.org/MGschema).
             *
             * This is a complex type.
             */
            public interface Mon extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Mon.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25740ADC6CCF21E436F914401062A07B").resolveHandle("monc134elemtype");
                
                /**
                 * Gets the "measur_elem" element
                 */
                java.lang.String getMeasurElem();
                
                /**
                 * Gets (as xml) the "measur_elem" element
                 */
                org.apache.xmlbeans.XmlString xgetMeasurElem();
                
                /**
                 * Sets the "measur_elem" element
                 */
                void setMeasurElem(java.lang.String measurElem);
                
                /**
                 * Sets (as xml) the "measur_elem" element
                 */
                void xsetMeasurElem(org.apache.xmlbeans.XmlString measurElem);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Mon newInstance() {
                      return (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Mon) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Mon newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Mon) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML use(@http://www.example.org/MGschema).
             *
             * This is a complex type.
             */
            public interface Use extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Use.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25740ADC6CCF21E436F914401062A07B").resolveHandle("use9a99elemtype");
                
                /**
                 * Gets the "wai" element
                 */
                java.lang.String getWai();
                
                /**
                 * Gets (as xml) the "wai" element
                 */
                org.apache.xmlbeans.XmlString xgetWai();
                
                /**
                 * Sets the "wai" element
                 */
                void setWai(java.lang.String wai);
                
                /**
                 * Sets (as xml) the "wai" element
                 */
                void xsetWai(org.apache.xmlbeans.XmlString wai);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Use newInstance() {
                      return (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Use) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Use newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Use) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML bil(@http://www.example.org/MGschema).
             *
             * This is a complex type.
             */
            public interface Bil extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Bil.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25740ADC6CCF21E436F914401062A07B").resolveHandle("bil6fdbelemtype");
                
                /**
                 * Gets the "rule" element
                 */
                java.lang.String getRule();
                
                /**
                 * Gets (as xml) the "rule" element
                 */
                org.apache.xmlbeans.XmlString xgetRule();
                
                /**
                 * Sets the "rule" element
                 */
                void setRule(java.lang.String rule);
                
                /**
                 * Sets (as xml) the "rule" element
                 */
                void xsetRule(org.apache.xmlbeans.XmlString rule);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Bil newInstance() {
                      return (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Bil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Bil newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Bil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML pro(@http://www.example.org/MGschema).
             *
             * This is a complex type.
             */
            public interface Pro extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pro.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s25740ADC6CCF21E436F914401062A07B").resolveHandle("proeb33elemtype");
                
                /**
                 * Gets the "license_mod" element
                 */
                java.lang.String getLicenseMod();
                
                /**
                 * Gets (as xml) the "license_mod" element
                 */
                org.apache.xmlbeans.XmlString xgetLicenseMod();
                
                /**
                 * Sets the "license_mod" element
                 */
                void setLicenseMod(java.lang.String licenseMod);
                
                /**
                 * Sets (as xml) the "license_mod" element
                 */
                void xsetLicenseMod(org.apache.xmlbeans.XmlString licenseMod);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Pro newInstance() {
                      return (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Pro) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Pro newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business.Pro) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business newInstance() {
                  return (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.example.mGschema.MigrationGoalsDocument.MigrationGoals.Business) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.example.mGschema.MigrationGoalsDocument.MigrationGoals newInstance() {
              return (org.example.mGschema.MigrationGoalsDocument.MigrationGoals) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.example.mGschema.MigrationGoalsDocument.MigrationGoals newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.example.mGschema.MigrationGoalsDocument.MigrationGoals) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.example.mGschema.MigrationGoalsDocument newInstance() {
          return (org.example.mGschema.MigrationGoalsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.example.mGschema.MigrationGoalsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.example.mGschema.MigrationGoalsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.example.mGschema.MigrationGoalsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.example.mGschema.MigrationGoalsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.example.mGschema.MigrationGoalsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.example.mGschema.MigrationGoalsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.example.mGschema.MigrationGoalsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.example.mGschema.MigrationGoalsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.example.mGschema.MigrationGoalsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.example.mGschema.MigrationGoalsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.example.mGschema.MigrationGoalsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.example.mGschema.MigrationGoalsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.example.mGschema.MigrationGoalsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.example.mGschema.MigrationGoalsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.example.mGschema.MigrationGoalsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.example.mGschema.MigrationGoalsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.example.mGschema.MigrationGoalsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.example.mGschema.MigrationGoalsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.example.mGschema.MigrationGoalsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.example.mGschema.MigrationGoalsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.example.mGschema.MigrationGoalsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.example.mGschema.MigrationGoalsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.example.mGschema.MigrationGoalsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.example.mGschema.MigrationGoalsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.example.mGschema.MigrationGoalsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.example.mGschema.MigrationGoalsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.example.mGschema.MigrationGoalsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.example.mGschema.MigrationGoalsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.example.mGschema.MigrationGoalsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.example.mGschema.MigrationGoalsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.example.mGschema.MigrationGoalsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.example.mGschema.MigrationGoalsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.example.mGschema.MigrationGoalsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.example.mGschema.MigrationGoalsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
