/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_Product is a concrete class that aggregates PhysicalElements, software (SoftwareIdentity and SoftwareFeatures), Services and/or other Products, and is acquired as a unit. Acquisition implies an agreement between supplier and consumer which may have implications to Product licensing, support and warranty. Non-commercial (e.g., in-house developed Products) should also be identified as an instance of CIM_Product. 
 * Note that software is handled a bit differently in the list of aggregated entities, above. This is because software can be viewed as a tangible asset (similar to PhysicalElements) AND/ OR as a set of features that make up a Product and are deployed. These are two different concepts, usually managed by different units in a business' organization. When software 'features' are described, the CIM_SoftwareFeature class from the Application Model is instantiated (where Features are Weak to/scoped by a Product). When a specific piece of software is acquired and perhaps warrantied as part of a Product, this is addressed by the class, SoftwareIdentity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Product#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Product#getIdentifyingNumber <em>Identifying Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Product#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Product#getVersion <em>Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Product#getSKUNumber <em>SKU Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Product#getWarrantyStartDate <em>Warranty Start Date</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Product#getWarrantyDuration <em>Warranty Duration</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Product#getFamily <em>Family</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Product()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Core::ProductFRU' keys='Name,IdentifyingNumber,Vendor,Version'"
 * @generated
 */
@ProviderType
public interface CIM_Product extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Commonly used Product name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Product_Name()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' MappingStrings='[\"MIF.DMTF|ComponentID|001.2\"]' ModelCorrespondence='[\"PRS_Product.ProductName\"]'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Product#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Identifying Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Product identification such as a serial number on software, a die number on a hardware chip, or (for non-commercial Products) a project number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifying Number</em>' attribute.
	 * @see #setIdentifyingNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Product_IdentifyingNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='64' MappingStrings='[\"MIF.DMTF|ComponentID|001.4\"]'"
	 * @generated
	 */
	String getIdentifyingNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Product#getIdentifyingNumber <em>Identifying Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifying Number</em>' attribute.
	 * @see #getIdentifyingNumber()
	 * @generated
	 */
	void setIdentifyingNumber(String value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the Product's supplier, or entity selling the Product (the manufacturer, reseller, OEM, etc.). Corresponds to the Vendor property in the Product object in the DMTF Solution Exchange Standard.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Product_Vendor()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' MappingStrings='[\"MIF.DMTF|ComponentID|001.1\"]' ModelCorrespondence='[\"PRS_Product.Vendor\"]'"
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Product#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Product version information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Product_Version()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='64' MappingStrings='[\"MIF.DMTF|ComponentID|001.3\"]' ModelCorrespondence='[\"PRS_Product.Version\"]'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Product#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>SKU Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Product SKU (stock keeping unit) information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SKU Number</em>' attribute.
	 * @see #setSKUNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Product_SKUNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64'"
	 * @generated
	 */
	String getSKUNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Product#getSKUNumber <em>SKU Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SKU Number</em>' attribute.
	 * @see #getSKUNumber()
	 * @generated
	 */
	void setSKUNumber(String value);

	/**
	 * Returns the value of the '<em><b>Warranty Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this Product is under warranty, the start date of the warranty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Warranty Start Date</em>' attribute.
	 * @see #setWarrantyStartDate(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Product_WarrantyStartDate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"MIF.DMTF|FRU|002.9\"]' ModelCorrespondence='[\"CIM_Product.WarrantyDuration\"]'"
	 * @generated
	 */
	String getWarrantyStartDate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Product#getWarrantyStartDate <em>Warranty Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warranty Start Date</em>' attribute.
	 * @see #getWarrantyStartDate()
	 * @generated
	 */
	void setWarrantyStartDate(String value);

	/**
	 * Returns the value of the '<em><b>Warranty Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this Product is under warranty, the duration of the warranty in days.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Warranty Duration</em>' attribute.
	 * @see #setWarrantyDuration(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Product_WarrantyDuration()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Days' MappingStrings='[\"MIF.DMTF|FRU|002.10\"]' ModelCorrespondence='[\"CIM_Product.WarrantyStartDate\"]' PUnit='day'"
	 * @generated
	 */
	Long getWarrantyDuration();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Product#getWarrantyDuration <em>Warranty Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warranty Duration</em>' attribute.
	 * @see #getWarrantyDuration()
	 * @generated
	 */
	void setWarrantyDuration(Long value);

	/**
	 * Returns the value of the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Family that the product belongs to. A family refers to a set of products that are similar but not identical from a hardware or software point of view. Typically, a family is composed of different products, which have different configurations and pricing points. Products in the same family often have similar branding and cosmetic features.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Family</em>' attribute.
	 * @see #setFamily(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Product_Family()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64'"
	 * @generated
	 */
	String getFamily();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Product#getFamily <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' attribute.
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(String value);

} // CIM_Product
