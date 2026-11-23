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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Managed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ManagedElement is an abstract class that provides a common superclass (or top of the inheritance tree) for the non-association classes in the CIM Schema.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ManagedElement#getInstanceID <em>Instance ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ManagedElement#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ManagedElement#getDescription <em>Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ManagedElement#getElementName <em>Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ManagedElement#getGeneration <em>Generation</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ManagedElement()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.45.0' UMLPackagePath='CIM::Core::CoreElements'"
 * @generated
 */
@ProviderType
public interface CIM_ManagedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * InstanceID is an optional property that may be used to opaquely and uniquely identify an instance of this class within the scope of the instantiating Namespace. Various subclasses of this class may override this property to make it required, or a key. Such subclasses may also modify the preferred algorithms for ensuring uniqueness that are defined below.
	 * To ensure uniqueness within the NameSpace, the value of InstanceID should be constructed using the following "preferred" algorithm: 
	 * <OrgID>:<LocalID> 
	 * Where <OrgID> and <LocalID> are separated by a colon (:), and where <OrgID> must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness, <OrgID> must not contain a colon (:). When using this algorithm, the first colon to appear in InstanceID must appear between <OrgID> and <LocalID>. 
	 * <LocalID> is chosen by the business entity and should not be reused to identify different underlying (real-world) elements. If not null and the above "preferred" algorithm is not used, the defining entity must assure that the resulting InstanceID is not reused across any InstanceIDs produced by this or other providers for the NameSpace of this instance. 
	 * If not set to null for DMTF-defined instances, the "preferred" algorithm must be used with the <OrgID> set to CIM.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance ID</em>' attribute.
	 * @see #setInstanceID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ManagedElement_InstanceID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getInstanceID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ManagedElement#getInstanceID <em>Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance ID</em>' attribute.
	 * @see #getInstanceID()
	 * @generated
	 */
	void setInstanceID(String value);

	/**
	 * Returns the value of the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Caption property is a short textual description (one- line string) of the object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Caption</em>' attribute.
	 * @see #setCaption(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ManagedElement_Caption()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64'"
	 * @generated
	 */
	String getCaption();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ManagedElement#getCaption <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption</em>' attribute.
	 * @see #getCaption()
	 * @generated
	 */
	void setCaption(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Description property provides a textual description of the object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ManagedElement_Description()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ManagedElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A user-friendly name for the object. This property allows each instance to define a user-friendly name in addition to its key properties, identity data, and description information. 
	 * Note that the Name property of ManagedSystemElement is also defined as a user-friendly name. But, it is often subclassed to be a Key. It is not reasonable that the same property can convey both identity and a user-friendly name, without inconsistencies. Where Name exists and is not a Key (such as for instances of LogicalDevice), the same information can be present in both the Name and ElementName properties. Note that if there is an associated instance of CIM_EnabledLogicalElementCapabilities, restrictions on this properties may exist as defined in ElementNameMask and MaxElementNameLen properties defined in that class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Name</em>' attribute.
	 * @see #setElementName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ManagedElement_ElementName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getElementName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ManagedElement#getElementName <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Name</em>' attribute.
	 * @see #getElementName()
	 * @generated
	 */
	void setElementName(String value);

	/**
	 * Returns the value of the '<em><b>Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generation is an optional, monotonically increasing property that may be used to identify a particular generation of the resource represented by this class.
	 * If Generation is supported by the implementation, its value shall not be null. 
	 * Except as otherwise specified, a value (including null) of Generation specified at creation time shall be replaced by null if Generation is not supported by the implementation or shall be a, (possibly different), non-null value if the implementation does support Generation.
	 * After creation and if supported, Generation shall be updated, at least once per access, whenever the represented resource is modified, regardless of the source of the modification.
	 * Note: the Generation value only needs to be updated once between references, even if the resource is updated many times. The key point is to assure that it will be different if there have been updates, not to count each update.
	 * Note: unless otherwise specified, the value of Generation within one instance is not required to be coordinated with the value of Generation in any other instance.
	 * Note:the semantics of the instance, (as defined by its creation class), define the underlying resource. That underlying resource may be a collection or aggregation of resources. And, in that case, the semantics of the instance further define when updates to constituent resources also require updates to the Generation of the collective resource. Default behavior of composite aggregations should be to update the Generation of the composite whenever the Generation of a component is updated.
	 * Subclasses may define additional requirements for updates on some or all of related instances.
	 * For a particular instance, the value of Generation may wrap through zero, but the elapsed time between wraps shall be greater than 10's of years.
	 * This class does not require Generation to be unique across instances of other classes nor across instances of the same class that have different keys. Generation shall be different across power cycles, resets, or reboots if any of those actions results in an update. Generation may be different across power cycles, resets, or reboots if those actions do not result in an update. If the Generation property of an instance is non-null, and if any attempt to update the instance includes the Generation property, then if it doesn't match the current value, the update shall fail.
	 * The usage of this property is intended to be further specified by applicable management profiles. 
	 * Typically, a client will read the value of this property and then supply that value as input to an operation that modifies the instance in some means. This may be via an explicit parameter in an extrinsic method or via an embedded value in an extrinsic method or intrinsic operation.
	 * For example: a profile may require that an intrinsic instance modification supply the Generation property and that it must match for the modification to succeed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generation</em>' attribute.
	 * @see #setGeneration(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ManagedElement_Generation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getGeneration();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ManagedElement#getGeneration <em>Generation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation</em>' attribute.
	 * @see #getGeneration()
	 * @generated
	 */
	void setGeneration(Long value);

} // CIM_ManagedElement
