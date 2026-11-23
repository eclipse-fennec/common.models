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
 * A representation of the model object '<em><b>CIM Software Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_SoftwareFeature class defines a particular function or capability of a product or application system. This class captures a level of granularity describing a unit of installation, rather than the units that reflect how the product is built or packaged. The latter detail is captured using a CIM_SoftwareElement class. When a SoftwareFeature can exist on multiple platforms or operating systems (for example, a client component of a three tiered client/server application that runs on Solaris, Windows NT, and Windows 95), the Feature is a collection of all the SoftwareElements for these different platforms. In this case, the users of the model must be aware of this situation since typically they will be interested in a sub-collection of the SoftwareElements required for a particular platform. 
 * SoftwareFeatures are always defined in the context of a CIM_Product, using the CIM_ProductSoftwareFeature association. Features are delivered through Products. Optionally, SoftwareFeatures from one or more Products can be organized into ApplicationSystems using the CIM_ApplicationSystemSoftwareFeature association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareFeature#getIdentifyingNumber <em>Identifying Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareFeature#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareFeature#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareFeature#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareFeature()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Application::DeploymentModel' override.Name='string' override.Name.Key='true' override.Name.Description='The Name property defines the unique label by which the SoftwareFeature is identified. This label should be a human-readable name that uniquely identifies the element in the context of the element\'s namespace.' override.Name.MaxLen='256' keys='IdentifyingNumber,ProductName,Vendor,Version,Name'"
 * @generated
 */
@ProviderType
public interface CIM_SoftwareFeature extends CIM_LogicalElement {
	/**
	 * Returns the value of the '<em><b>Identifying Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Product's identification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifying Number</em>' attribute.
	 * @see #setIdentifyingNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareFeature_IdentifyingNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='64' Propagated='CIM_Product.IdentifyingNumber'"
	 * @generated
	 */
	String getIdentifyingNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareFeature#getIdentifyingNumber <em>Identifying Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifying Number</em>' attribute.
	 * @see #getIdentifyingNumber()
	 * @generated
	 */
	void setIdentifyingNumber(String value);

	/**
	 * Returns the value of the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Product's commonly used name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Name</em>' attribute.
	 * @see #setProductName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareFeature_ProductName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_Product.Name'"
	 * @generated
	 */
	String getProductName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareFeature#getProductName <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Name</em>' attribute.
	 * @see #getProductName()
	 * @generated
	 */
	void setProductName(String value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Product's supplier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareFeature_Vendor()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_Product.Vendor'"
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareFeature#getVendor <em>Vendor</em>}' attribute.
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
	 * The scoping Product's version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareFeature_Version()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='64' Propagated='CIM_Product.Version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareFeature#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // CIM_SoftwareFeature
