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
 * A representation of the model object '<em><b>CIM Replacement FRU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ReplacementFRU class defines ordering information for replacement hardware or PhysicalElements. The element or elements that can be replaced are defined using the ElementFRU association. If a FRU is made up of other more specific parts, then this association can be described by instantiating the ConcreteComponent relationship between the grouping FRU and its parts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ReplacementFRU#getOrderNumber <em>Order Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplacementFRU#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplacementFRU#getCustomerReplaceable <em>Customer Replaceable</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ReplacementFRU()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Core::Physical' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. To ensure uniqueness within the NameSpace, the value of InstanceID should be constructed using the following \'preferred\' algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon \':\', and where &lt;OrgID&gt; must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority. (This requirement is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness &lt;OrgID&gt; must not contain a colon (\':\'). When using this algorithm, the first colon to appear in InstanceID must appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and should not be reused to identify different underlying (real-world) elements. If the above \'preferred\' algorithm is not used, the defining entity must assure that the resulting InstanceID is not reused across any InstanceIDs produced by this or other providers for the NameSpace of this instance. \nFor DMTF-defined instances, the \'preferred\' algorithm must be used with the &lt;OrgID&gt; set to \'CIM\'.' override.Description='string' override.Description.Description='A textual description of the replacement.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ReplacementFRU extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Replacement ordering information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Number</em>' attribute.
	 * @see #setOrderNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplacementFRU_OrderNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getOrderNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplacementFRU#getOrderNumber <em>Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Number</em>' attribute.
	 * @see #getOrderNumber()
	 * @generated
	 */
	void setOrderNumber(String value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the vendor or supplier in whose context the OrderNumber is defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplacementFRU_Vendor()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplacementFRU#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(String value);

	/**
	 * Returns the value of the '<em><b>Customer Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether this replacement part is considered customer replaceable (TRUE) or not (FALSE).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Customer Replaceable</em>' attribute.
	 * @see #setCustomerReplaceable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplacementFRU_CustomerReplaceable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getCustomerReplaceable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplacementFRU#getCustomerReplaceable <em>Customer Replaceable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Replaceable</em>' attribute.
	 * @see #getCustomerReplaceable()
	 * @generated
	 */
	void setCustomerReplaceable(Boolean value);

} // CIM_ReplacementFRU
