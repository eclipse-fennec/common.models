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
 * A representation of the model object '<em><b>CIM Unit Of Work Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A LogicalElement that describes units of work (e.g. transactions). This class represents the definitional components of a unit of work, and not the unit itself.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_UnitOfWorkDefinition#getContext <em>Context</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnitOfWorkDefinition#getId <em>Id</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnitOfWorkDefinition#getTraceLevelTypeId <em>Trace Level Type Id</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_UnitOfWorkDefinition()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Metrics::UnitOfWork' override.Name='string' override.Name.Description='The name of the Definition. This name does not have to be unique, but should be descriptive. It may contain blanks.' keys='Id'"
 * @generated
 */
@ProviderType
public interface CIM_UnitOfWorkDefinition extends CIM_LogicalElement {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free format string describing the context of the defined UnitOfWork. For example an 'Add Order' Unit could be defined in the context of a book ordering application, whereas another 'Add Order' UnitOfWork could be defined for a computer ordering application. It may contain blanks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnitOfWorkDefinition_Context()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnitOfWorkDefinition#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A 16 byte value that uniquely identifies the UnitOfWork Definition. The use of OSF UUID/GUIDs is recommended.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnitOfWorkDefinition_Id()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='16'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnitOfWorkDefinition#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Trace Level Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A 16 byte value that uniquely identifies the applied semantics and format of the trace levels used in the instances of UnitOfWork. The use of OSF UUID/GUIDs is recommended. 
	 * TraceLevelTypeId allows management applications to efficiently discriminate between different trace level semantics of different UnitOfWorkDefinitions. I.E., CIM_UnitOfWork.TraceLevel = 1 may have different semantics if TraceLevelTypeId is different for the respective instances of UnitOfWork. 
	 * It is not assumed that different trace level semantics are used within the same UnitOfWorkDefinition in order to promote uniform trace level encodings. (Keep in mind: At least the developers of the business actions represented by the same UnitOfWorkDefinition instance should strive to use the same trace level encoding, otherwise the administrator will have a hard time to figure out what detailed information to expect.) 
	 * If the string is empty no traces are expected to be produced. If the string is not empty, an associated instance of TraceLevelType may be attached to the UnitOfWorkDefinition instance. Still, it is useful to incorporate TraceLevelTypeId into UnitOfWorkDefinition, to relate to an instance of TraceLevelType. The management application can more easily detect different trace level types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trace Level Type Id</em>' attribute.
	 * @see #setTraceLevelTypeId(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnitOfWorkDefinition_TraceLevelTypeId()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='16' ModelCorrespondence='[\"CIM_TraceLevelType.InstanceID\"]'"
	 * @generated
	 */
	String getTraceLevelTypeId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnitOfWorkDefinition#getTraceLevelTypeId <em>Trace Level Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Level Type Id</em>' attribute.
	 * @see #getTraceLevelTypeId()
	 * @generated
	 */
	void setTraceLevelTypeId(String value);

} // CIM_UnitOfWorkDefinition
