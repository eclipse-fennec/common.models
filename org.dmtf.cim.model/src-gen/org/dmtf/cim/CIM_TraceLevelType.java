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
 * A representation of the model object '<em><b>CIM Trace Level Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TraceLevelType defines the encoding and semantics of trace levels. A trace is data that is produced during the execution of program code in order to provide information on the behaviour of the code (e.g. textual data written to files). Traces may be used for error detection/analysis or debugging. Trace levels define the granularity and/or type of the traces that are to be produced by the program code. Depending on the program implementation, levels may be applied on the fly. The possible levels are also implementation dependent, since no general rules or standards exist. In consequence, program developers could reuse their existing trace level scheme. 
 * Traces are valuable information sources for management applications in cases of error detection/analysis. In order to correctly set trace levels to the level needed (exciting exhaustive tracing by accident may result in significant system resources consumption in terms of processing time and storage) and to efficiently interpret which level of detail to expect from traces already produced by some resource, the possible trace level values and their meaning (semantics) must be known by the user and/or the management application. The type does not define the location or access method of the traces, since traces of a particular type can have multiple locations as well as multiple access methods.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_TraceLevelType#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TraceLevelType#getTraceValues <em>Trace Values</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TraceLevelType#getValueDescriptions <em>Value Descriptions</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TraceLevelType()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.19.0' UMLPackagePath='CIM::Metrics::UnitOfWork' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following \'preferred\' algorithm: \n: \nWhere and are separated by a colon \':\', and where MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness MUST NOT contain a colon (\':\'). When using this algorithm, the first colon to appear in InstanceID MUST appear between and . \nis chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above \'preferred\' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance\'s NameSpace. \nFor DMTF defined instances, the \'preferred\' algorithm MUST be used with the set to \'CIM\'.' override.InstanceID.MaxLen='16' override.InstanceID.ModelCorrespondence='[\"CIM_UnitOfWorkDefinition.TraceLevelTypeId\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_TraceLevelType extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Base Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the technical encoding of the trace level. 
	 * 0: bit map = switches to turn on/off appropriate trace production (e.g. 0x00000010, 0x0000F000); the use of bit maps implies that the switches can be or-ed bitwise: Values[1] | Values[2] | ... . 
	 * 1: number = plain numbers that define levels (e.g. 1, 2, 7); the recommended and most common encoding scheme 
	 * 2: any other encoding scheme you could think of (e.g. mixture of bit maps and numbers).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Type</em>' attribute.
	 * @see #setBaseType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TraceLevelType_BaseType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"Other\",\"Bitmap\",\"Number\"]'"
	 * @generated
	 */
	Integer getBaseType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TraceLevelType#getBaseType <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type</em>' attribute.
	 * @see #getBaseType()
	 * @generated
	 */
	void setBaseType(Integer value);

	/**
	 * Returns the value of the '<em><b>Trace Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each entry in the array is one possible value of the trace level of this type. Depending on the base type, these are either switches defined as bit maps (e.g. 0x00000001, 0x000000F0, ...) or plain numbers (1, 2, 3, ...). In either encoding, the value 0 is reserved for the equivalent of 'no trace'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trace Values</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_TraceLevelType_TraceValues()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' Required='true' ArrayType='Indexed'"
	 * @generated
	 */
	EList<Long> getTraceValues();

	/**
	 * Returns the value of the '<em><b>Value Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The index corresponds to TraceLevelType.TraceValues[]. The array provides human-readable descriptions of the semantics of each value entered in the TraceValues array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_TraceLevelType_ValueDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Required='true' ArrayType='Indexed'"
	 * @generated
	 */
	EList<String> getValueDescriptions();

} // CIM_TraceLevelType
