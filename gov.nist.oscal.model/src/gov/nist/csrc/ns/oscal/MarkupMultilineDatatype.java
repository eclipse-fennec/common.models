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
 * A representation of the model object '<em><b>Markup Multiline Datatype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getBlockElementGroup <em>Block Element Group</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getH1 <em>H1</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getH2 <em>H2</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getH3 <em>H3</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getH4 <em>H4</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getH5 <em>H5</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getH6 <em>H6</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getUl <em>Ul</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getOl <em>Ol</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getPre <em>Pre</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getHr <em>Hr</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getP <em>P</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getTable <em>Table</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getImg <em>Img</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupMultilineDatatype()
 * @model extendedMetaData="name='MarkupMultilineDatatype' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MarkupMultilineDatatype extends EObject {
	/**
	 * Returns the value of the '<em><b>Block Element Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Element Group</em>' attribute list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupMultilineDatatype_BlockElementGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='BlockElementGroup:0'"
	 * @generated
	 */
	FeatureMap getBlockElementGroup();

	/**
	 * Returns the value of the '<em><b>H1</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H1</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupMultilineDatatype_H1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h1' namespace='##targetNamespace' group='#BlockElementGroup:0'"
	 * @generated
	 */
	EList<InlineMarkup> getH1();

	/**
	 * Returns the value of the '<em><b>H2</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H2</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupMultilineDatatype_H2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h2' namespace='##targetNamespace' group='#BlockElementGroup:0'"
	 * @generated
	 */
	EList<InlineMarkup> getH2();

	/**
	 * Returns the value of the '<em><b>H3</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H3</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupMultilineDatatype_H3()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h3' namespace='##targetNamespace' group='#BlockElementGroup:0'"
	 * @generated
	 */
	EList<InlineMarkup> getH3();

	/**
	 * Returns the value of the '<em><b>H4</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H4</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupMultilineDatatype_H4()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h4' namespace='##targetNamespace' group='#BlockElementGroup:0'"
	 * @generated
	 */
	EList<InlineMarkup> getH4();

	/**
	 * Returns the value of the '<em><b>H5</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H5</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupMultilineDatatype_H5()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h5' namespace='##targetNamespace' group='#BlockElementGroup:0'"
	 * @generated
	 */
	EList<InlineMarkup> getH5();

	/**
	 * Returns the value of the '<em><b>H6</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H6</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupMultilineDatatype_H6()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h6' namespace='##targetNamespace' group='#BlockElementGroup:0'"
	 * @generated
	 */
	EList<InlineMarkup> getH6();

	/**
	 * Returns the value of the '<em><b>Ul</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.MarkupList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ul</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupMultilineDatatype_Ul()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ul' namespace='##targetNamespace' group='#BlockElementGroup:0'"
	 * @generated
	 */
	EList<MarkupList> getUl();

	/**
	 * Returns the value of the '<em><b>Ol</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.MarkupOrderedList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ol</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupMultilineDatatype_Ol()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ol' namespace='##targetNamespace' group='#BlockElementGroup:0'"
	 * @generated
	 */
	EList<MarkupOrderedList> getOl();

	/**
	 * Returns the value of the '<em><b>Pre</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.MarkupPreformatted}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupMultilineDatatype_Pre()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pre' namespace='##targetNamespace' group='#BlockElementGroup:0'"
	 * @generated
	 */
	EList<MarkupPreformatted> getPre();

	/**
	 * Returns the value of the '<em><b>Hr</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hr</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupMultilineDatatype_Hr()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hr' namespace='##targetNamespace' group='#BlockElementGroup:0'"
	 * @generated
	 */
	EList<EObject> getHr();

	/**
	 * Returns the value of the '<em><b>Blockquote</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.MarkupBlockQuote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blockquote</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupMultilineDatatype_Blockquote()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='blockquote' namespace='##targetNamespace' group='#BlockElementGroup:0'"
	 * @generated
	 */
	EList<MarkupBlockQuote> getBlockquote();

	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InlineMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupMultilineDatatype_P()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='p' namespace='##targetNamespace' group='#BlockElementGroup:0'"
	 * @generated
	 */
	EList<InlineMarkup> getP();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.MarkupTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupMultilineDatatype_Table()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table' namespace='##targetNamespace' group='#BlockElementGroup:0'"
	 * @generated
	 */
	EList<MarkupTable> getTable();

	/**
	 * Returns the value of the '<em><b>Img</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.MarkupImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Img</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getMarkupMultilineDatatype_Img()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='img' namespace='##targetNamespace' group='#BlockElementGroup:0'"
	 * @generated
	 */
	EList<MarkupImage> getImg();

} // MarkupMultilineDatatype
