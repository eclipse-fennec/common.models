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
 * A representation of the model object '<em><b>CIM IRQ</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Personal computer architecture IRQ.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IRQ#getCSCreationClassName <em>CS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IRQ#getCSName <em>CS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IRQ#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IRQ#getIRQNumber <em>IRQ Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IRQ#getAvailability <em>Availability</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IRQ#getTriggerType <em>Trigger Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IRQ#getTriggerLevel <em>Trigger Level</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IRQ#getHardware <em>Hardware</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IRQ()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::System::SystemResources' override.Shareable='boolean' override.Shareable.Description='Boolean indicating whether the IRQ can be shared.' override.Shareable.MappingStrings='[\"MIF.DMTF|IRQ|002.4\"]' keys='CSCreationClassName,CSName,CreationClassName,IRQNumber'"
 * @generated
 */
@ProviderType
public interface CIM_IRQ extends CIM_SystemResource {
	/**
	 * Returns the value of the '<em><b>CS Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping ComputerSystem's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CS Creation Class Name</em>' attribute.
	 * @see #setCSCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IRQ_CSCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_ComputerSystem.CreationClassName'"
	 * @generated
	 */
	String getCSCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IRQ#getCSCreationClassName <em>CS Creation Class Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_IRQ_CSName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_ComputerSystem.Name'"
	 * @generated
	 */
	String getCSName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IRQ#getCSName <em>CS Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_IRQ_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IRQ#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>IRQ Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A part of the object's key value, IRQ Number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IRQ Number</em>' attribute.
	 * @see #setIRQNumber(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_IRQ_IRQNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Key='true' MappingStrings='[\"MIF.DMTF|IRQ|002.1\"]'"
	 * @generated
	 */
	Long getIRQNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IRQ#getIRQNumber <em>IRQ Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IRQ Number</em>' attribute.
	 * @see #getIRQNumber()
	 * @generated
	 */
	void setIRQNumber(Long value);

	/**
	 * Returns the value of the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Availability of the IRQ.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Availability</em>' attribute.
	 * @see #setAvailability(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IRQ_Availability()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Other\",\"Unknown\",\"Available\",\"In Use/Not Available\",\"In Use and Available/Shareable\"]' MappingStrings='[\"MIF.DMTF|IRQ|002.2\"]'"
	 * @generated
	 */
	Integer getAvailability();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IRQ#getAvailability <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability</em>' attribute.
	 * @see #getAvailability()
	 * @generated
	 */
	void setAvailability(Integer value);

	/**
	 * Returns the value of the '<em><b>Trigger Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IRQ trigger type indicating whether edge (value=4) or level triggered (value=3) interrupts occur. Also, "Other" (1) and "Unknown" (2) may be defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Type</em>' attribute.
	 * @see #setTriggerType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IRQ_TriggerType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\"]' Values='[\"Other\",\"Unknown\",\"Level\",\"Edge\"]' MappingStrings='[\"MIF.DMTF|IRQ|002.3\",\"MIF.DMTF|System Resource IRQ Info|001.2\"]'"
	 * @generated
	 */
	Integer getTriggerType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IRQ#getTriggerType <em>Trigger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Type</em>' attribute.
	 * @see #getTriggerType()
	 * @generated
	 */
	void setTriggerType(Integer value);

	/**
	 * Returns the value of the '<em><b>Trigger Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IRQ trigger level indicating whether the interrupt is triggered by the hardware signal going high (value=4) or low (value=3). Also, "Other" (1) and "Unknown" (2) may be defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Level</em>' attribute.
	 * @see #setTriggerLevel(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IRQ_TriggerLevel()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\"]' Values='[\"Other\",\"Unknown\",\"Active Low\",\"Active High\"]' MappingStrings='[\"MIF.DMTF|System Resource IRQ Info|001.3\"]'"
	 * @generated
	 */
	Integer getTriggerLevel();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IRQ#getTriggerLevel <em>Trigger Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Level</em>' attribute.
	 * @see #getTriggerLevel()
	 * @generated
	 */
	void setTriggerLevel(Integer value);

	/**
	 * Returns the value of the '<em><b>Hardware</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Hardware property indicates whether the interrupt is hardware or software based. (If TRUE, the interrupt is hardware based.) On a personal computer, a hardware IRQ is a physical wire to a programmable interrupt controller (PIC) chip, through which the CPU can be notified of time critical events. Some IRQ lines are reserved for standard Devices such as the keyboard, floppy disk drives, and the system clock. A software interrupt is a programmatic mechanism to allow an application to get the attention of the Processor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hardware</em>' attribute.
	 * @see #setHardware(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_IRQ_Hardware()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getHardware();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IRQ#getHardware <em>Hardware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware</em>' attribute.
	 * @see #getHardware()
	 * @generated
	 */
	void setHardware(Boolean value);

} // CIM_IRQ
