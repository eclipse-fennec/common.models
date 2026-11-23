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
 * A representation of the model object '<em><b>CIM Memory Mapped IO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Personal Computer architecture Memory Mapped I/O. This class addresses both memory and port I/O resources. The property, MappedResource, defines whether memory or I/O is mapped (and for I/O whether the mapping is to a memory or a port space).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MemoryMappedIO#getCSCreationClassName <em>CS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MemoryMappedIO#getCSName <em>CS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MemoryMappedIO#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MemoryMappedIO#getStartingAddress <em>Starting Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MemoryMappedIO#getEndingAddress <em>Ending Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MemoryMappedIO#getMappedResource <em>Mapped Resource</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MemoryMappedIO()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::System::SystemResources' keys='CSCreationClassName,CSName,CreationClassName,StartingAddress'"
 * @generated
 */
@ProviderType
public interface CIM_MemoryMappedIO extends CIM_SystemResource {
	/**
	 * Returns the value of the '<em><b>CS Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping ComputerSystem's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CS Creation Class Name</em>' attribute.
	 * @see #setCSCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MemoryMappedIO_CSCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_ComputerSystem.CreationClassName'"
	 * @generated
	 */
	String getCSCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MemoryMappedIO#getCSCreationClassName <em>CS Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CS Creation Class Name</em>' attribute.
	 * @see #getCSCreationClassName()
	 * @generated
	 */
	void setCSCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>CS Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping ComputerSystem's Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CS Name</em>' attribute.
	 * @see #setCSName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MemoryMappedIO_CSName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_ComputerSystem.Name'"
	 * @generated
	 */
	String getCSName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MemoryMappedIO#getCSName <em>CS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CS Name</em>' attribute.
	 * @see #getCSName()
	 * @generated
	 */
	void setCSName(String value);

	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MemoryMappedIO_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MemoryMappedIO#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Starting Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A part of the object's key value, the starting address of memory mapped I/O.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Starting Address</em>' attribute.
	 * @see #setStartingAddress(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MemoryMappedIO_StartingAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Key='true' MappingStrings='[\"MIF.DMTF|Memory Mapped I/O|001.1\"]'"
	 * @generated
	 */
	Long getStartingAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MemoryMappedIO#getStartingAddress <em>Starting Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Address</em>' attribute.
	 * @see #getStartingAddress()
	 * @generated
	 */
	void setStartingAddress(Long value);

	/**
	 * Returns the value of the '<em><b>Ending Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ending address of memory mapped I/O.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ending Address</em>' attribute.
	 * @see #setEndingAddress(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MemoryMappedIO_EndingAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"MIF.DMTF|Memory Mapped I/O|001.2\"]'"
	 * @generated
	 */
	Long getEndingAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MemoryMappedIO#getEndingAddress <em>Ending Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ending Address</em>' attribute.
	 * @see #getEndingAddress()
	 * @generated
	 */
	void setEndingAddress(Long value);

	/**
	 * Returns the value of the '<em><b>Mapped Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of memory mapped I/O. MappedResource defines whether memory or I/O is mapped, and for I/O, whether the mapping is to a memory or a port space.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mapped Resource</em>' attribute.
	 * @see #setMappedResource(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MemoryMappedIO_MappedResource()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Other\",\"Mapped Memory\",\"I/O Mapped to Memory Space\",\"I/O Mapped to Port Space\"]'"
	 * @generated
	 */
	Integer getMappedResource();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MemoryMappedIO#getMappedResource <em>Mapped Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped Resource</em>' attribute.
	 * @see #getMappedResource()
	 * @generated
	 */
	void setMappedResource(Integer value);

} // CIM_MemoryMappedIO
