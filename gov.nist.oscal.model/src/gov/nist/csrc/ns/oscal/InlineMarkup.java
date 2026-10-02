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

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inline Markup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.InlineMarkup#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.InlineMarkup#getInlineMarkupGroup <em>Inline Markup Group</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.InlineMarkup#getA <em>A</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.InlineMarkup#getInsert <em>Insert</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.InlineMarkup#getBr <em>Br</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.InlineMarkup#getCode <em>Code</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.InlineMarkup#getEm <em>Em</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.InlineMarkup#getI <em>I</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.InlineMarkup#getB <em>B</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.InlineMarkup#getStrong <em>Strong</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.InlineMarkup#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.InlineMarkup#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.InlineMarkup#getQ <em>Q</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.InlineMarkup#getImg <em>Img</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInlineMarkup()
 * @model extendedMetaData="name='inlineMarkupType' kind='mixed'"
 * @generated
 */
@ProviderType
public interface InlineMarkup extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInlineMarkup_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Inline Markup Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inline Markup Group</em>' attribute list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInlineMarkup_InlineMarkupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='InlineMarkupGroup:1'"
	 * @generated
	 */
	FeatureMap getInlineMarkupGroup();

	/**
	 * Returns the value of the '<em><b>A</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.MarkupAnchor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInlineMarkup_A()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='a' namespace='##targetNamespace' group='#InlineMarkupGroup:1'"
	 * @generated
	 */
	EList<MarkupAnchor> getA();

	/**
	 * Returns the value of the '<em><b>Insert</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.MarkupInsert}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInlineMarkup_Insert()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='insert' namespace='##targetNamespace' group='#InlineMarkupGroup:1'"
	 * @generated
	 */
	EList<MarkupInsert> getInsert();

	/**
	 * Returns the value of the '<em><b>Br</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Br</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInlineMarkup_Br()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='br' namespace='##targetNamespace' group='#InlineMarkupGroup:1'"
	 * @generated
	 */
	EList<EObject> getBr();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.MarkupCode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInlineMarkup_Code()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace' group='#InlineMarkupGroup:1'"
	 * @generated
	 */
	EList<MarkupCode> getCode();

	/**
	 * Returns the value of the '<em><b>Em</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Em</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInlineMarkup_Em()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='em' namespace='##targetNamespace' group='#InlineMarkupGroup:1'"
	 * @generated
	 */
	EList<InlineMarkup> getEm();

	/**
	 * Returns the value of the '<em><b>I</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInlineMarkup_I()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='i' namespace='##targetNamespace' group='#InlineMarkupGroup:1'"
	 * @generated
	 */
	EList<InlineMarkup> getI();

	/**
	 * Returns the value of the '<em><b>B</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInlineMarkup_B()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='b' namespace='##targetNamespace' group='#InlineMarkupGroup:1'"
	 * @generated
	 */
	EList<InlineMarkup> getB();

	/**
	 * Returns the value of the '<em><b>Strong</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strong</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInlineMarkup_Strong()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='strong' namespace='##targetNamespace' group='#InlineMarkupGroup:1'"
	 * @generated
	 */
	EList<InlineMarkup> getStrong();

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInlineMarkup_Sub()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sub' namespace='##targetNamespace' group='#InlineMarkupGroup:1'"
	 * @generated
	 */
	EList<InlineMarkup> getSub();

	/**
	 * Returns the value of the '<em><b>Sup</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sup</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInlineMarkup_Sup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sup' namespace='##targetNamespace' group='#InlineMarkupGroup:1'"
	 * @generated
	 */
	EList<InlineMarkup> getSup();

	/**
	 * Returns the value of the '<em><b>Q</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Q</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInlineMarkup_Q()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='q' namespace='##targetNamespace' group='#InlineMarkupGroup:1'"
	 * @generated
	 */
	EList<InlineMarkup> getQ();

	/**
	 * Returns the value of the '<em><b>Img</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.MarkupImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Img</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getInlineMarkup_Img()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='img' namespace='##targetNamespace' group='#InlineMarkupGroup:1'"
	 * @generated
	 */
	EList<MarkupImage> getImg();

} // InlineMarkup
