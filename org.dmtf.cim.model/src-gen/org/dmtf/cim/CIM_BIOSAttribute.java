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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM BIOS Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from ManagedElement that provides instrumentation of BIOS configuration data or Attributes of a managed computer system or device. These attributes are surfaced in the form of BIOSAttribute instances. The CIM_BIOSAttribute object may be used to represent both configurable and static BIOS attributes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BIOSAttribute#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BIOSAttribute#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BIOSAttribute#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BIOSAttribute#getPendingValue <em>Pending Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BIOSAttribute#getIsOrderedList <em>Is Ordered List</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BIOSAttribute#getIsReadOnly <em>Is Read Only</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BIOSAttribute()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::System::BIOS' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following &amp;apos;preferred&amp;apos; algorithm: &lt;OrgID&gt;:&lt;LocalID&gt;Where &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon &amp;apos;:&amp;apos;, and where &lt;OrgID&gt; MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness &lt;OrgID&gt; MUST NOT contain a colon (&amp;apos;:&amp;apos;). When using this algorithm, the first colon to appear in InstanceID MUST appear between &lt;OrgID&gt; and &lt;LocalID&gt;. &lt;LocalID&gt; is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above &amp;apos;preferred&amp;apos; algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance\'s NameSpace. For DMTF defined instances, the &amp;apos;preferred&amp;apos; algorithm MUST be used with the &lt;OrgID&gt; set to &amp;apos;CIM&amp;apos;.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_BIOSAttribute extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string identifying the structured element name for a BIOS attribute using the format "<OrgID>:<identifier>" in which <OrgID>, does contain a colon (":"). The value of <OrgID> is a copyrighted, trademarked or otherwise unique name that is owned by the entity defining the <identifier>, or is a registered ID that is assigned to the entity by a recognized global authority. For DMTF defined identifiers, the <OrgID> is set to 'DMTF' and the <identifier> is specified in the BIOS Attribute Registry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Name</em>' attribute.
	 * @see #setAttributeName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSAttribute_AttributeName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true'"
	 * @generated
	 */
	String getAttributeName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BIOSAttribute#getAttributeName <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Name</em>' attribute.
	 * @see #getAttributeName()
	 * @generated
	 */
	void setAttributeName(String value);

	/**
	 * Returns the value of the '<em><b>Current Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of strings representing the current value or values of the BIOS Attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Value</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSAttribute_CurrentValue()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Required='true'"
	 * @generated
	 */
	EList<String> getCurrentValue();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of strings representing the default value or values of the BIOS Attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSAttribute_DefaultValue()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getDefaultValue();

	/**
	 * Returns the value of the '<em><b>Pending Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of strings representing a pending Attribute value that will not take affect until some point in the future. This would typically be used to represent Attributes that could not be changed until a system reset. When a BIOS attribute has no pending changes, PendingValue SHALL be NULL. PendingValue SHALL have a value of at least one element from the CIM_BIOSEnumeration.PossibleValues array when the an instance of the central class represents an enumeration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pending Value</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSAttribute_PendingValue()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getPendingValue();

	/**
	 * Returns the value of the '<em><b>Is Ordered List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies that the Attribute represented makes up an ordered selection list with elements in the CurrentValue array. The element zero shall be first or least numbered element and incrementally increase to the end of the array. The least or first element may represent the highest priority in the ordered list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Ordered List</em>' attribute.
	 * @see #setIsOrderedList(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSAttribute_IsOrderedList()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_BIOSAttribute.CurrentValue\"]'"
	 * @generated
	 */
	Boolean getIsOrderedList();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BIOSAttribute#getIsOrderedList <em>Is Ordered List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered List</em>' attribute.
	 * @see #getIsOrderedList()
	 * @generated
	 */
	void setIsOrderedList(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies if the underlying system BIOS or BIOSService will not allow the Attribute to be modified through calls tothe methods CIM_BIOSService.SetBIOSAttribute or CIM_BIOSService.SetBIOSDefaults. This does not mean the Attribute can not be modified through other means. Only that the CIM interfaceis not capable of making a change
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSAttribute_IsReadOnly()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsReadOnly();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BIOSAttribute#getIsReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #getIsReadOnly()
	 * @generated
	 */
	void setIsReadOnly(Boolean value);

} // CIM_BIOSAttribute
