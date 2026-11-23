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
 * A representation of the model object '<em><b>CIM BIOS String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_BIOSString object may be used to instantiate string-based BIOS attributes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BIOSString#getStringType <em>String Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BIOSString#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BIOSString#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BIOSString#getValueExpression <em>Value Expression</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BIOSString()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::System::BIOS' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_BIOSString extends CIM_BIOSAttribute {
	/**
	 * Returns the value of the '<em><b>String Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StringType property provides management applications with information defining implementation's capabilities regarding string values. A value of ASCII indicates a plain text formatting with no tabs formating or bolds, plain text. A value of hex indicates a simple encoding of the numerals 0 to 9 and the letters A to F and is not case sensitive. A value of unicode indicates fully multi-lingual text support. A string BIOS Attribute with value of regex is a regular expression and the CIM_BIOSString.ValueExpression shall be applied to values represented and any value that is attempted to be set by invoking SetBIOSAttribute().
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>String Type</em>' attribute.
	 * @see #setStringType(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSString_StringType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"..\",\"65536..4294967295\"]' Values='[\"Unknown\",\"ASCII\",\"hex\",\"unicode\",\"regex\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long getStringType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BIOSString#getStringType <em>String Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Type</em>' attribute.
	 * @see #getStringType()
	 * @generated
	 */
	void setStringType(Long value);

	/**
	 * Returns the value of the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies the minimum string length allowed when modifying this BIOS attribute. A value of NULL SHALL be defined as zero.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Length</em>' attribute.
	 * @see #setMinLength(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSString_MinLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_BIOSString.MaxLength\"]'"
	 * @generated
	 */
	Long getMinLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BIOSString#getMinLength <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Length</em>' attribute.
	 * @see #getMinLength()
	 * @generated
	 */
	void setMinLength(Long value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies the maximum string length allowed when modifying this BIOS attribute. A value of NULL defines the maximum length is unknown. A value of 0 defines the maximum length as 18446744073709551615, the limitation of the property definition as uint64.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSString_MaxLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_BIOSString.MinLength\"]'"
	 * @generated
	 */
	Long getMaxLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BIOSString#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(Long value);

	/**
	 * Returns the value of the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property denotes a Perl-compatible regular expression (PCRE) syntax to use in validating Attribute values. For a string Attribute where StringType="regex" this property shall have a value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Expression</em>' attribute.
	 * @see #setValueExpression(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BIOSString_ValueExpression()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getValueExpression();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BIOSString#getValueExpression <em>Value Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Expression</em>' attribute.
	 * @see #getValueExpression()
	 * @generated
	 */
	void setValueExpression(String value);

} // CIM_BIOSString
