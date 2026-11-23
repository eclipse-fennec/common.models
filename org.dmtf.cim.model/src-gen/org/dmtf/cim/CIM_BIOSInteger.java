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
 * A representation of the model object '<em><b>CIM BIOS Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The BIOSInteger object may be used to instantiate and provide detailed information describing BIOS attributeswith integer values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BIOSInteger#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BIOSInteger#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BIOSInteger#getProgrammaticUnit <em>Programmatic Unit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BIOSInteger#getScalarIncrement <em>Scalar Increment</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BIOSInteger()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::System::BIOS' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_BIOSInteger extends CIM_BIOSAttribute {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property defines a lower bound or limit when modifying this attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSInteger_LowerBound()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_BIOSInteger.UpperBound\"]'"
	 * @generated
	 */
	Long getLowerBound();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BIOSInteger#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(Long value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property defines an upper bound or limit when modifying this attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSInteger_UpperBound()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_BIOSInteger.LowerBound\"]'"
	 * @generated
	 */
	Long getUpperBound();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BIOSInteger#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(Long value);

	/**
	 * Returns the value of the '<em><b>Programmatic Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the programmatic unit for the CIM_BIOSAttribute.CurrentValue, CIM_BIOSAttribute.PendingValue, and CIM_BIOSAttribute.DefaultValue Properties when instance of the central class represents an Integer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Programmatic Unit</em>' attribute.
	 * @see #setProgrammaticUnit(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSInteger_ProgrammaticUnit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_BIOSAttribute.CurrentValue\",\"CIM_BIOSAttribute.PendingValue\",\"CIM_BIOSAttribute.PendingValue\"]' IsPUnit='true'"
	 * @generated
	 */
	String getProgrammaticUnit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BIOSInteger#getProgrammaticUnit <em>Programmatic Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programmatic Unit</em>' attribute.
	 * @see #getProgrammaticUnit()
	 * @generated
	 */
	void setProgrammaticUnit(String value);

	/**
	 * Returns the value of the '<em><b>Scalar Increment</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the granularity of a scalar Attribute value. The scalar increment is based on the scalar unit being instrumented and returned as a programmaticUnit. For example, if ProgrammaticUnit= "Percentage" and ScalarIncrement="10" then the scalar value is in increments of 10 percent. It has a default value of 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scalar Increment</em>' attribute.
	 * @see #setScalarIncrement(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSInteger_ScalarIncrement()
	 * @model default="1"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ModelCorrespondence='[\"CIM_BIOSInteger.ProgrammaticUnit\"]'"
	 * @generated
	 */
	Long getScalarIncrement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BIOSInteger#getScalarIncrement <em>Scalar Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scalar Increment</em>' attribute.
	 * @see #getScalarIncrement()
	 * @generated
	 */
	void setScalarIncrement(Long value);

} // CIM_BIOSInteger
