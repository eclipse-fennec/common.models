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
 * A representation of the model object '<em><b>CIM FRU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_FRU class is a vendor-defined collection of Products and/or PhysicalElements that is associated with a Product for the purpose of supporting, maintaining or upgrading that Product at the customer's location. FRU is an acronym for 'field replaceable unit'. 
 * The use of FRU has been deprecated in lieu of describing what is a valid replacement part for a piece of hardware (via the ElementFRU association from PhysicalElement to ReplacementFRU) and what has actually been replaced (the ElementHasBeenFRUed association between PhysicalElements).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FRU#getFRUNumber <em>FRU Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FRU#getIdentifyingNumber <em>Identifying Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FRU#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FRU#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FRU#getRevisionLevel <em>Revision Level</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FRU#getCustomerReplaceable <em>Customer Replaceable</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FRU()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_PhysicalElement.Manufacturer\",\"CIM_ReplacementFRU.Vendor\"]' Version='2.45.0' UMLPackagePath='CIM::Core::ProductFRU' override.Description='string' override.Description.Deprecated='[\"CIM_PhysicalElement.Description\",\"CIM_ReplacementFRU.Description\"]' override.Description.Description='A textual description of the FRU.' override.Description.MappingStrings='[\"MIF.DMTF|FRU|002.3\"]' keys='FRUNumber,IdentifyingNumber,Vendor'"
 * @generated
 */
@ProviderType
public interface CIM_FRU extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>FRU Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FRU ordering information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FRU Number</em>' attribute.
	 * @see #setFRUNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FRU_FRUNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_PhysicalElement.PartNumber\",\"CIM_ReplacementFRU.OrderNumber\"]' Key='true' MaxLen='64' MappingStrings='[\"MIF.DMTF|FRU|002.6\"]'"
	 * @generated
	 */
	String getFRUNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FRU#getFRUNumber <em>FRU Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FRU Number</em>' attribute.
	 * @see #getFRUNumber()
	 * @generated
	 */
	void setFRUNumber(String value);

	/**
	 * Returns the value of the '<em><b>Identifying Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FRU identification such as a serial number on software or a die number on a hardware chip.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifying Number</em>' attribute.
	 * @see #setIdentifyingNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FRU_IdentifyingNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_PhysicalElement.SerialNumber\"]' Key='true' MaxLen='64' MappingStrings='[\"MIF.DMTF|FRU|002.7\"]'"
	 * @generated
	 */
	String getIdentifyingNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FRU#getIdentifyingNumber <em>Identifying Number</em>}' attribute.
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
	 * The name of the FRU's supplier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FRU_Vendor()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_PhysicalElement.Manufacturer\",\"CIM_ReplacementFRU.Vendor\"]' Key='true' MaxLen='256' MappingStrings='[\"MIF.DMTF|FRU|002.4\"]'"
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FRU#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FRU name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FRU_Name()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_PhysicalElement.Name\",\"CIM_ReplacementFRU.ElementName\"]' MaxLen='256'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FRU#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Revision Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The FRU's revision level.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Revision Level</em>' attribute.
	 * @see #setRevisionLevel(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FRU_RevisionLevel()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_PhysicalElement.Version\"]' MaxLen='64' MappingStrings='[\"MIF.DMTF|FRU|002.8\"]'"
	 * @generated
	 */
	String getRevisionLevel();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FRU#getRevisionLevel <em>Revision Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Level</em>' attribute.
	 * @see #getRevisionLevel()
	 * @generated
	 */
	void setRevisionLevel(String value);

	/**
	 * Returns the value of the '<em><b>Customer Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the FRU is customer replaceable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Customer Replaceable</em>' attribute.
	 * @see #setCustomerReplaceable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FRU_CustomerReplaceable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_ReplacementFRU.CustomerReplaceable\"]'"
	 * @generated
	 */
	Boolean getCustomerReplaceable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FRU#getCustomerReplaceable <em>Customer Replaceable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Replaceable</em>' attribute.
	 * @see #getCustomerReplaceable()
	 * @generated
	 */
	void setCustomerReplaceable(Boolean value);

} // CIM_FRU
