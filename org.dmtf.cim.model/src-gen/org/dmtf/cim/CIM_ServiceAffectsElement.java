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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Service Affects Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ServiceAffectsElement represents an association between a Service and the ManagedElements that might be affected by its execution. Instantiating this association indicates that running the service may change, manage, provide functionality for,or pose some burden on the ManagedElement. This burden might affect performance, throughput, availability, and so on.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ServiceAffectsElement#getAffectedElement <em>Affected Element</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ServiceAffectsElement#getAffectingElement <em>Affecting Element</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ServiceAffectsElement#getElementEffects <em>Element Effects</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ServiceAffectsElement#getOtherElementEffectsDescriptions <em>Other Element Effects Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ServiceAffectsElement#getAssignedSequence <em>Assigned Sequence</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ServiceAffectsElement()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::Core::Service' keys='AffectedElement,AffectingElement'"
 * @generated
 */
@ProviderType
public interface CIM_ServiceAffectsElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Managed Element that is affected by the Service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affected Element</em>' reference.
	 * @see #setAffectedElement(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_ServiceAffectsElement_AffectedElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getAffectedElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ServiceAffectsElement#getAffectedElement <em>Affected Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affected Element</em>' reference.
	 * @see #getAffectedElement()
	 * @generated
	 */
	void setAffectedElement(CIM_ManagedElement value);

	/**
	 * Returns the value of the '<em><b>Affecting Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Service that is affecting the ManagedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affecting Element</em>' reference.
	 * @see #setAffectingElement(CIM_Service)
	 * @see org.dmtf.cim.CimPackage#getCIM_ServiceAffectsElement_AffectingElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Service REF' Key='true'"
	 * @generated
	 */
	CIM_Service getAffectingElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ServiceAffectsElement#getAffectingElement <em>Affecting Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affecting Element</em>' reference.
	 * @see #getAffectingElement()
	 * @generated
	 */
	void setAffectingElement(CIM_Service value);

	/**
	 * Returns the value of the '<em><b>Element Effects</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration that describes the effect on the ManagedElement. This array corresponds to the OtherElementEffectsDescriptions array, where the latter provides details that are related to the high-level effects enumerated by this property. Additional detail is required if the ElementEffects array contains the value 1 (Other). The values are defined as follows: 
	 * - Exclusive Use (2): No other Service may have this association to the element. 
	 * - Performance Impact (3): Deprecated in favor of "Consumes", "Enhances Performance", or "Degrades Performance". Execution of the Service may enhance or degrade the performance of the element. This may be as a side-effect of execution or as an intended consequence of methods provided by the Service. 
	 * - Element Integrity (4): Deprecated in favor of "Consumes", "Enhances Integrity", or "Degrades Integrity". Execution of the Service may enhance or degrade the integrity of the element. This may be as a side-effect of execution or as an intended consequence of methods provided by the Service. 
	 * - Manages (5): The Service manages the element. 
	 * - Consumes (6): Execution of the Service consumes some or all of the associated element as a consequence of running the Service. For example, the Service may consume CPU cycles, which may affect performance, or Storage which may affect both performance and integrity. (For instance, the lack of free storage can degrade integrity by reducing the ability to save state. ) "Consumes" may be used alone or in conjunction with other values, in particular, "Degrades Performance" and "Degrades Integrity". 
	 * "Manages" and not "Consumes" should be used to reflect allocation services that may be provided by a Service. 
	 * - Enhances Integrity (7): The Service may enhance integrity of the associated element. 
	 * - Degrades Integrity (8): The Service may degrade integrity of the associated element. 
	 * - Enhances Performance (9): The Service may enhance performance of the associated element. 
	 * - Degrades Performance (10): The Service may degrade performance of the associated element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Effects</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ServiceAffectsElement_ElementEffects()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Unknown\",\"Other\",\"Exclusive Use\",\"Performance Impact\",\"Element Integrity\",\"Manages\",\"Consumes\",\"Enhances Integrity\",\"Degrades Integrity\",\"Enhances Performance\",\"Degrades Performance\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ServiceAffectsElement.OtherElementEffectsDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getElementEffects();

	/**
	 * Returns the value of the '<em><b>Other Element Effects Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides details for the effect at the corresponding array position in ElementEffects. This information is required if ElementEffects contains the value 1 (Other).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Element Effects Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ServiceAffectsElement_OtherElementEffectsDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ServiceAffectsElement.ElementEffects\"]'"
	 * @generated
	 */
	EList<String> getOtherElementEffectsDescriptions();

	/**
	 * Returns the value of the '<em><b>Assigned Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AssignedSequence is an unsigned integer 'n' that indicates the relative sequence in which order the ManagedElement instances are affected by the Service, which is associated to the ManagedElement instances through this class. The implementation of the Service shall use the relative sequence to order all the managed elements represented by ManagedElements associated through this class for servicing or prioritizing. 
	 * When 'n' is a positive integer, it indicates a place in the sequence of affected elements, with smaller integers indicating earlier positions in the sequence. NULL or the special value '0' indicates 'don't care'. If two or more affected elements have the same non-zero sequence number, then the ordering between those elements is irrelevant, but they must all be serviced in the appropriate order in the overall sequence. 
	 * A series of examples will make order of elements clearer: If all elements affected have the same sequence number, 
	 * regardless of whether it is '0' or non-zero, any 
	 * order is acceptable. 
	 * The values: 
	 * 1:ELEMENT A 
	 * 2:ELEMENT B 
	 * 1:ELEMENT C 
	 * 3:ELEMENT D 
	 * indicate two acceptable orders: A,C,B,D or C,A,B,D, 
	 * since A and C can be ordered in either sequence, but 
	 * only at the '1' position. 
	 * 
	 * Note that the non-zero sequence numbers need not start with '1', and they need not be consecutive. All that matters is their relative magnitude.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assigned Sequence</em>' attribute.
	 * @see #setAssignedSequence(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ServiceAffectsElement_AssignedSequence()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getAssignedSequence();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ServiceAffectsElement#getAssignedSequence <em>Assigned Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Sequence</em>' attribute.
	 * @see #getAssignedSequence()
	 * @generated
	 */
	void setAssignedSequence(Integer value);

} // CIM_ServiceAffectsElement
