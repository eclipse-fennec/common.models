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
 * A representation of the model object '<em><b>CIM Installed Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The InstalledProduct object allows the grouping of SoftwareFeatures and SoftwareElements that represent the result of the installation of a purchased Product. InstalledProduct is defined to be Weak to a Product. 
 * Often, Products are purchased once but may be installed several times in different locations on one or more systems. All of the SoftwareElements and SoftwareFeatures of a single install are grouped by an instance of InstalledProduct. These are defined using the associations, CollectedSoftwareFeatures and Collected SoftwareElements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_InstalledProduct#getProductIdentifyingNumber <em>Product Identifying Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_InstalledProduct#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_InstalledProduct#getProductVendor <em>Product Vendor</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_InstalledProduct#getProductVersion <em>Product Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_InstalledProduct#getSystemID <em>System ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_InstalledProduct#getCollectionID <em>Collection ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_InstalledProduct#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_InstalledProduct()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Application::InstalledProduct' keys='ProductIdentifyingNumber,ProductName,ProductVendor,ProductVersion,SystemID,CollectionID'"
 * @generated
 */
@ProviderType
public interface CIM_InstalledProduct extends CIM_Collection {
	/**
	 * Returns the value of the '<em><b>Product Identifying Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Product's identification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Identifying Number</em>' attribute.
	 * @see #setProductIdentifyingNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_InstalledProduct_ProductIdentifyingNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='64' Propagated='CIM_Product.IdentifyingNumber'"
	 * @generated
	 */
	String getProductIdentifyingNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InstalledProduct#getProductIdentifyingNumber <em>Product Identifying Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Identifying Number</em>' attribute.
	 * @see #getProductIdentifyingNumber()
	 * @generated
	 */
	void setProductIdentifyingNumber(String value);

	/**
	 * Returns the value of the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Product's commonly used name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Name</em>' attribute.
	 * @see #setProductName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_InstalledProduct_ProductName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_Product.Name'"
	 * @generated
	 */
	String getProductName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InstalledProduct#getProductName <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Name</em>' attribute.
	 * @see #getProductName()
	 * @generated
	 */
	void setProductName(String value);

	/**
	 * Returns the value of the '<em><b>Product Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Product's name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Vendor</em>' attribute.
	 * @see #setProductVendor(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_InstalledProduct_ProductVendor()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_Product.Vendor'"
	 * @generated
	 */
	String getProductVendor();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InstalledProduct#getProductVendor <em>Product Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Vendor</em>' attribute.
	 * @see #getProductVendor()
	 * @generated
	 */
	void setProductVendor(String value);

	/**
	 * Returns the value of the '<em><b>Product Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Product's version information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Version</em>' attribute.
	 * @see #setProductVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_InstalledProduct_ProductVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='64' Propagated='CIM_Product.Version'"
	 * @generated
	 */
	String getProductVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InstalledProduct#getProductVersion <em>Product Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Version</em>' attribute.
	 * @see #getProductVersion()
	 * @generated
	 */
	void setProductVersion(String value);

	/**
	 * Returns the value of the '<em><b>System ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifying information of the System (ie, the instance) on which the Product is installed. If the System is not known, this property returns NULL. If the System is known and represented in CIM, the property contains the namespace and model paths of the instance, encoded as a string parameter. If known but not represented in CIM, the property contains some identifying string that names the System on which the Product is installed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System ID</em>' attribute.
	 * @see #setSystemID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_InstalledProduct_SystemID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getSystemID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InstalledProduct#getSystemID <em>System ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System ID</em>' attribute.
	 * @see #getSystemID()
	 * @generated
	 */
	void setSystemID(String value);

	/**
	 * Returns the value of the '<em><b>Collection ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identification of the InstalledProduct object. This key can be used to differentiate between Product installations and could include the installation location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collection ID</em>' attribute.
	 * @see #setCollectionID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_InstalledProduct_CollectionID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCollectionID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InstalledProduct#getCollectionID <em>Collection ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection ID</em>' attribute.
	 * @see #getCollectionID()
	 * @generated
	 */
	void setCollectionID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Name property defines the label by which the object is known to the world, outside the data processing system. This label is a human-readable name that uniquely identifies the element in the context of the element's namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_InstalledProduct_Name()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InstalledProduct#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CIM_InstalledProduct
