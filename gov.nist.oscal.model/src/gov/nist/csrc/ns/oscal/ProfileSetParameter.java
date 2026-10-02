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
package gov.nist.csrc.ns.oscal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile Set Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                        
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Parameter Setting</b>
 *   : A parameter setting, to be propagated to points of insertion.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getLabel <em>Label</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getUsage <em>Usage</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getGuideline <em>Guideline</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getValue <em>Value</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getSelect <em>Select</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getClass_ <em>Class</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getParamId <em>Param Id</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getProfileSetParameter()
 * @model extendedMetaData="name='set-parameter_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ProfileSetParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getProfileSetParameter_Prop()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prop' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='props'"
	 * @generated
	 */
	EList<Property> getProp();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getProfileSetParameter_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='links'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Parameter Label</b>
	 *   : A short, placeholder name for the parameter, which can be used as a substitute for a value if no value is assigned.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getProfileSetParameter_Label()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupLineDatatype"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Parameter Usage Description</b>
	 *   : Describes the purpose and use of a parameter.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see #setUsage(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getProfileSetParameter_Usage()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype"
	 *        extendedMetaData="kind='element' name='usage' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUsage();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(String value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.ParameterConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getProfileSetParameter_Constraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='constraint' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='constraints'"
	 * @generated
	 */
	EList<ParameterConstraint> getConstraint();

	/**
	 * Returns the value of the '<em><b>Guideline</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.ParameterGuideline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guideline</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getProfileSetParameter_Guideline()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='guideline' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='guidelines'"
	 * @generated
	 */
	EList<ParameterGuideline> getGuideline();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getProfileSetParameter_Value()
	 * @model unique="false" dataType="gov.nist.csrc.ns.oscal.OscalControlCommonParameterValueFIELD"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='values'"
	 * @generated
	 */
	EList<String> getValue();

	/**
	 * Returns the value of the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select</em>' containment reference.
	 * @see #setSelect(ParameterSelection)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getProfileSetParameter_Select()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='select' namespace='##targetNamespace'"
	 * @generated
	 */
	ParameterSelection getSelect();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getSelect <em>Select</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select</em>' containment reference.
	 * @see #getSelect()
	 * @generated
	 */
	void setSelect(ParameterSelection value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                           
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Parameter Class</b>
	 *   : A textual label that provides a characterization of the parameter.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getProfileSetParameter_Class()
	 * @model dataType="gov.nist.csrc.ns.oscal.TokenDatatype"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                           
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Depends On</b>
	 *   : **(deprecated)** Another parameter invoking this one. This construct has been deprecated and should not be used.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Depends On</em>' attribute.
	 * @see #setDependsOn(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getProfileSetParameter_DependsOn()
	 * @model dataType="gov.nist.csrc.ns.oscal.TokenDatatype"
	 *        extendedMetaData="kind='attribute' name='depends-on'"
	 * @generated
	 */
	String getDependsOn();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getDependsOn <em>Depends On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends On</em>' attribute.
	 * @see #getDependsOn()
	 * @generated
	 */
	void setDependsOn(String value);

	/**
	 * Returns the value of the '<em><b>Param Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                           
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Parameter ID</b>
	 *   : An identifier for the parameter.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Param Id</em>' attribute.
	 * @see #setParamId(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getProfileSetParameter_ParamId()
	 * @model dataType="gov.nist.csrc.ns.oscal.TokenDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='param-id'"
	 * @generated
	 */
	String getParamId();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getParamId <em>Param Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Id</em>' attribute.
	 * @see #getParamId()
	 * @generated
	 */
	void setParamId(String value);

} // ProfileSetParameter
