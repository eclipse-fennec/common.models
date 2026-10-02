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


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.fennec.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gov.nist.csrc.ns.oscal.OSCALFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = OSCALPackage.eNS_URI, fingerprint = "fp1:b64827998f63ccc9c1357aa69c5fb49e32dd1bf07845e045701ab431fcfa54da", genModel = "/model/oscal.genmodel", genModelSourceLocations = {"model/oscal.genmodel","gov.nist.oscal.model/model/oscal.genmodel"}, ecore = "/model/oscal.ecore", ecoreSourceLocations = "/model/oscal.ecore")
public interface OSCALPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "oscal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://csrc.nist.gov/ns/oscal/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oscal";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OSCALPackage eINSTANCE = gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl.init();

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.AddImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getAdd()
	 * @generated
	 */
	int ADD = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__PARAM = 1;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__PROP = 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__LINK = 3;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__PART = 4;

	/**
	 * The feature id for the '<em><b>By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__BY_ID = 5;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__POSITION = 6;

	/**
	 * The number of structural features of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.AlterImpl <em>Alter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.AlterImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getAlter()
	 * @generated
	 */
	int ALTER = 1;

	/**
	 * The feature id for the '<em><b>Remove</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER__REMOVE = 0;

	/**
	 * The feature id for the '<em><b>Add</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER__ADD = 1;

	/**
	 * The feature id for the '<em><b>Control Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER__CONTROL_ID = 2;

	/**
	 * The number of structural features of the '<em>Alter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Alter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.MarkupAnchorImpl <em>Markup Anchor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.MarkupAnchorImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getMarkupAnchor()
	 * @generated
	 */
	int MARKUP_ANCHOR = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_ANCHOR__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Phrase Markup Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_ANCHOR__PHRASE_MARKUP_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_ANCHOR__CODE = 2;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_ANCHOR__EM = 3;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_ANCHOR__I = 4;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_ANCHOR__B = 5;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_ANCHOR__STRONG = 6;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_ANCHOR__SUB = 7;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_ANCHOR__SUP = 8;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_ANCHOR__Q = 9;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_ANCHOR__IMG = 10;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_ANCHOR__HREF = 11;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_ANCHOR__TITLE = 12;

	/**
	 * The number of structural features of the '<em>Markup Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_ANCHOR_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Markup Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_ANCHOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.AssessmentLogImpl <em>Assessment Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.AssessmentLogImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getAssessmentLog()
	 * @generated
	 */
	int ASSESSMENT_LOG = 3;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_LOG__ENTRY = 0;

	/**
	 * The number of structural features of the '<em>Assessment Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_LOG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Assessment Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_LOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.AssessmentPlatformImpl <em>Assessment Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.AssessmentPlatformImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getAssessmentPlatform()
	 * @generated
	 */
	int ASSESSMENT_PLATFORM = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLATFORM__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLATFORM__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLATFORM__LINK = 2;

	/**
	 * The feature id for the '<em><b>Uses Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLATFORM__USES_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLATFORM__REMARKS = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLATFORM__UUID = 5;

	/**
	 * The number of structural features of the '<em>Assessment Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLATFORM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Assessment Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLATFORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.AssociatedActivityImpl <em>Associated Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.AssociatedActivityImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getAssociatedActivity()
	 * @generated
	 */
	int ASSOCIATED_ACTIVITY = 5;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ACTIVITY__PROP = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ACTIVITY__LINK = 1;

	/**
	 * The feature id for the '<em><b>Responsible Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ACTIVITY__RESPONSIBLE_ROLE = 2;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ACTIVITY__SUBJECT = 3;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ACTIVITY__REMARKS = 4;

	/**
	 * The feature id for the '<em><b>Activity Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ACTIVITY__ACTIVITY_UUID = 5;

	/**
	 * The number of structural features of the '<em>Associated Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ACTIVITY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Associated Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.AtFrequencyImpl <em>At Frequency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.AtFrequencyImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getAtFrequency()
	 * @generated
	 */
	int AT_FREQUENCY = 6;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_FREQUENCY__REMARKS = 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_FREQUENCY__PERIOD = 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_FREQUENCY__UNIT = 2;

	/**
	 * The number of structural features of the '<em>At Frequency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_FREQUENCY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>At Frequency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_FREQUENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.AttestationImpl <em>Attestation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.AttestationImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getAttestation()
	 * @generated
	 */
	int ATTESTATION = 7;

	/**
	 * The feature id for the '<em><b>Responsible Party</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTESTATION__RESPONSIBLE_PARTY = 0;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTESTATION__PART = 1;

	/**
	 * The number of structural features of the '<em>Attestation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTESTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attestation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTESTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.Base64Impl <em>Base64</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.Base64Impl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getBase64()
	 * @generated
	 */
	int BASE64 = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64__FILENAME = 1;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64__MEDIA_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Base64</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Base64</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.MarkupBlockQuoteImpl <em>Markup Block Quote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.MarkupBlockQuoteImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getMarkupBlockQuote()
	 * @generated
	 */
	int MARKUP_BLOCK_QUOTE = 9;

	/**
	 * The feature id for the '<em><b>Block Element Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_BLOCK_QUOTE__BLOCK_ELEMENT_GROUP = 0;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_BLOCK_QUOTE__H1 = 1;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_BLOCK_QUOTE__H2 = 2;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_BLOCK_QUOTE__H3 = 3;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_BLOCK_QUOTE__H4 = 4;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_BLOCK_QUOTE__H5 = 5;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_BLOCK_QUOTE__H6 = 6;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_BLOCK_QUOTE__UL = 7;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_BLOCK_QUOTE__OL = 8;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_BLOCK_QUOTE__PRE = 9;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_BLOCK_QUOTE__HR = 10;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_BLOCK_QUOTE__BLOCKQUOTE = 11;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_BLOCK_QUOTE__P = 12;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_BLOCK_QUOTE__TABLE = 13;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_BLOCK_QUOTE__IMG = 14;

	/**
	 * The number of structural features of the '<em>Markup Block Quote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_BLOCK_QUOTE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Markup Block Quote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_BLOCK_QUOTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.CategorizationImpl <em>Categorization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.CategorizationImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getCategorization()
	 * @generated
	 */
	int CATEGORIZATION = 10;

	/**
	 * The feature id for the '<em><b>Information Type Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION__INFORMATION_TYPE_ID = 0;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION__SYSTEM = 1;

	/**
	 * The number of structural features of the '<em>Categorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Categorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.CitationImpl <em>Citation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.CitationImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getCitation()
	 * @generated
	 */
	int CITATION = 11;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__LINK = 2;

	/**
	 * The number of structural features of the '<em>Citation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Citation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.InlineMarkupImpl <em>Inline Markup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.InlineMarkupImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getInlineMarkup()
	 * @generated
	 */
	int INLINE_MARKUP = 30;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MARKUP__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Inline Markup Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MARKUP__INLINE_MARKUP_GROUP = 1;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MARKUP__A = 2;

	/**
	 * The feature id for the '<em><b>Insert</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MARKUP__INSERT = 3;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MARKUP__BR = 4;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MARKUP__CODE = 5;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MARKUP__EM = 6;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MARKUP__I = 7;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MARKUP__B = 8;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MARKUP__STRONG = 9;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MARKUP__SUB = 10;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MARKUP__SUP = 11;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MARKUP__Q = 12;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MARKUP__IMG = 13;

	/**
	 * The number of structural features of the '<em>Inline Markup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MARKUP_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Inline Markup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MARKUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.MarkupCodeImpl <em>Markup Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.MarkupCodeImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getMarkupCode()
	 * @generated
	 */
	int MARKUP_CODE = 12;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_CODE__MIXED = INLINE_MARKUP__MIXED;

	/**
	 * The feature id for the '<em><b>Inline Markup Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_CODE__INLINE_MARKUP_GROUP = INLINE_MARKUP__INLINE_MARKUP_GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_CODE__A = INLINE_MARKUP__A;

	/**
	 * The feature id for the '<em><b>Insert</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_CODE__INSERT = INLINE_MARKUP__INSERT;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_CODE__BR = INLINE_MARKUP__BR;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_CODE__CODE = INLINE_MARKUP__CODE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_CODE__EM = INLINE_MARKUP__EM;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_CODE__I = INLINE_MARKUP__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_CODE__B = INLINE_MARKUP__B;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_CODE__STRONG = INLINE_MARKUP__STRONG;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_CODE__SUB = INLINE_MARKUP__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_CODE__SUP = INLINE_MARKUP__SUP;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_CODE__Q = INLINE_MARKUP__Q;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_CODE__IMG = INLINE_MARKUP__IMG;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_CODE__CLASS = INLINE_MARKUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Markup Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_CODE_FEATURE_COUNT = INLINE_MARKUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Markup Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_CODE_OPERATION_COUNT = INLINE_MARKUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.CombineImpl <em>Combine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.CombineImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getCombine()
	 * @generated
	 */
	int COMBINE = 13;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINE__METHOD = 0;

	/**
	 * The number of structural features of the '<em>Combine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Combine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ControlObjectiveSelectionImpl <em>Control Objective Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ControlObjectiveSelectionImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getControlObjectiveSelection()
	 * @generated
	 */
	int CONTROL_OBJECTIVE_SELECTION = 14;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OBJECTIVE_SELECTION__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OBJECTIVE_SELECTION__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OBJECTIVE_SELECTION__LINK = 2;

	/**
	 * The feature id for the '<em><b>Include All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OBJECTIVE_SELECTION__INCLUDE_ALL = 3;

	/**
	 * The feature id for the '<em><b>Include Objective</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OBJECTIVE_SELECTION__INCLUDE_OBJECTIVE = 4;

	/**
	 * The feature id for the '<em><b>Exclude Objective</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OBJECTIVE_SELECTION__EXCLUDE_OBJECTIVE = 5;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OBJECTIVE_SELECTION__REMARKS = 6;

	/**
	 * The number of structural features of the '<em>Control Objective Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OBJECTIVE_SELECTION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Control Objective Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OBJECTIVE_SELECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ControlSelectionImpl <em>Control Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ControlSelectionImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getControlSelection()
	 * @generated
	 */
	int CONTROL_SELECTION = 15;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SELECTION__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SELECTION__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SELECTION__LINK = 2;

	/**
	 * The feature id for the '<em><b>Include All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SELECTION__INCLUDE_ALL = 3;

	/**
	 * The feature id for the '<em><b>Include Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SELECTION__INCLUDE_CONTROL = 4;

	/**
	 * The feature id for the '<em><b>Exclude Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SELECTION__EXCLUDE_CONTROL = 5;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SELECTION__REMARKS = 6;

	/**
	 * The number of structural features of the '<em>Control Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SELECTION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Control Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SELECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.CustomImpl <em>Custom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.CustomImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getCustom()
	 * @generated
	 */
	int CUSTOM = 16;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Insert Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM__INSERT_CONTROLS = 1;

	/**
	 * The number of structural features of the '<em>Custom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Custom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.DependencyImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 17;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__REMARKS = 0;

	/**
	 * The feature id for the '<em><b>Task Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TASK_UUID = 1;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.DocumentRootImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 18;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Assessment Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSESSMENT_PLAN = 3;

	/**
	 * The feature id for the '<em><b>Assessment Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSESSMENT_RESULTS = 4;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CATALOG = 5;

	/**
	 * The feature id for the '<em><b>Component Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPONENT_DEFINITION = 6;

	/**
	 * The feature id for the '<em><b>Mapping Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAPPING_COLLECTION = 7;

	/**
	 * The feature id for the '<em><b>Plan Of Action And Milestones</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PLAN_OF_ACTION_AND_MILESTONES = 8;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROFILE = 9;

	/**
	 * The feature id for the '<em><b>System Security Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SYSTEM_SECURITY_PLAN = 10;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.RiskLogEntryImpl <em>Risk Log Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.RiskLogEntryImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getRiskLogEntry()
	 * @generated
	 */
	int RISK_LOG_ENTRY = 19;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LOG_ENTRY__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LOG_ENTRY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LOG_ENTRY__START = 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LOG_ENTRY__END = 3;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LOG_ENTRY__PROP = 4;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LOG_ENTRY__LINK = 5;

	/**
	 * The feature id for the '<em><b>Logged By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LOG_ENTRY__LOGGED_BY = 6;

	/**
	 * The feature id for the '<em><b>Status Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LOG_ENTRY__STATUS_CHANGE = 7;

	/**
	 * The feature id for the '<em><b>Related Response</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LOG_ENTRY__RELATED_RESPONSE = 8;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LOG_ENTRY__REMARKS = 9;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LOG_ENTRY__UUID = 10;

	/**
	 * The number of structural features of the '<em>Risk Log Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LOG_ENTRY_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Risk Log Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LOG_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.AssessmentLogEntryImpl <em>Assessment Log Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.AssessmentLogEntryImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getAssessmentLogEntry()
	 * @generated
	 */
	int ASSESSMENT_LOG_ENTRY = 20;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_LOG_ENTRY__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_LOG_ENTRY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_LOG_ENTRY__START = 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_LOG_ENTRY__END = 3;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_LOG_ENTRY__PROP = 4;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_LOG_ENTRY__LINK = 5;

	/**
	 * The feature id for the '<em><b>Logged By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_LOG_ENTRY__LOGGED_BY = 6;

	/**
	 * The feature id for the '<em><b>Related Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_LOG_ENTRY__RELATED_TASK = 7;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_LOG_ENTRY__REMARKS = 8;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_LOG_ENTRY__UUID = 9;

	/**
	 * The number of structural features of the '<em>Assessment Log Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_LOG_ENTRY_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Assessment Log Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_LOG_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ExportImpl <em>Export</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ExportImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getExport()
	 * @generated
	 */
	int EXPORT = 21;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__LINK = 2;

	/**
	 * The feature id for the '<em><b>Provided</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__PROVIDED = 3;

	/**
	 * The feature id for the '<em><b>Responsibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__RESPONSIBILITY = 4;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__REMARKS = 5;

	/**
	 * The number of structural features of the '<em>Export</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Export</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ExternalIdImpl <em>External Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ExternalIdImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getExternalId()
	 * @generated
	 */
	int EXTERNAL_ID = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ID__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ID__SCHEME = 1;

	/**
	 * The number of structural features of the '<em>External Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ID_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>External Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.FacetImpl <em>Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.FacetImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getFacet()
	 * @generated
	 */
	int FACET = 23;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__PROP = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__LINK = 1;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__REMARKS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__NAME = 3;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__VALUE = 5;

	/**
	 * The number of structural features of the '<em>Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.FlatImpl <em>Flat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.FlatImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getFlat()
	 * @generated
	 */
	int FLAT = 24;

	/**
	 * The number of structural features of the '<em>Flat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Flat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.IdentifiedSubjectImpl <em>Identified Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.IdentifiedSubjectImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getIdentifiedSubject()
	 * @generated
	 */
	int IDENTIFIED_SUBJECT = 25;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_SUBJECT__SUBJECT = 0;

	/**
	 * The feature id for the '<em><b>Subject Placeholder Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_SUBJECT__SUBJECT_PLACEHOLDER_UUID = 1;

	/**
	 * The number of structural features of the '<em>Identified Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_SUBJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Identified Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_SUBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.MarkupImageImpl <em>Markup Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.MarkupImageImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getMarkupImage()
	 * @generated
	 */
	int MARKUP_IMAGE = 26;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_IMAGE__ALT = 0;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_IMAGE__SRC = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_IMAGE__TITLE = 2;

	/**
	 * The number of structural features of the '<em>Markup Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_IMAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Markup Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_IMAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ImplementedComponentImpl <em>Implemented Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ImplementedComponentImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getImplementedComponent()
	 * @generated
	 */
	int IMPLEMENTED_COMPONENT = 27;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTED_COMPONENT__PROP = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTED_COMPONENT__LINK = 1;

	/**
	 * The feature id for the '<em><b>Responsible Party</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTED_COMPONENT__RESPONSIBLE_PARTY = 2;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTED_COMPONENT__REMARKS = 3;

	/**
	 * The feature id for the '<em><b>Component Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTED_COMPONENT__COMPONENT_UUID = 4;

	/**
	 * The number of structural features of the '<em>Implemented Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTED_COMPONENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Implemented Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTED_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.InformationTypeImpl <em>Information Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.InformationTypeImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getInformationType()
	 * @generated
	 */
	int INFORMATION_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Categorization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__CATEGORIZATION = 2;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__PROP = 3;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__LINK = 4;

	/**
	 * The feature id for the '<em><b>Confidentiality Impact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__CONFIDENTIALITY_IMPACT = 5;

	/**
	 * The feature id for the '<em><b>Integrity Impact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__INTEGRITY_IMPACT = 6;

	/**
	 * The feature id for the '<em><b>Availability Impact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__AVAILABILITY_IMPACT = 7;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__UUID = 8;

	/**
	 * The number of structural features of the '<em>Information Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Information Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.InheritedImpl <em>Inherited</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.InheritedImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getInherited()
	 * @generated
	 */
	int INHERITED = 29;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED__LINK = 2;

	/**
	 * The feature id for the '<em><b>Responsible Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED__RESPONSIBLE_ROLE = 3;

	/**
	 * The feature id for the '<em><b>Provided Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED__PROVIDED_UUID = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED__UUID = 5;

	/**
	 * The number of structural features of the '<em>Inherited</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Inherited</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.MarkupInsertImpl <em>Markup Insert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.MarkupInsertImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getMarkupInsert()
	 * @generated
	 */
	int MARKUP_INSERT = 31;

	/**
	 * The feature id for the '<em><b>Id Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_INSERT__ID_REF = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_INSERT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Markup Insert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_INSERT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Markup Insert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_INSERT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.LeveragedAuthorizationImpl <em>Leveraged Authorization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.LeveragedAuthorizationImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getLeveragedAuthorization()
	 * @generated
	 */
	int LEVERAGED_AUTHORIZATION = 32;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVERAGED_AUTHORIZATION__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVERAGED_AUTHORIZATION__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVERAGED_AUTHORIZATION__LINK = 2;

	/**
	 * The feature id for the '<em><b>Party Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVERAGED_AUTHORIZATION__PARTY_UUID = 3;

	/**
	 * The feature id for the '<em><b>Date Authorized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVERAGED_AUTHORIZATION__DATE_AUTHORIZED = 4;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVERAGED_AUTHORIZATION__REMARKS = 5;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVERAGED_AUTHORIZATION__UUID = 6;

	/**
	 * The number of structural features of the '<em>Leveraged Authorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVERAGED_AUTHORIZATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Leveraged Authorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVERAGED_AUTHORIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl <em>Markup List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.MarkupListItemImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getMarkupListItem()
	 * @generated
	 */
	int MARKUP_LIST_ITEM = 33;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM__GROUP = 1;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM__A = 2;

	/**
	 * The feature id for the '<em><b>Insert</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM__INSERT = 3;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM__BR = 4;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM__CODE = 5;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM__EM = 6;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM__I = 7;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM__B = 8;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM__STRONG = 9;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM__SUB = 10;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM__SUP = 11;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM__Q = 12;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM__IMG = 13;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM__UL = 14;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM__OL = 15;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM__PRE = 16;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM__HR = 17;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM__BLOCKQUOTE = 18;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM__H1 = 19;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM__H2 = 20;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM__H3 = 21;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM__H4 = 22;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM__H5 = 23;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM__H6 = 24;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM__P = 25;

	/**
	 * The number of structural features of the '<em>Markup List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM_FEATURE_COUNT = 26;

	/**
	 * The number of operations of the '<em>Markup List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.MarkupListImpl <em>Markup List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.MarkupListImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getMarkupList()
	 * @generated
	 */
	int MARKUP_LIST = 34;

	/**
	 * The feature id for the '<em><b>Li</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST__LI = 0;

	/**
	 * The number of structural features of the '<em>Markup List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Markup List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ResultLocalDefinitionsImpl <em>Result Local Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ResultLocalDefinitionsImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getResultLocalDefinitions()
	 * @generated
	 */
	int RESULT_LOCAL_DEFINITIONS = 35;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_LOCAL_DEFINITIONS__COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Inventory Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_LOCAL_DEFINITIONS__INVENTORY_ITEM = 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_LOCAL_DEFINITIONS__USER = 2;

	/**
	 * The feature id for the '<em><b>Assessment Assets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_LOCAL_DEFINITIONS__ASSESSMENT_ASSETS = 3;

	/**
	 * The feature id for the '<em><b>Assessment Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_LOCAL_DEFINITIONS__ASSESSMENT_TASK = 4;

	/**
	 * The number of structural features of the '<em>Result Local Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_LOCAL_DEFINITIONS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Result Local Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_LOCAL_DEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.AssessmentResultsLocalDefinitionsImpl <em>Assessment Results Local Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.AssessmentResultsLocalDefinitionsImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getAssessmentResultsLocalDefinitions()
	 * @generated
	 */
	int ASSESSMENT_RESULTS_LOCAL_DEFINITIONS = 36;

	/**
	 * The feature id for the '<em><b>Objectives And Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_RESULTS_LOCAL_DEFINITIONS__OBJECTIVES_AND_METHODS = 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_RESULTS_LOCAL_DEFINITIONS__ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_RESULTS_LOCAL_DEFINITIONS__REMARKS = 2;

	/**
	 * The number of structural features of the '<em>Assessment Results Local Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_RESULTS_LOCAL_DEFINITIONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Assessment Results Local Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_RESULTS_LOCAL_DEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.AssessmentPlanLocalDefinitionsImpl <em>Assessment Plan Local Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.AssessmentPlanLocalDefinitionsImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getAssessmentPlanLocalDefinitions()
	 * @generated
	 */
	int ASSESSMENT_PLAN_LOCAL_DEFINITIONS = 37;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLAN_LOCAL_DEFINITIONS__COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Inventory Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLAN_LOCAL_DEFINITIONS__INVENTORY_ITEM = 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLAN_LOCAL_DEFINITIONS__USER = 2;

	/**
	 * The feature id for the '<em><b>Objectives And Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLAN_LOCAL_DEFINITIONS__OBJECTIVES_AND_METHODS = 3;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLAN_LOCAL_DEFINITIONS__ACTIVITY = 4;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLAN_LOCAL_DEFINITIONS__REMARKS = 5;

	/**
	 * The number of structural features of the '<em>Assessment Plan Local Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLAN_LOCAL_DEFINITIONS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Assessment Plan Local Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLAN_LOCAL_DEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.LocationImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 38;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Email Address</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__EMAIL_ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Telephone Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__TELEPHONE_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__URL = 4;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__PROP = 5;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LINK = 6;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__REMARKS = 7;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__UUID = 8;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.MarkupLineDatatypeImpl <em>Markup Line Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.MarkupLineDatatypeImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getMarkupLineDatatype()
	 * @generated
	 */
	int MARKUP_LINE_DATATYPE = 39;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LINE_DATATYPE__MIXED = INLINE_MARKUP__MIXED;

	/**
	 * The feature id for the '<em><b>Inline Markup Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LINE_DATATYPE__INLINE_MARKUP_GROUP = INLINE_MARKUP__INLINE_MARKUP_GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LINE_DATATYPE__A = INLINE_MARKUP__A;

	/**
	 * The feature id for the '<em><b>Insert</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LINE_DATATYPE__INSERT = INLINE_MARKUP__INSERT;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LINE_DATATYPE__BR = INLINE_MARKUP__BR;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LINE_DATATYPE__CODE = INLINE_MARKUP__CODE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LINE_DATATYPE__EM = INLINE_MARKUP__EM;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LINE_DATATYPE__I = INLINE_MARKUP__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LINE_DATATYPE__B = INLINE_MARKUP__B;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LINE_DATATYPE__STRONG = INLINE_MARKUP__STRONG;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LINE_DATATYPE__SUB = INLINE_MARKUP__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LINE_DATATYPE__SUP = INLINE_MARKUP__SUP;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LINE_DATATYPE__Q = INLINE_MARKUP__Q;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LINE_DATATYPE__IMG = INLINE_MARKUP__IMG;

	/**
	 * The number of structural features of the '<em>Markup Line Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LINE_DATATYPE_FEATURE_COUNT = INLINE_MARKUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Markup Line Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_LINE_DATATYPE_OPERATION_COUNT = INLINE_MARKUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.MarkupMultilineDatatypeImpl <em>Markup Multiline Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.MarkupMultilineDatatypeImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getMarkupMultilineDatatype()
	 * @generated
	 */
	int MARKUP_MULTILINE_DATATYPE = 40;

	/**
	 * The feature id for the '<em><b>Block Element Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_MULTILINE_DATATYPE__BLOCK_ELEMENT_GROUP = 0;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_MULTILINE_DATATYPE__H1 = 1;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_MULTILINE_DATATYPE__H2 = 2;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_MULTILINE_DATATYPE__H3 = 3;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_MULTILINE_DATATYPE__H4 = 4;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_MULTILINE_DATATYPE__H5 = 5;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_MULTILINE_DATATYPE__H6 = 6;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_MULTILINE_DATATYPE__UL = 7;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_MULTILINE_DATATYPE__OL = 8;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_MULTILINE_DATATYPE__PRE = 9;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_MULTILINE_DATATYPE__HR = 10;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_MULTILINE_DATATYPE__BLOCKQUOTE = 11;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_MULTILINE_DATATYPE__P = 12;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_MULTILINE_DATATYPE__TABLE = 13;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_MULTILINE_DATATYPE__IMG = 14;

	/**
	 * The number of structural features of the '<em>Markup Multiline Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_MULTILINE_DATATYPE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Markup Multiline Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_MULTILINE_DATATYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.MitigatingFactorImpl <em>Mitigating Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.MitigatingFactorImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getMitigatingFactor()
	 * @generated
	 */
	int MITIGATING_FACTOR = 41;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITIGATING_FACTOR__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITIGATING_FACTOR__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITIGATING_FACTOR__LINK = 2;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITIGATING_FACTOR__SUBJECT = 3;

	/**
	 * The feature id for the '<em><b>Implementation Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITIGATING_FACTOR__IMPLEMENTATION_UUID = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITIGATING_FACTOR__UUID = 5;

	/**
	 * The number of structural features of the '<em>Mitigating Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITIGATING_FACTOR_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Mitigating Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITIGATING_FACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.OnDateImpl <em>On Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.OnDateImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getOnDate()
	 * @generated
	 */
	int ON_DATE = 42;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_DATE__REMARKS = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_DATE__DATE = 1;

	/**
	 * The number of structural features of the '<em>On Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_DATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>On Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_DATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.MarkupOrderedListImpl <em>Markup Ordered List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.MarkupOrderedListImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getMarkupOrderedList()
	 * @generated
	 */
	int MARKUP_ORDERED_LIST = 43;

	/**
	 * The feature id for the '<em><b>Li</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_ORDERED_LIST__LI = MARKUP_LIST__LI;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_ORDERED_LIST__START = MARKUP_LIST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Markup Ordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_ORDERED_LIST_FEATURE_COUNT = MARKUP_LIST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Markup Ordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_ORDERED_LIST_OPERATION_COUNT = MARKUP_LIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.PoamItemOriginImpl <em>Poam Item Origin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.PoamItemOriginImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getPoamItemOrigin()
	 * @generated
	 */
	int POAM_ITEM_ORIGIN = 44;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POAM_ITEM_ORIGIN__ACTOR = 0;

	/**
	 * The number of structural features of the '<em>Poam Item Origin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POAM_ITEM_ORIGIN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Poam Item Origin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POAM_ITEM_ORIGIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.AssessmentPlanImpl <em>Assessment Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.AssessmentPlanImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getAssessmentPlan()
	 * @generated
	 */
	int ASSESSMENT_PLAN = 45;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLAN__METADATA = 0;

	/**
	 * The feature id for the '<em><b>Import Ssp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLAN__IMPORT_SSP = 1;

	/**
	 * The feature id for the '<em><b>Local Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLAN__LOCAL_DEFINITIONS = 2;

	/**
	 * The feature id for the '<em><b>Terms And Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLAN__TERMS_AND_CONDITIONS = 3;

	/**
	 * The feature id for the '<em><b>Reviewed Controls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLAN__REVIEWED_CONTROLS = 4;

	/**
	 * The feature id for the '<em><b>Assessment Subject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLAN__ASSESSMENT_SUBJECT = 5;

	/**
	 * The feature id for the '<em><b>Assessment Assets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLAN__ASSESSMENT_ASSETS = 6;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLAN__TASK = 7;

	/**
	 * The feature id for the '<em><b>Back Matter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLAN__BACK_MATTER = 8;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLAN__UUID = 9;

	/**
	 * The number of structural features of the '<em>Assessment Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLAN_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Assessment Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.AssessmentResultsImpl <em>Assessment Results</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.AssessmentResultsImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getAssessmentResults()
	 * @generated
	 */
	int ASSESSMENT_RESULTS = 46;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_RESULTS__METADATA = 0;

	/**
	 * The feature id for the '<em><b>Import Ap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_RESULTS__IMPORT_AP = 1;

	/**
	 * The feature id for the '<em><b>Local Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_RESULTS__LOCAL_DEFINITIONS = 2;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_RESULTS__RESULT = 3;

	/**
	 * The feature id for the '<em><b>Back Matter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_RESULTS__BACK_MATTER = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_RESULTS__UUID = 5;

	/**
	 * The number of structural features of the '<em>Assessment Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_RESULTS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Assessment Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_RESULTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ImportApImpl <em>Import Ap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ImportApImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getImportAp()
	 * @generated
	 */
	int IMPORT_AP = 47;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_AP__REMARKS = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_AP__HREF = 1;

	/**
	 * The number of structural features of the '<em>Import Ap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_AP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Import Ap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_AP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ResultImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 48;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__START = 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__END = 3;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__PROP = 4;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__LINK = 5;

	/**
	 * The feature id for the '<em><b>Local Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__LOCAL_DEFINITIONS = 6;

	/**
	 * The feature id for the '<em><b>Reviewed Controls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__REVIEWED_CONTROLS = 7;

	/**
	 * The feature id for the '<em><b>Attestation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__ATTESTATION = 8;

	/**
	 * The feature id for the '<em><b>Assessment Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__ASSESSMENT_LOG = 9;

	/**
	 * The feature id for the '<em><b>Observation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__OBSERVATION = 10;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__RISK = 11;

	/**
	 * The feature id for the '<em><b>Finding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__FINDING = 12;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__REMARKS = 13;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__UUID = 14;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ActivityImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 49;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PROP = 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__LINK = 3;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__STEP = 4;

	/**
	 * The feature id for the '<em><b>Related Controls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__RELATED_CONTROLS = 5;

	/**
	 * The feature id for the '<em><b>Responsible Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__RESPONSIBLE_ROLE = 6;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__REMARKS = 7;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__UUID = 8;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.AssessmentAssetsImpl <em>Assessment Assets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.AssessmentAssetsImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getAssessmentAssets()
	 * @generated
	 */
	int ASSESSMENT_ASSETS = 50;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_ASSETS__COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Assessment Platform</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_ASSETS__ASSESSMENT_PLATFORM = 1;

	/**
	 * The number of structural features of the '<em>Assessment Assets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_ASSETS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Assessment Assets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_ASSETS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.AssessmentMethodImpl <em>Assessment Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.AssessmentMethodImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getAssessmentMethod()
	 * @generated
	 */
	int ASSESSMENT_METHOD = 51;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_METHOD__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_METHOD__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_METHOD__LINK = 2;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_METHOD__PART = 3;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_METHOD__REMARKS = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_METHOD__UUID = 5;

	/**
	 * The number of structural features of the '<em>Assessment Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_METHOD_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Assessment Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.AssessmentPartImpl <em>Assessment Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.AssessmentPartImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getAssessmentPart()
	 * @generated
	 */
	int ASSESSMENT_PART = 52;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PART__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PART__PROP = 1;

	/**
	 * The feature id for the '<em><b>Block Element Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PART__BLOCK_ELEMENT_GROUP = 2;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PART__H1 = 3;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PART__H2 = 4;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PART__H3 = 5;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PART__H4 = 6;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PART__H5 = 7;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PART__H6 = 8;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PART__UL = 9;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PART__OL = 10;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PART__PRE = 11;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PART__HR = 12;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PART__BLOCKQUOTE = 13;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PART__P = 14;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PART__TABLE = 15;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PART__IMG = 16;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PART__PART = 17;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PART__LINK = 18;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PART__CLASS = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PART__NAME = 20;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PART__NS = 21;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PART__UUID = 22;

	/**
	 * The number of structural features of the '<em>Assessment Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PART_FEATURE_COUNT = 23;

	/**
	 * The number of operations of the '<em>Assessment Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.AssessmentSubjectImpl <em>Assessment Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.AssessmentSubjectImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getAssessmentSubject()
	 * @generated
	 */
	int ASSESSMENT_SUBJECT = 53;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_SUBJECT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_SUBJECT__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_SUBJECT__LINK = 2;

	/**
	 * The feature id for the '<em><b>Include All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_SUBJECT__INCLUDE_ALL = 3;

	/**
	 * The feature id for the '<em><b>Include Subject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_SUBJECT__INCLUDE_SUBJECT = 4;

	/**
	 * The feature id for the '<em><b>Exclude Subject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_SUBJECT__EXCLUDE_SUBJECT = 5;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_SUBJECT__REMARKS = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_SUBJECT__TYPE = 7;

	/**
	 * The number of structural features of the '<em>Assessment Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_SUBJECT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Assessment Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_SUBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.AssessmentSubjectPlaceholderImpl <em>Assessment Subject Placeholder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.AssessmentSubjectPlaceholderImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getAssessmentSubjectPlaceholder()
	 * @generated
	 */
	int ASSESSMENT_SUBJECT_PLACEHOLDER = 54;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_SUBJECT_PLACEHOLDER__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_SUBJECT_PLACEHOLDER__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_SUBJECT_PLACEHOLDER__PROP = 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_SUBJECT_PLACEHOLDER__LINK = 3;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_SUBJECT_PLACEHOLDER__REMARKS = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_SUBJECT_PLACEHOLDER__UUID = 5;

	/**
	 * The number of structural features of the '<em>Assessment Subject Placeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_SUBJECT_PLACEHOLDER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Assessment Subject Placeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_SUBJECT_PLACEHOLDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.AssociatedRiskImpl <em>Associated Risk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.AssociatedRiskImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getAssociatedRisk()
	 * @generated
	 */
	int ASSOCIATED_RISK = 55;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_RISK__REMARKS = 0;

	/**
	 * The feature id for the '<em><b>Risk Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_RISK__RISK_UUID = 1;

	/**
	 * The number of structural features of the '<em>Associated Risk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_RISK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Associated Risk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATED_RISK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.CharacterizationImpl <em>Characterization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.CharacterizationImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getCharacterization()
	 * @generated
	 */
	int CHARACTERIZATION = 56;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERIZATION__PROP = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERIZATION__LINK = 1;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERIZATION__ORIGIN = 2;

	/**
	 * The feature id for the '<em><b>Facet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERIZATION__FACET = 3;

	/**
	 * The number of structural features of the '<em>Characterization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERIZATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Characterization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.FindingImpl <em>Finding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.FindingImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getFinding()
	 * @generated
	 */
	int FINDING = 57;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__PROP = 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__LINK = 3;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__ORIGIN = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__TARGET = 5;

	/**
	 * The feature id for the '<em><b>Implementation Statement Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__IMPLEMENTATION_STATEMENT_UUID = 6;

	/**
	 * The feature id for the '<em><b>Related Observation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__RELATED_OBSERVATION = 7;

	/**
	 * The feature id for the '<em><b>Associated Risk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__ASSOCIATED_RISK = 8;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__REMARKS = 9;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__UUID = 10;

	/**
	 * The number of structural features of the '<em>Finding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Finding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.FindingTargetImpl <em>Finding Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.FindingTargetImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getFindingTarget()
	 * @generated
	 */
	int FINDING_TARGET = 58;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_TARGET__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_TARGET__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_TARGET__PROP = 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_TARGET__LINK = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_TARGET__STATUS = 4;

	/**
	 * The feature id for the '<em><b>Implementation Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_TARGET__IMPLEMENTATION_STATUS = 5;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_TARGET__REMARKS = 6;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_TARGET__TARGET_ID = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_TARGET__TYPE = 8;

	/**
	 * The number of structural features of the '<em>Finding Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_TARGET_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Finding Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_TARGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ImportSspImpl <em>Import Ssp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ImportSspImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getImportSsp()
	 * @generated
	 */
	int IMPORT_SSP = 59;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_SSP__REMARKS = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_SSP__HREF = 1;

	/**
	 * The number of structural features of the '<em>Import Ssp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_SSP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Import Ssp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_SSP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.LocalObjectiveImpl <em>Local Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.LocalObjectiveImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getLocalObjective()
	 * @generated
	 */
	int LOCAL_OBJECTIVE = 60;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_OBJECTIVE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_OBJECTIVE__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_OBJECTIVE__LINK = 2;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_OBJECTIVE__PART = 3;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_OBJECTIVE__REMARKS = 4;

	/**
	 * The feature id for the '<em><b>Control Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_OBJECTIVE__CONTROL_ID = 5;

	/**
	 * The number of structural features of the '<em>Local Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_OBJECTIVE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Local Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_OBJECTIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.LoggedByImpl <em>Logged By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.LoggedByImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getLoggedBy()
	 * @generated
	 */
	int LOGGED_BY = 61;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGED_BY__REMARKS = 0;

	/**
	 * The feature id for the '<em><b>Party Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGED_BY__PARTY_UUID = 1;

	/**
	 * The feature id for the '<em><b>Role Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGED_BY__ROLE_ID = 2;

	/**
	 * The number of structural features of the '<em>Logged By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGED_BY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Logged By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGED_BY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ObservationImpl <em>Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ObservationImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getObservation()
	 * @generated
	 */
	int OBSERVATION = 62;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__PROP = 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__LINK = 3;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__METHOD = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__ORIGIN = 6;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__SUBJECT = 7;

	/**
	 * The feature id for the '<em><b>Relevant Evidence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__RELEVANT_EVIDENCE = 8;

	/**
	 * The feature id for the '<em><b>Collected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__COLLECTED = 9;

	/**
	 * The feature id for the '<em><b>Expires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__EXPIRES = 10;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__REMARKS = 11;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__UUID = 12;

	/**
	 * The number of structural features of the '<em>Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.OriginActorImpl <em>Origin Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.OriginActorImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getOriginActor()
	 * @generated
	 */
	int ORIGIN_ACTOR = 63;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_ACTOR__PROP = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_ACTOR__LINK = 1;

	/**
	 * The feature id for the '<em><b>Actor Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_ACTOR__ACTOR_UUID = 2;

	/**
	 * The feature id for the '<em><b>Role Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_ACTOR__ROLE_ID = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_ACTOR__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Origin Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_ACTOR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Origin Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_ACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.OriginImpl <em>Origin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.OriginImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getOrigin()
	 * @generated
	 */
	int ORIGIN = 64;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN__ACTOR = 0;

	/**
	 * The feature id for the '<em><b>Related Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN__RELATED_TASK = 1;

	/**
	 * The number of structural features of the '<em>Origin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Origin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.RelatedObservationImpl <em>Related Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.RelatedObservationImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getRelatedObservation()
	 * @generated
	 */
	int RELATED_OBSERVATION = 65;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_OBSERVATION__REMARKS = 0;

	/**
	 * The feature id for the '<em><b>Observation Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_OBSERVATION__OBSERVATION_UUID = 1;

	/**
	 * The number of structural features of the '<em>Related Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_OBSERVATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Related Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_OBSERVATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.RelatedTaskImpl <em>Related Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.RelatedTaskImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getRelatedTask()
	 * @generated
	 */
	int RELATED_TASK = 66;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TASK__PROP = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TASK__LINK = 1;

	/**
	 * The feature id for the '<em><b>Responsible Party</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TASK__RESPONSIBLE_PARTY = 2;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TASK__SUBJECT = 3;

	/**
	 * The feature id for the '<em><b>Identified Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TASK__IDENTIFIED_SUBJECT = 4;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TASK__REMARKS = 5;

	/**
	 * The feature id for the '<em><b>Task Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TASK__TASK_UUID = 6;

	/**
	 * The number of structural features of the '<em>Related Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TASK_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Related Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ResponseImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 67;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__PROP = 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__LINK = 3;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__ORIGIN = 4;

	/**
	 * The feature id for the '<em><b>Required Asset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__REQUIRED_ASSET = 5;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__TASK = 6;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__REMARKS = 7;

	/**
	 * The feature id for the '<em><b>Lifecycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__LIFECYCLE = 8;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__UUID = 9;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ReviewedControlsImpl <em>Reviewed Controls</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ReviewedControlsImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getReviewedControls()
	 * @generated
	 */
	int REVIEWED_CONTROLS = 68;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEWED_CONTROLS__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEWED_CONTROLS__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEWED_CONTROLS__LINK = 2;

	/**
	 * The feature id for the '<em><b>Control Selection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEWED_CONTROLS__CONTROL_SELECTION = 3;

	/**
	 * The feature id for the '<em><b>Control Objective Selection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEWED_CONTROLS__CONTROL_OBJECTIVE_SELECTION = 4;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEWED_CONTROLS__REMARKS = 5;

	/**
	 * The number of structural features of the '<em>Reviewed Controls</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEWED_CONTROLS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Reviewed Controls</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEWED_CONTROLS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.RiskImpl <em>Risk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.RiskImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getRisk()
	 * @generated
	 */
	int RISK = 69;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__STATEMENT = 2;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__PROP = 3;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__LINK = 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__STATUS = 5;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__ORIGIN = 6;

	/**
	 * The feature id for the '<em><b>Threat Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__THREAT_ID = 7;

	/**
	 * The feature id for the '<em><b>Characterization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__CHARACTERIZATION = 8;

	/**
	 * The feature id for the '<em><b>Mitigating Factor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__MITIGATING_FACTOR = 9;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__DEADLINE = 10;

	/**
	 * The feature id for the '<em><b>Response</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__RESPONSE = 11;

	/**
	 * The feature id for the '<em><b>Risk Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__RISK_LOG = 12;

	/**
	 * The feature id for the '<em><b>Related Observation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__RELATED_OBSERVATION = 13;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__UUID = 14;

	/**
	 * The number of structural features of the '<em>Risk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Risk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.AssessmentSelectControlByIdImpl <em>Assessment Select Control By Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.AssessmentSelectControlByIdImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getAssessmentSelectControlById()
	 * @generated
	 */
	int ASSESSMENT_SELECT_CONTROL_BY_ID = 70;

	/**
	 * The feature id for the '<em><b>Statement Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_SELECT_CONTROL_BY_ID__STATEMENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Control Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_SELECT_CONTROL_BY_ID__CONTROL_ID = 1;

	/**
	 * The number of structural features of the '<em>Assessment Select Control By Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_SELECT_CONTROL_BY_ID_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Assessment Select Control By Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_SELECT_CONTROL_BY_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.SelectObjectiveByIdImpl <em>Select Objective By Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.SelectObjectiveByIdImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getSelectObjectiveById()
	 * @generated
	 */
	int SELECT_OBJECTIVE_BY_ID = 71;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OBJECTIVE_BY_ID__REMARKS = 0;

	/**
	 * The feature id for the '<em><b>Objective Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OBJECTIVE_BY_ID__OBJECTIVE_ID = 1;

	/**
	 * The number of structural features of the '<em>Select Objective By Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OBJECTIVE_BY_ID_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Select Objective By Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OBJECTIVE_BY_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.SelectSubjectByIdImpl <em>Select Subject By Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.SelectSubjectByIdImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getSelectSubjectById()
	 * @generated
	 */
	int SELECT_SUBJECT_BY_ID = 72;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_SUBJECT_BY_ID__PROP = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_SUBJECT_BY_ID__LINK = 1;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_SUBJECT_BY_ID__REMARKS = 2;

	/**
	 * The feature id for the '<em><b>Subject Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_SUBJECT_BY_ID__SUBJECT_UUID = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_SUBJECT_BY_ID__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Select Subject By Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_SUBJECT_BY_ID_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Select Subject By Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_SUBJECT_BY_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.SubjectReferenceImpl <em>Subject Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.SubjectReferenceImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getSubjectReference()
	 * @generated
	 */
	int SUBJECT_REFERENCE = 73;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_REFERENCE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_REFERENCE__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_REFERENCE__LINK = 2;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_REFERENCE__REMARKS = 3;

	/**
	 * The feature id for the '<em><b>Subject Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_REFERENCE__SUBJECT_UUID = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_REFERENCE__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Subject Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_REFERENCE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Subject Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.TaskImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 74;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PROP = 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__LINK = 3;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TIMING = 4;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DEPENDENCY = 5;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TASK = 6;

	/**
	 * The feature id for the '<em><b>Associated Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ASSOCIATED_ACTIVITY = 7;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SUBJECT = 8;

	/**
	 * The feature id for the '<em><b>Responsible Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RESPONSIBLE_ROLE = 9;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__REMARKS = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TYPE = 11;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__UUID = 12;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ThreatIdImpl <em>Threat Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ThreatIdImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getThreatId()
	 * @generated
	 */
	int THREAT_ID = 75;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ID__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ID__HREF = 1;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ID__SYSTEM = 2;

	/**
	 * The number of structural features of the '<em>Threat Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ID_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Threat Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.CatalogImpl <em>Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.CatalogImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getCatalog()
	 * @generated
	 */
	int CATALOG = 76;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__METADATA = 0;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__PARAM = 1;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__CONTROL = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__GROUP = 3;

	/**
	 * The feature id for the '<em><b>Back Matter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__BACK_MATTER = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__UUID = 5;

	/**
	 * The number of structural features of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ControlImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 77;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__PARAM = 1;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__PROP = 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__LINK = 3;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__PART = 4;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CONTROL = 5;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CLASS = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__ID = 7;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.CatalogGroupImpl <em>Catalog Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.CatalogGroupImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getCatalogGroup()
	 * @generated
	 */
	int CATALOG_GROUP = 78;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_GROUP__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_GROUP__PARAM = 1;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_GROUP__PROP = 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_GROUP__LINK = 3;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_GROUP__PART = 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_GROUP__GROUP = 5;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_GROUP__CONTROL = 6;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_GROUP__CLASS = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_GROUP__ID = 8;

	/**
	 * The number of structural features of the '<em>Catalog Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_GROUP_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Catalog Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.CapabilityImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 79;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__LINK = 2;

	/**
	 * The feature id for the '<em><b>Incorporates Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__INCORPORATES_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Control Implementation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__CONTROL_IMPLEMENTATION = 4;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__REMARKS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME = 6;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__UUID = 7;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ComponentDefinitionImpl <em>Component Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ComponentDefinitionImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getComponentDefinition()
	 * @generated
	 */
	int COMPONENT_DEFINITION = 80;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION__METADATA = 0;

	/**
	 * The feature id for the '<em><b>Import Component Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION__IMPORT_COMPONENT_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION__COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION__CAPABILITY = 3;

	/**
	 * The feature id for the '<em><b>Back Matter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION__BACK_MATTER = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION__UUID = 5;

	/**
	 * The number of structural features of the '<em>Component Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Component Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ComponentControlImplementationImpl <em>Component Control Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ComponentControlImplementationImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getComponentControlImplementation()
	 * @generated
	 */
	int COMPONENT_CONTROL_IMPLEMENTATION = 81;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONTROL_IMPLEMENTATION__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONTROL_IMPLEMENTATION__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONTROL_IMPLEMENTATION__LINK = 2;

	/**
	 * The feature id for the '<em><b>Set Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONTROL_IMPLEMENTATION__SET_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Implemented Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONTROL_IMPLEMENTATION__IMPLEMENTED_REQUIREMENT = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONTROL_IMPLEMENTATION__SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONTROL_IMPLEMENTATION__UUID = 6;

	/**
	 * The number of structural features of the '<em>Component Control Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONTROL_IMPLEMENTATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Component Control Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONTROL_IMPLEMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.DefinedComponentImpl <em>Defined Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.DefinedComponentImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getDefinedComponent()
	 * @generated
	 */
	int DEFINED_COMPONENT = 82;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_COMPONENT__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_COMPONENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_COMPONENT__PURPOSE = 2;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_COMPONENT__PROP = 3;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_COMPONENT__LINK = 4;

	/**
	 * The feature id for the '<em><b>Responsible Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_COMPONENT__RESPONSIBLE_ROLE = 5;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_COMPONENT__PROTOCOL = 6;

	/**
	 * The feature id for the '<em><b>Control Implementation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_COMPONENT__CONTROL_IMPLEMENTATION = 7;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_COMPONENT__REMARKS = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_COMPONENT__TYPE = 9;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_COMPONENT__UUID = 10;

	/**
	 * The number of structural features of the '<em>Defined Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_COMPONENT_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Defined Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ComponentImplementedRequirementImpl <em>Component Implemented Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ComponentImplementedRequirementImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getComponentImplementedRequirement()
	 * @generated
	 */
	int COMPONENT_IMPLEMENTED_REQUIREMENT = 83;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTED_REQUIREMENT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTED_REQUIREMENT__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTED_REQUIREMENT__LINK = 2;

	/**
	 * The feature id for the '<em><b>Set Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTED_REQUIREMENT__SET_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Responsible Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTED_REQUIREMENT__RESPONSIBLE_ROLE = 4;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTED_REQUIREMENT__STATEMENT = 5;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTED_REQUIREMENT__REMARKS = 6;

	/**
	 * The feature id for the '<em><b>Control Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTED_REQUIREMENT__CONTROL_ID = 7;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTED_REQUIREMENT__UUID = 8;

	/**
	 * The number of structural features of the '<em>Component Implemented Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTED_REQUIREMENT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Component Implemented Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_IMPLEMENTED_REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ImportComponentDefinitionImpl <em>Import Component Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ImportComponentDefinitionImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getImportComponentDefinition()
	 * @generated
	 */
	int IMPORT_COMPONENT_DEFINITION = 84;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_COMPONENT_DEFINITION__REMARKS = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_COMPONENT_DEFINITION__HREF = 1;

	/**
	 * The number of structural features of the '<em>Import Component Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_COMPONENT_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Import Component Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_COMPONENT_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.IncorporatesComponentImpl <em>Incorporates Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.IncorporatesComponentImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getIncorporatesComponent()
	 * @generated
	 */
	int INCORPORATES_COMPONENT = 85;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCORPORATES_COMPONENT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Component Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCORPORATES_COMPONENT__COMPONENT_UUID = 1;

	/**
	 * The number of structural features of the '<em>Incorporates Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCORPORATES_COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Incorporates Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCORPORATES_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ComponentStatementImpl <em>Component Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ComponentStatementImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getComponentStatement()
	 * @generated
	 */
	int COMPONENT_STATEMENT = 86;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STATEMENT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STATEMENT__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STATEMENT__LINK = 2;

	/**
	 * The feature id for the '<em><b>Responsible Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STATEMENT__RESPONSIBLE_ROLE = 3;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STATEMENT__REMARKS = 4;

	/**
	 * The feature id for the '<em><b>Statement Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STATEMENT__STATEMENT_ID = 5;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STATEMENT__UUID = 6;

	/**
	 * The number of structural features of the '<em>Component Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STATEMENT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Component Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.IncludeAllImpl <em>Include All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.IncludeAllImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getIncludeAll()
	 * @generated
	 */
	int INCLUDE_ALL = 87;

	/**
	 * The number of structural features of the '<em>Include All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_ALL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Include All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_ALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.MatchingImpl <em>Matching</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.MatchingImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getMatching()
	 * @generated
	 */
	int MATCHING = 88;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING__REMARKS = 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING__PATTERN = 1;

	/**
	 * The number of structural features of the '<em>Matching</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Matching</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ParameterImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 89;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PROP = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LINK = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__USAGE = 3;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Guideline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__GUIDELINE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 6;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__SELECT = 7;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REMARKS = 8;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CLASS = 9;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEPENDS_ON = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ID = 11;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ParameterConstraintImpl <em>Parameter Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ParameterConstraintImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getParameterConstraint()
	 * @generated
	 */
	int PARAMETER_CONSTRAINT = 90;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONSTRAINT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONSTRAINT__TEST = 1;

	/**
	 * The number of structural features of the '<em>Parameter Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ParameterGuidelineImpl <em>Parameter Guideline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ParameterGuidelineImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getParameterGuideline()
	 * @generated
	 */
	int PARAMETER_GUIDELINE = 91;

	/**
	 * The feature id for the '<em><b>Block Element Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GUIDELINE__BLOCK_ELEMENT_GROUP = 0;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GUIDELINE__H1 = 1;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GUIDELINE__H2 = 2;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GUIDELINE__H3 = 3;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GUIDELINE__H4 = 4;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GUIDELINE__H5 = 5;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GUIDELINE__H6 = 6;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GUIDELINE__UL = 7;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GUIDELINE__OL = 8;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GUIDELINE__PRE = 9;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GUIDELINE__HR = 10;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GUIDELINE__BLOCKQUOTE = 11;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GUIDELINE__P = 12;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GUIDELINE__TABLE = 13;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GUIDELINE__IMG = 14;

	/**
	 * The number of structural features of the '<em>Parameter Guideline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GUIDELINE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Parameter Guideline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GUIDELINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ParameterSelectionImpl <em>Parameter Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ParameterSelectionImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getParameterSelection()
	 * @generated
	 */
	int PARAMETER_SELECTION = 92;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SELECTION__CHOICE = 0;

	/**
	 * The feature id for the '<em><b>How Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SELECTION__HOW_MANY = 1;

	/**
	 * The number of structural features of the '<em>Parameter Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SELECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SELECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.PartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.PartImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getPart()
	 * @generated
	 */
	int PART = 93;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__PROP = 1;

	/**
	 * The feature id for the '<em><b>Block Element Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__BLOCK_ELEMENT_GROUP = 2;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__H1 = 3;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__H2 = 4;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__H3 = 5;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__H4 = 6;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__H5 = 7;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__H6 = 8;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__UL = 9;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__OL = 10;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__PRE = 11;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__HR = 12;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__BLOCKQUOTE = 13;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__P = 14;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__TABLE = 15;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__IMG = 16;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__PART = 17;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__LINK = 18;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__CLASS = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__ID = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__NAME = 21;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__NS = 22;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FEATURE_COUNT = 23;

	/**
	 * The number of operations of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ControlSelectControlByIdImpl <em>Control Select Control By Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ControlSelectControlByIdImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getControlSelectControlById()
	 * @generated
	 */
	int CONTROL_SELECT_CONTROL_BY_ID = 94;

	/**
	 * The feature id for the '<em><b>With Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SELECT_CONTROL_BY_ID__WITH_ID = 0;

	/**
	 * The feature id for the '<em><b>Matching</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SELECT_CONTROL_BY_ID__MATCHING = 1;

	/**
	 * The feature id for the '<em><b>With Child Controls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SELECT_CONTROL_BY_ID__WITH_CHILD_CONTROLS = 2;

	/**
	 * The number of structural features of the '<em>Control Select Control By Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SELECT_CONTROL_BY_ID_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Control Select Control By Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SELECT_CONTROL_BY_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.AuthorizedPrivilegeImpl <em>Authorized Privilege</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.AuthorizedPrivilegeImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getAuthorizedPrivilege()
	 * @generated
	 */
	int AUTHORIZED_PRIVILEGE = 95;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZED_PRIVILEGE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZED_PRIVILEGE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Function Performed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZED_PRIVILEGE__FUNCTION_PERFORMED = 2;

	/**
	 * The number of structural features of the '<em>Authorized Privilege</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZED_PRIVILEGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Authorized Privilege</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZED_PRIVILEGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ImplementationStatusImpl <em>Implementation Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ImplementationStatusImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getImplementationStatus()
	 * @generated
	 */
	int IMPLEMENTATION_STATUS = 96;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_STATUS__REMARKS = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_STATUS__STATE = 1;

	/**
	 * The number of structural features of the '<em>Implementation Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_STATUS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Implementation Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.InventoryItemImpl <em>Inventory Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.InventoryItemImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getInventoryItem()
	 * @generated
	 */
	int INVENTORY_ITEM = 97;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__LINK = 2;

	/**
	 * The feature id for the '<em><b>Responsible Party</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__RESPONSIBLE_PARTY = 3;

	/**
	 * The feature id for the '<em><b>Implemented Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__IMPLEMENTED_COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__REMARKS = 5;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM__UUID = 6;

	/**
	 * The number of structural features of the '<em>Inventory Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Inventory Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.PortRangeImpl <em>Port Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.PortRangeImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getPortRange()
	 * @generated
	 */
	int PORT_RANGE = 98;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RANGE__REMARKS = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RANGE__END = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RANGE__START = 2;

	/**
	 * The feature id for the '<em><b>Transport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RANGE__TRANSPORT = 3;

	/**
	 * The number of structural features of the '<em>Port Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RANGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Port Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ProtocolImpl <em>Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ProtocolImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 99;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Port Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__PORT_RANGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__NAME = 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__UUID = 3;

	/**
	 * The number of structural features of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.SetParameterImpl <em>Set Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.SetParameterImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getSetParameter()
	 * @generated
	 */
	int SET_PARAMETER = 100;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARAMETER__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARAMETER__REMARKS = 1;

	/**
	 * The feature id for the '<em><b>Param Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARAMETER__PARAM_ID = 2;

	/**
	 * The number of structural features of the '<em>Set Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Set Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.SystemComponentImpl <em>System Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.SystemComponentImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getSystemComponent()
	 * @generated
	 */
	int SYSTEM_COMPONENT = 101;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__PURPOSE = 2;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__PROP = 3;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__LINK = 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__STATUS = 5;

	/**
	 * The feature id for the '<em><b>Responsible Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__RESPONSIBLE_ROLE = 6;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__PROTOCOL = 7;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__REMARKS = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__TYPE = 9;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__UUID = 10;

	/**
	 * The number of structural features of the '<em>System Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>System Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.SystemIdImpl <em>System Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.SystemIdImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getSystemId()
	 * @generated
	 */
	int SYSTEM_ID = 102;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ID__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Identifier Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ID__IDENTIFIER_TYPE = 1;

	/**
	 * The number of structural features of the '<em>System Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ID_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>System Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.SystemUserImpl <em>System User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.SystemUserImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getSystemUser()
	 * @generated
	 */
	int SYSTEM_USER = 103;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_USER__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_USER__SHORT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_USER__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_USER__PROP = 3;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_USER__LINK = 4;

	/**
	 * The feature id for the '<em><b>Role Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_USER__ROLE_ID = 5;

	/**
	 * The feature id for the '<em><b>Authorized Privilege</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_USER__AUTHORIZED_PRIVILEGE = 6;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_USER__REMARKS = 7;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_USER__UUID = 8;

	/**
	 * The number of structural features of the '<em>System User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_USER_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>System User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ConfidenceScoreImpl <em>Confidence Score</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ConfidenceScoreImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getConfidenceScore()
	 * @generated
	 */
	int CONFIDENCE_SCORE = 104;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE_SCORE__CATEGORY = 0;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE_SCORE__PERCENTAGE = 1;

	/**
	 * The number of structural features of the '<em>Confidence Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE_SCORE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Confidence Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE_SCORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.CoverageImpl <em>Coverage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.CoverageImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getCoverage()
	 * @generated
	 */
	int COVERAGE = 105;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Generation Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE__GENERATION_METHOD = 1;

	/**
	 * The number of structural features of the '<em>Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.GapSummaryImpl <em>Gap Summary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.GapSummaryImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getGapSummary()
	 * @generated
	 */
	int GAP_SUMMARY = 106;

	/**
	 * The feature id for the '<em><b>Unmapped Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_SUMMARY__UNMAPPED_CONTROLS = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_SUMMARY__UUID = 1;

	/**
	 * The number of structural features of the '<em>Gap Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_SUMMARY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Gap Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_SUMMARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.MapEntryImpl <em>Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.MapEntryImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getMapEntry()
	 * @generated
	 */
	int MAP_ENTRY = 107;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ENTRY__RELATIONSHIP = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ENTRY__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ENTRY__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ENTRY__QUALIFIER = 3;

	/**
	 * The feature id for the '<em><b>Confidence Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ENTRY__CONFIDENCE_SCORE = 4;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ENTRY__COVERAGE = 5;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ENTRY__PROP = 6;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ENTRY__LINK = 7;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ENTRY__REMARKS = 8;

	/**
	 * The feature id for the '<em><b>Matching Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ENTRY__MATCHING_RATIONALE = 9;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ENTRY__NS = 10;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ENTRY__UUID = 11;

	/**
	 * The number of structural features of the '<em>Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ENTRY_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.MappingImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 108;

	/**
	 * The feature id for the '<em><b>Source Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__SOURCE_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__TARGET_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__MAP = 2;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__PROP = 3;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__LINK = 4;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__REMARKS = 5;

	/**
	 * The feature id for the '<em><b>Mapping Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__MAPPING_DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Source Gap Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__SOURCE_GAP_SUMMARY = 7;

	/**
	 * The feature id for the '<em><b>Target Gap Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__TARGET_GAP_SUMMARY = 8;

	/**
	 * The feature id for the '<em><b>Confidence Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__CONFIDENCE_SCORE = 9;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__COVERAGE = 10;

	/**
	 * The feature id for the '<em><b>Matching Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__MATCHING_RATIONALE = 11;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__METHOD = 12;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__STATUS = 13;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__UUID = 14;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.MappingItemImpl <em>Mapping Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.MappingItemImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getMappingItem()
	 * @generated
	 */
	int MAPPING_ITEM = 109;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ITEM__PROP = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ITEM__LINK = 1;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ITEM__REMARKS = 2;

	/**
	 * The feature id for the '<em><b>Id Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ITEM__ID_REF = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ITEM__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Mapping Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ITEM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Mapping Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.MappingProvenanceImpl <em>Mapping Provenance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.MappingProvenanceImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getMappingProvenance()
	 * @generated
	 */
	int MAPPING_PROVENANCE = 110;

	/**
	 * The feature id for the '<em><b>Confidence Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PROVENANCE__CONFIDENCE_SCORE = 0;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PROVENANCE__COVERAGE = 1;

	/**
	 * The feature id for the '<em><b>Mapping Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PROVENANCE__MAPPING_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Responsible Party</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PROVENANCE__RESPONSIBLE_PARTY = 3;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PROVENANCE__PROP = 4;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PROVENANCE__LINK = 5;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PROVENANCE__REMARKS = 6;

	/**
	 * The feature id for the '<em><b>Matching Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PROVENANCE__MATCHING_RATIONALE = 7;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PROVENANCE__METHOD = 8;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PROVENANCE__STATUS = 9;

	/**
	 * The number of structural features of the '<em>Mapping Provenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PROVENANCE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Mapping Provenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_PROVENANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.MappingResourceReferenceImpl <em>Mapping Resource Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.MappingResourceReferenceImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getMappingResourceReference()
	 * @generated
	 */
	int MAPPING_RESOURCE_REFERENCE = 111;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RESOURCE_REFERENCE__PROP = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RESOURCE_REFERENCE__LINK = 1;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RESOURCE_REFERENCE__REMARKS = 2;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RESOURCE_REFERENCE__HREF = 3;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RESOURCE_REFERENCE__NS = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RESOURCE_REFERENCE__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Mapping Resource Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RESOURCE_REFERENCE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Mapping Resource Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RESOURCE_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.QualifierItemImpl <em>Qualifier Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.QualifierItemImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getQualifierItem()
	 * @generated
	 */
	int QUALIFIER_ITEM = 112;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_ITEM__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_ITEM__REMARKS = 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_ITEM__CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_ITEM__PREDICATE = 3;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_ITEM__SUBJECT = 4;

	/**
	 * The number of structural features of the '<em>Qualifier Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_ITEM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Qualifier Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.MappingCollectionImpl <em>Mapping Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.MappingCollectionImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getMappingCollection()
	 * @generated
	 */
	int MAPPING_COLLECTION = 113;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_COLLECTION__METADATA = 0;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_COLLECTION__PROVENANCE = 1;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_COLLECTION__MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Back Matter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_COLLECTION__BACK_MATTER = 3;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_COLLECTION__UUID = 4;

	/**
	 * The number of structural features of the '<em>Mapping Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_COLLECTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Mapping Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_COLLECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ActionImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 114;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PROP = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__LINK = 1;

	/**
	 * The feature id for the '<em><b>Responsible Party</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__RESPONSIBLE_PARTY = 2;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__REMARKS = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DATE = 4;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SYSTEM = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__UUID = 7;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.AddressImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 115;

	/**
	 * The feature id for the '<em><b>Addr Line</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ADDR_LINE = 0;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CITY = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STATE = 2;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__POSTAL_CODE = 3;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__COUNTRY = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.BackMatterImpl <em>Back Matter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.BackMatterImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getBackMatter()
	 * @generated
	 */
	int BACK_MATTER = 116;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER__RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Back Matter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Back Matter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.DocumentIdImpl <em>Document Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.DocumentIdImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getDocumentId()
	 * @generated
	 */
	int DOCUMENT_ID = 117;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ID__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ID__SCHEME = 1;

	/**
	 * The number of structural features of the '<em>Document Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ID_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Document Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.HashImpl <em>Hash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.HashImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getHash()
	 * @generated
	 */
	int HASH = 118;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH__ALGORITHM = 1;

	/**
	 * The number of structural features of the '<em>Hash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.LinkImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 119;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__HREF = 1;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__MEDIA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__REL = 3;

	/**
	 * The feature id for the '<em><b>Resource Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__RESOURCE_FRAGMENT = 4;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.MetadataImpl <em>Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.MetadataImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getMetadata()
	 * @generated
	 */
	int METADATA = 120;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__PUBLISHED = 1;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__LAST_MODIFIED = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__VERSION = 3;

	/**
	 * The feature id for the '<em><b>Oscal Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__OSCAL_VERSION = 4;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__REVISIONS = 5;

	/**
	 * The feature id for the '<em><b>Document Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__DOCUMENT_ID = 6;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__PROP = 7;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__LINK = 8;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__ROLE = 9;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__LOCATION = 10;

	/**
	 * The feature id for the '<em><b>Party</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__PARTY = 11;

	/**
	 * The feature id for the '<em><b>Responsible Party</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__RESPONSIBLE_PARTY = 12;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__ACTION = 13;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__REMARKS = 14;

	/**
	 * The number of structural features of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.PropertyImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 121;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REMARKS = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__GROUP = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 3;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NS = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UUID = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 6;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ResponsiblePartyImpl <em>Responsible Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ResponsiblePartyImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getResponsibleParty()
	 * @generated
	 */
	int RESPONSIBLE_PARTY = 122;

	/**
	 * The feature id for the '<em><b>Party Uuid</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__PARTY_UUID = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__LINK = 2;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__REMARKS = 3;

	/**
	 * The feature id for the '<em><b>Role Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__ROLE_ID = 4;

	/**
	 * The number of structural features of the '<em>Responsible Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Responsible Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ResponsibleRoleImpl <em>Responsible Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ResponsibleRoleImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getResponsibleRole()
	 * @generated
	 */
	int RESPONSIBLE_ROLE = 123;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_ROLE__PROP = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_ROLE__LINK = 1;

	/**
	 * The feature id for the '<em><b>Party Uuid</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_ROLE__PARTY_UUID = 2;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_ROLE__REMARKS = 3;

	/**
	 * The feature id for the '<em><b>Role Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_ROLE__ROLE_ID = 4;

	/**
	 * The number of structural features of the '<em>Responsible Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_ROLE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Responsible Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.TelephoneNumberImpl <em>Telephone Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.TelephoneNumberImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getTelephoneNumber()
	 * @generated
	 */
	int TELEPHONE_NUMBER = 124;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Telephone Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Telephone Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.PoamLocalDefinitionsImpl <em>Poam Local Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.PoamLocalDefinitionsImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getPoamLocalDefinitions()
	 * @generated
	 */
	int POAM_LOCAL_DEFINITIONS = 125;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POAM_LOCAL_DEFINITIONS__COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Inventory Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POAM_LOCAL_DEFINITIONS__INVENTORY_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Assessment Assets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POAM_LOCAL_DEFINITIONS__ASSESSMENT_ASSETS = 2;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POAM_LOCAL_DEFINITIONS__REMARKS = 3;

	/**
	 * The number of structural features of the '<em>Poam Local Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POAM_LOCAL_DEFINITIONS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Poam Local Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POAM_LOCAL_DEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.PlanOfActionAndMilestonesImpl <em>Plan Of Action And Milestones</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.PlanOfActionAndMilestonesImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getPlanOfActionAndMilestones()
	 * @generated
	 */
	int PLAN_OF_ACTION_AND_MILESTONES = 126;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_ACTION_AND_MILESTONES__METADATA = 0;

	/**
	 * The feature id for the '<em><b>Import Ssp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_ACTION_AND_MILESTONES__IMPORT_SSP = 1;

	/**
	 * The feature id for the '<em><b>System Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_ACTION_AND_MILESTONES__SYSTEM_ID = 2;

	/**
	 * The feature id for the '<em><b>Local Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_ACTION_AND_MILESTONES__LOCAL_DEFINITIONS = 3;

	/**
	 * The feature id for the '<em><b>Observation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_ACTION_AND_MILESTONES__OBSERVATION = 4;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_ACTION_AND_MILESTONES__RISK = 5;

	/**
	 * The feature id for the '<em><b>Finding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_ACTION_AND_MILESTONES__FINDING = 6;

	/**
	 * The feature id for the '<em><b>Poam Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_ACTION_AND_MILESTONES__POAM_ITEM = 7;

	/**
	 * The feature id for the '<em><b>Back Matter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_ACTION_AND_MILESTONES__BACK_MATTER = 8;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_ACTION_AND_MILESTONES__UUID = 9;

	/**
	 * The number of structural features of the '<em>Plan Of Action And Milestones</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_ACTION_AND_MILESTONES_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Plan Of Action And Milestones</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OF_ACTION_AND_MILESTONES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.PoamItemImpl <em>Poam Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.PoamItemImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getPoamItem()
	 * @generated
	 */
	int POAM_ITEM = 127;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POAM_ITEM__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POAM_ITEM__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POAM_ITEM__PROP = 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POAM_ITEM__LINK = 3;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POAM_ITEM__ORIGIN = 4;

	/**
	 * The feature id for the '<em><b>Related Finding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POAM_ITEM__RELATED_FINDING = 5;

	/**
	 * The feature id for the '<em><b>Related Observation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POAM_ITEM__RELATED_OBSERVATION = 6;

	/**
	 * The feature id for the '<em><b>Associated Risk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POAM_ITEM__ASSOCIATED_RISK = 7;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POAM_ITEM__REMARKS = 8;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POAM_ITEM__UUID = 9;

	/**
	 * The number of structural features of the '<em>Poam Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POAM_ITEM_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Poam Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POAM_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ProfileGroupImpl <em>Profile Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ProfileGroupImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getProfileGroup()
	 * @generated
	 */
	int PROFILE_GROUP = 128;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_GROUP__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_GROUP__PARAM = 1;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_GROUP__PROP = 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_GROUP__LINK = 3;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_GROUP__PART = 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_GROUP__GROUP = 5;

	/**
	 * The feature id for the '<em><b>Insert Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_GROUP__INSERT_CONTROLS = 6;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_GROUP__CLASS = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_GROUP__ID = 8;

	/**
	 * The number of structural features of the '<em>Profile Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_GROUP_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Profile Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ImportImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 129;

	/**
	 * The feature id for the '<em><b>Include All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__INCLUDE_ALL = 0;

	/**
	 * The feature id for the '<em><b>Include Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__INCLUDE_CONTROLS = 1;

	/**
	 * The feature id for the '<em><b>Exclude Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__EXCLUDE_CONTROLS = 2;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__HREF = 3;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.InsertControlsImpl <em>Insert Controls</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.InsertControlsImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getInsertControls()
	 * @generated
	 */
	int INSERT_CONTROLS = 130;

	/**
	 * The feature id for the '<em><b>Include All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_CONTROLS__INCLUDE_ALL = 0;

	/**
	 * The feature id for the '<em><b>Include Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_CONTROLS__INCLUDE_CONTROLS = 1;

	/**
	 * The feature id for the '<em><b>Exclude Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_CONTROLS__EXCLUDE_CONTROLS = 2;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_CONTROLS__ORDER = 3;

	/**
	 * The number of structural features of the '<em>Insert Controls</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_CONTROLS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Insert Controls</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_CONTROLS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.MergeImpl <em>Merge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.MergeImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getMerge()
	 * @generated
	 */
	int MERGE = 131;

	/**
	 * The feature id for the '<em><b>Combine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__COMBINE = 0;

	/**
	 * The feature id for the '<em><b>Flat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__FLAT = 1;

	/**
	 * The feature id for the '<em><b>As Is</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__AS_IS = 2;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__CUSTOM = 3;

	/**
	 * The number of structural features of the '<em>Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ModifyImpl <em>Modify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ModifyImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getModify()
	 * @generated
	 */
	int MODIFY = 132;

	/**
	 * The feature id for the '<em><b>Set Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY__SET_PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Alter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY__ALTER = 1;

	/**
	 * The number of structural features of the '<em>Modify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Modify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ProfileImpl <em>Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ProfileImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getProfile()
	 * @generated
	 */
	int PROFILE = 133;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__METADATA = 0;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__IMPORT = 1;

	/**
	 * The feature id for the '<em><b>Merge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__MERGE = 2;

	/**
	 * The feature id for the '<em><b>Modify</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__MODIFY = 3;

	/**
	 * The feature id for the '<em><b>Back Matter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__BACK_MATTER = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__UUID = 5;

	/**
	 * The number of structural features of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.AuthorizationBoundaryImpl <em>Authorization Boundary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.AuthorizationBoundaryImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getAuthorizationBoundary()
	 * @generated
	 */
	int AUTHORIZATION_BOUNDARY = 134;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_BOUNDARY__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_BOUNDARY__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_BOUNDARY__LINK = 2;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_BOUNDARY__DIAGRAM = 3;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_BOUNDARY__REMARKS = 4;

	/**
	 * The number of structural features of the '<em>Authorization Boundary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_BOUNDARY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Authorization Boundary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_BOUNDARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ByComponentImpl <em>By Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ByComponentImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getByComponent()
	 * @generated
	 */
	int BY_COMPONENT = 135;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_COMPONENT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_COMPONENT__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_COMPONENT__LINK = 2;

	/**
	 * The feature id for the '<em><b>Set Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_COMPONENT__SET_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Implementation Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_COMPONENT__IMPLEMENTATION_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Export</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_COMPONENT__EXPORT = 5;

	/**
	 * The feature id for the '<em><b>Inherited</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_COMPONENT__INHERITED = 6;

	/**
	 * The feature id for the '<em><b>Satisfied</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_COMPONENT__SATISFIED = 7;

	/**
	 * The feature id for the '<em><b>Responsible Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_COMPONENT__RESPONSIBLE_ROLE = 8;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_COMPONENT__REMARKS = 9;

	/**
	 * The feature id for the '<em><b>Component Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_COMPONENT__COMPONENT_UUID = 10;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_COMPONENT__UUID = 11;

	/**
	 * The number of structural features of the '<em>By Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_COMPONENT_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>By Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.SspControlImplementationImpl <em>Ssp Control Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.SspControlImplementationImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getSspControlImplementation()
	 * @generated
	 */
	int SSP_CONTROL_IMPLEMENTATION = 136;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSP_CONTROL_IMPLEMENTATION__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Set Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSP_CONTROL_IMPLEMENTATION__SET_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Implemented Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSP_CONTROL_IMPLEMENTATION__IMPLEMENTED_REQUIREMENT = 2;

	/**
	 * The number of structural features of the '<em>Ssp Control Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSP_CONTROL_IMPLEMENTATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ssp Control Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSP_CONTROL_IMPLEMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.DataFlowImpl <em>Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.DataFlowImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getDataFlow()
	 * @generated
	 */
	int DATA_FLOW = 137;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__LINK = 2;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__DIAGRAM = 3;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__REMARKS = 4;

	/**
	 * The number of structural features of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.DiagramImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 138;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__LINK = 2;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__CAPTION = 3;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__REMARKS = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__UUID = 5;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ImpactImpl <em>Impact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ImpactImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getImpact()
	 * @generated
	 */
	int IMPACT = 139;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT__PROP = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT__LINK = 1;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT__BASE = 2;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT__SELECTED = 3;

	/**
	 * The feature id for the '<em><b>Adjustment Justification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT__ADJUSTMENT_JUSTIFICATION = 4;

	/**
	 * The number of structural features of the '<em>Impact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Impact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.SspImplementedRequirementImpl <em>Ssp Implemented Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.SspImplementedRequirementImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getSspImplementedRequirement()
	 * @generated
	 */
	int SSP_IMPLEMENTED_REQUIREMENT = 140;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSP_IMPLEMENTED_REQUIREMENT__PROP = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSP_IMPLEMENTED_REQUIREMENT__LINK = 1;

	/**
	 * The feature id for the '<em><b>Set Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSP_IMPLEMENTED_REQUIREMENT__SET_PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Responsible Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSP_IMPLEMENTED_REQUIREMENT__RESPONSIBLE_ROLE = 3;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSP_IMPLEMENTED_REQUIREMENT__STATEMENT = 4;

	/**
	 * The feature id for the '<em><b>By Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSP_IMPLEMENTED_REQUIREMENT__BY_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSP_IMPLEMENTED_REQUIREMENT__REMARKS = 6;

	/**
	 * The feature id for the '<em><b>Control Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSP_IMPLEMENTED_REQUIREMENT__CONTROL_ID = 7;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSP_IMPLEMENTED_REQUIREMENT__UUID = 8;

	/**
	 * The number of structural features of the '<em>Ssp Implemented Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSP_IMPLEMENTED_REQUIREMENT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Ssp Implemented Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSP_IMPLEMENTED_REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ImportProfileImpl <em>Import Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ImportProfileImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getImportProfile()
	 * @generated
	 */
	int IMPORT_PROFILE = 141;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_PROFILE__REMARKS = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_PROFILE__HREF = 1;

	/**
	 * The number of structural features of the '<em>Import Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_PROFILE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Import Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_PROFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.NetworkArchitectureImpl <em>Network Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.NetworkArchitectureImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getNetworkArchitecture()
	 * @generated
	 */
	int NETWORK_ARCHITECTURE = 142;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ARCHITECTURE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ARCHITECTURE__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ARCHITECTURE__LINK = 2;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ARCHITECTURE__DIAGRAM = 3;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ARCHITECTURE__REMARKS = 4;

	/**
	 * The number of structural features of the '<em>Network Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ARCHITECTURE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Network Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ARCHITECTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.SecurityImpactLevelImpl <em>Security Impact Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.SecurityImpactLevelImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getSecurityImpactLevel()
	 * @generated
	 */
	int SECURITY_IMPACT_LEVEL = 143;

	/**
	 * The feature id for the '<em><b>Security Objective Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_IMPACT_LEVEL__SECURITY_OBJECTIVE_CONFIDENTIALITY = 0;

	/**
	 * The feature id for the '<em><b>Security Objective Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_IMPACT_LEVEL__SECURITY_OBJECTIVE_INTEGRITY = 1;

	/**
	 * The feature id for the '<em><b>Security Objective Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_IMPACT_LEVEL__SECURITY_OBJECTIVE_AVAILABILITY = 2;

	/**
	 * The number of structural features of the '<em>Security Impact Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_IMPACT_LEVEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Security Impact Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_IMPACT_LEVEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.SspStatementImpl <em>Ssp Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.SspStatementImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getSspStatement()
	 * @generated
	 */
	int SSP_STATEMENT = 144;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSP_STATEMENT__PROP = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSP_STATEMENT__LINK = 1;

	/**
	 * The feature id for the '<em><b>Responsible Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSP_STATEMENT__RESPONSIBLE_ROLE = 2;

	/**
	 * The feature id for the '<em><b>By Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSP_STATEMENT__BY_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSP_STATEMENT__REMARKS = 4;

	/**
	 * The feature id for the '<em><b>Statement Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSP_STATEMENT__STATEMENT_ID = 5;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSP_STATEMENT__UUID = 6;

	/**
	 * The number of structural features of the '<em>Ssp Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSP_STATEMENT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Ssp Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSP_STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.SystemStatusImpl <em>System Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.SystemStatusImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getSystemStatus()
	 * @generated
	 */
	int SYSTEM_STATUS = 145;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STATUS__REMARKS = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STATUS__STATE = 1;

	/**
	 * The number of structural features of the '<em>System Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STATUS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>System Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.SystemCharacteristicsImpl <em>System Characteristics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.SystemCharacteristicsImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getSystemCharacteristics()
	 * @generated
	 */
	int SYSTEM_CHARACTERISTICS = 146;

	/**
	 * The feature id for the '<em><b>System Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CHARACTERISTICS__SYSTEM_ID = 0;

	/**
	 * The feature id for the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CHARACTERISTICS__SYSTEM_NAME = 1;

	/**
	 * The feature id for the '<em><b>System Name Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CHARACTERISTICS__SYSTEM_NAME_SHORT = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CHARACTERISTICS__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CHARACTERISTICS__PROP = 4;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CHARACTERISTICS__LINK = 5;

	/**
	 * The feature id for the '<em><b>Date Authorized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CHARACTERISTICS__DATE_AUTHORIZED = 6;

	/**
	 * The feature id for the '<em><b>Security Sensitivity Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CHARACTERISTICS__SECURITY_SENSITIVITY_LEVEL = 7;

	/**
	 * The feature id for the '<em><b>System Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CHARACTERISTICS__SYSTEM_INFORMATION = 8;

	/**
	 * The feature id for the '<em><b>Security Impact Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CHARACTERISTICS__SECURITY_IMPACT_LEVEL = 9;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CHARACTERISTICS__STATUS = 10;

	/**
	 * The feature id for the '<em><b>Authorization Boundary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CHARACTERISTICS__AUTHORIZATION_BOUNDARY = 11;

	/**
	 * The feature id for the '<em><b>Network Architecture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CHARACTERISTICS__NETWORK_ARCHITECTURE = 12;

	/**
	 * The feature id for the '<em><b>Data Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CHARACTERISTICS__DATA_FLOW = 13;

	/**
	 * The feature id for the '<em><b>Responsible Party</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CHARACTERISTICS__RESPONSIBLE_PARTY = 14;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CHARACTERISTICS__REMARKS = 15;

	/**
	 * The number of structural features of the '<em>System Characteristics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CHARACTERISTICS_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>System Characteristics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CHARACTERISTICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.SystemImplementationImpl <em>System Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.SystemImplementationImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getSystemImplementation()
	 * @generated
	 */
	int SYSTEM_IMPLEMENTATION = 147;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__PROP = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__LINK = 1;

	/**
	 * The feature id for the '<em><b>Leveraged Authorization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__LEVERAGED_AUTHORIZATION = 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__USER = 3;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Inventory Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__INVENTORY_ITEM = 5;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION__REMARKS = 6;

	/**
	 * The number of structural features of the '<em>System Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>System Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_IMPLEMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.SystemInformationImpl <em>System Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.SystemInformationImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getSystemInformation()
	 * @generated
	 */
	int SYSTEM_INFORMATION = 148;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMATION__PROP = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMATION__LINK = 1;

	/**
	 * The feature id for the '<em><b>Information Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMATION__INFORMATION_TYPE = 2;

	/**
	 * The number of structural features of the '<em>System Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>System Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.SystemSecurityPlanImpl <em>System Security Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.SystemSecurityPlanImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getSystemSecurityPlan()
	 * @generated
	 */
	int SYSTEM_SECURITY_PLAN = 149;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SECURITY_PLAN__METADATA = 0;

	/**
	 * The feature id for the '<em><b>Import Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SECURITY_PLAN__IMPORT_PROFILE = 1;

	/**
	 * The feature id for the '<em><b>System Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SECURITY_PLAN__SYSTEM_CHARACTERISTICS = 2;

	/**
	 * The feature id for the '<em><b>System Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SECURITY_PLAN__SYSTEM_IMPLEMENTATION = 3;

	/**
	 * The feature id for the '<em><b>Control Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SECURITY_PLAN__CONTROL_IMPLEMENTATION = 4;

	/**
	 * The feature id for the '<em><b>Back Matter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SECURITY_PLAN__BACK_MATTER = 5;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SECURITY_PLAN__UUID = 6;

	/**
	 * The number of structural features of the '<em>System Security Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SECURITY_PLAN_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>System Security Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SECURITY_PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.PartyImpl <em>Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.PartyImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getParty()
	 * @generated
	 */
	int PARTY = 150;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__SHORT_NAME = 1;

	/**
	 * The feature id for the '<em><b>External Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__EXTERNAL_ID = 2;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PROP = 3;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__LINK = 4;

	/**
	 * The feature id for the '<em><b>Email Address</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__EMAIL_ADDRESS = 5;

	/**
	 * The feature id for the '<em><b>Telephone Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__TELEPHONE_NUMBER = 6;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__ADDRESS = 7;

	/**
	 * The feature id for the '<em><b>Location Uuid</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__LOCATION_UUID = 8;

	/**
	 * The feature id for the '<em><b>Member Of Organization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__MEMBER_OF_ORGANIZATION = 9;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__REMARKS = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__TYPE = 11;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__UUID = 12;

	/**
	 * The number of structural features of the '<em>Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.MarkupPreformattedImpl <em>Markup Preformatted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.MarkupPreformattedImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getMarkupPreformatted()
	 * @generated
	 */
	int MARKUP_PREFORMATTED = 151;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_PREFORMATTED__MIXED = INLINE_MARKUP__MIXED;

	/**
	 * The feature id for the '<em><b>Inline Markup Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_PREFORMATTED__INLINE_MARKUP_GROUP = INLINE_MARKUP__INLINE_MARKUP_GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_PREFORMATTED__A = INLINE_MARKUP__A;

	/**
	 * The feature id for the '<em><b>Insert</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_PREFORMATTED__INSERT = INLINE_MARKUP__INSERT;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_PREFORMATTED__BR = INLINE_MARKUP__BR;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_PREFORMATTED__CODE = INLINE_MARKUP__CODE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_PREFORMATTED__EM = INLINE_MARKUP__EM;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_PREFORMATTED__I = INLINE_MARKUP__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_PREFORMATTED__B = INLINE_MARKUP__B;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_PREFORMATTED__STRONG = INLINE_MARKUP__STRONG;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_PREFORMATTED__SUB = INLINE_MARKUP__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_PREFORMATTED__SUP = INLINE_MARKUP__SUP;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_PREFORMATTED__Q = INLINE_MARKUP__Q;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_PREFORMATTED__IMG = INLINE_MARKUP__IMG;

	/**
	 * The number of structural features of the '<em>Markup Preformatted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_PREFORMATTED_FEATURE_COUNT = INLINE_MARKUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Markup Preformatted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_PREFORMATTED_OPERATION_COUNT = INLINE_MARKUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ProvidedImpl <em>Provided</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ProvidedImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getProvided()
	 * @generated
	 */
	int PROVIDED = 152;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED__LINK = 2;

	/**
	 * The feature id for the '<em><b>Responsible Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED__RESPONSIBLE_ROLE = 3;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED__REMARKS = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED__UUID = 5;

	/**
	 * The number of structural features of the '<em>Provided</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Provided</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.RelatedFindingImpl <em>Related Finding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.RelatedFindingImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getRelatedFinding()
	 * @generated
	 */
	int RELATED_FINDING = 153;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_FINDING__REMARKS = 0;

	/**
	 * The feature id for the '<em><b>Finding Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_FINDING__FINDING_UUID = 1;

	/**
	 * The number of structural features of the '<em>Related Finding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_FINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Related Finding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_FINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.RelatedResponseImpl <em>Related Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.RelatedResponseImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getRelatedResponse()
	 * @generated
	 */
	int RELATED_RESPONSE = 154;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_RESPONSE__PROP = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_RESPONSE__LINK = 1;

	/**
	 * The feature id for the '<em><b>Related Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_RESPONSE__RELATED_TASK = 2;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_RESPONSE__REMARKS = 3;

	/**
	 * The feature id for the '<em><b>Response Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_RESPONSE__RESPONSE_UUID = 4;

	/**
	 * The number of structural features of the '<em>Related Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_RESPONSE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Related Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.RelevantEvidenceImpl <em>Relevant Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.RelevantEvidenceImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getRelevantEvidence()
	 * @generated
	 */
	int RELEVANT_EVIDENCE = 155;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANT_EVIDENCE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANT_EVIDENCE__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANT_EVIDENCE__LINK = 2;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANT_EVIDENCE__REMARKS = 3;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANT_EVIDENCE__HREF = 4;

	/**
	 * The number of structural features of the '<em>Relevant Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANT_EVIDENCE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Relevant Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANT_EVIDENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.RemoveImpl <em>Remove</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.RemoveImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getRemove()
	 * @generated
	 */
	int REMOVE = 156;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__REMARKS = 0;

	/**
	 * The feature id for the '<em><b>By Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__BY_CLASS = 1;

	/**
	 * The feature id for the '<em><b>By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__BY_ID = 2;

	/**
	 * The feature id for the '<em><b>By Item Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__BY_ITEM_NAME = 3;

	/**
	 * The feature id for the '<em><b>By Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__BY_NAME = 4;

	/**
	 * The feature id for the '<em><b>By Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__BY_NS = 5;

	/**
	 * The number of structural features of the '<em>Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.RequiredAssetImpl <em>Required Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.RequiredAssetImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getRequiredAsset()
	 * @generated
	 */
	int REQUIRED_ASSET = 157;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ASSET__SUBJECT = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ASSET__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ASSET__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ASSET__PROP = 3;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ASSET__LINK = 4;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ASSET__REMARKS = 5;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ASSET__UUID = 6;

	/**
	 * The number of structural features of the '<em>Required Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ASSET_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Required Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ASSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.BackMatterResourceImpl <em>Back Matter Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.BackMatterResourceImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getBackMatterResource()
	 * @generated
	 */
	int BACK_MATTER_RESOURCE = 158;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_RESOURCE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_RESOURCE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_RESOURCE__PROP = 2;

	/**
	 * The feature id for the '<em><b>Document Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_RESOURCE__DOCUMENT_ID = 3;

	/**
	 * The feature id for the '<em><b>Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_RESOURCE__CITATION = 4;

	/**
	 * The feature id for the '<em><b>Rlink</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_RESOURCE__RLINK = 5;

	/**
	 * The feature id for the '<em><b>Base64</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_RESOURCE__BASE64 = 6;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_RESOURCE__REMARKS = 7;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_RESOURCE__UUID = 8;

	/**
	 * The number of structural features of the '<em>Back Matter Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_RESOURCE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Back Matter Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ResponsibilityImpl <em>Responsibility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ResponsibilityImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getResponsibility()
	 * @generated
	 */
	int RESPONSIBILITY = 159;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__LINK = 2;

	/**
	 * The feature id for the '<em><b>Responsible Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__RESPONSIBLE_ROLE = 3;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__REMARKS = 4;

	/**
	 * The feature id for the '<em><b>Provided Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__PROVIDED_UUID = 5;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__UUID = 6;

	/**
	 * The number of structural features of the '<em>Responsibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Responsibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.RevisionsImpl <em>Revisions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.RevisionsImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getRevisions()
	 * @generated
	 */
	int REVISIONS = 160;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISIONS__REVISION = 0;

	/**
	 * The number of structural features of the '<em>Revisions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Revisions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.RevisionImpl <em>Revision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.RevisionImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getRevision()
	 * @generated
	 */
	int REVISION = 161;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__PUBLISHED = 1;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__LAST_MODIFIED = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__VERSION = 3;

	/**
	 * The feature id for the '<em><b>Oscal Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__OSCAL_VERSION = 4;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__PROP = 5;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__LINK = 6;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__REMARKS = 7;

	/**
	 * The number of structural features of the '<em>Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.RiskLogImpl <em>Risk Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.RiskLogImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getRiskLog()
	 * @generated
	 */
	int RISK_LOG = 162;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LOG__ENTRY = 0;

	/**
	 * The number of structural features of the '<em>Risk Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LOG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Risk Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.RlinkImpl <em>Rlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.RlinkImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getRlink()
	 * @generated
	 */
	int RLINK = 163;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLINK__HASH = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLINK__HREF = 1;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLINK__MEDIA_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Rlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLINK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.RoleImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 164;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SHORT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PROP = 3;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__LINK = 4;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__REMARKS = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ID = 6;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.SatisfiedImpl <em>Satisfied</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.SatisfiedImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getSatisfied()
	 * @generated
	 */
	int SATISFIED = 165;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIED__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIED__PROP = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIED__LINK = 2;

	/**
	 * The feature id for the '<em><b>Responsible Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIED__RESPONSIBLE_ROLE = 3;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIED__REMARKS = 4;

	/**
	 * The feature id for the '<em><b>Responsibility Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIED__RESPONSIBILITY_UUID = 5;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIED__UUID = 6;

	/**
	 * The number of structural features of the '<em>Satisfied</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIED_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Satisfied</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ProfileSetParameterImpl <em>Profile Set Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ProfileSetParameterImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getProfileSetParameter()
	 * @generated
	 */
	int PROFILE_SET_PARAMETER = 166;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_SET_PARAMETER__PROP = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_SET_PARAMETER__LINK = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_SET_PARAMETER__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_SET_PARAMETER__USAGE = 3;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_SET_PARAMETER__CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Guideline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_SET_PARAMETER__GUIDELINE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_SET_PARAMETER__VALUE = 6;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_SET_PARAMETER__SELECT = 7;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_SET_PARAMETER__CLASS = 8;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_SET_PARAMETER__DEPENDS_ON = 9;

	/**
	 * The feature id for the '<em><b>Param Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_SET_PARAMETER__PARAM_ID = 10;

	/**
	 * The number of structural features of the '<em>Profile Set Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_SET_PARAMETER_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Profile Set Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_SET_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.PlaceholderSourceImpl <em>Placeholder Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.PlaceholderSourceImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getPlaceholderSource()
	 * @generated
	 */
	int PLACEHOLDER_SOURCE = 167;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_SOURCE__REMARKS = 0;

	/**
	 * The feature id for the '<em><b>Task Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_SOURCE__TASK_UUID = 1;

	/**
	 * The number of structural features of the '<em>Placeholder Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_SOURCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Placeholder Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.FindingTargetStatusImpl <em>Finding Target Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.FindingTargetStatusImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getFindingTargetStatus()
	 * @generated
	 */
	int FINDING_TARGET_STATUS = 168;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_TARGET_STATUS__REMARKS = 0;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_TARGET_STATUS__REASON = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_TARGET_STATUS__STATE = 2;

	/**
	 * The number of structural features of the '<em>Finding Target Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_TARGET_STATUS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Finding Target Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_TARGET_STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.SystemComponentStatusImpl <em>System Component Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.SystemComponentStatusImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getSystemComponentStatus()
	 * @generated
	 */
	int SYSTEM_COMPONENT_STATUS = 169;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT_STATUS__REMARKS = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT_STATUS__STATE = 1;

	/**
	 * The number of structural features of the '<em>System Component Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT_STATUS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>System Component Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT_STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.StepImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 170;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PROP = 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__LINK = 3;

	/**
	 * The feature id for the '<em><b>Reviewed Controls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__REVIEWED_CONTROLS = 4;

	/**
	 * The feature id for the '<em><b>Responsible Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__RESPONSIBLE_ROLE = 5;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__REMARKS = 6;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__UUID = 7;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.MarkupTableCellImpl <em>Markup Table Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.MarkupTableCellImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getMarkupTableCell()
	 * @generated
	 */
	int MARKUP_TABLE_CELL = 171;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_TABLE_CELL__MIXED = INLINE_MARKUP__MIXED;

	/**
	 * The feature id for the '<em><b>Inline Markup Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_TABLE_CELL__INLINE_MARKUP_GROUP = INLINE_MARKUP__INLINE_MARKUP_GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_TABLE_CELL__A = INLINE_MARKUP__A;

	/**
	 * The feature id for the '<em><b>Insert</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_TABLE_CELL__INSERT = INLINE_MARKUP__INSERT;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_TABLE_CELL__BR = INLINE_MARKUP__BR;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_TABLE_CELL__CODE = INLINE_MARKUP__CODE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_TABLE_CELL__EM = INLINE_MARKUP__EM;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_TABLE_CELL__I = INLINE_MARKUP__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_TABLE_CELL__B = INLINE_MARKUP__B;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_TABLE_CELL__STRONG = INLINE_MARKUP__STRONG;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_TABLE_CELL__SUB = INLINE_MARKUP__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_TABLE_CELL__SUP = INLINE_MARKUP__SUP;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_TABLE_CELL__Q = INLINE_MARKUP__Q;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_TABLE_CELL__IMG = INLINE_MARKUP__IMG;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_TABLE_CELL__ALIGN = INLINE_MARKUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Markup Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_TABLE_CELL_FEATURE_COUNT = INLINE_MARKUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Markup Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_TABLE_CELL_OPERATION_COUNT = INLINE_MARKUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.MarkupTableRowImpl <em>Markup Table Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.MarkupTableRowImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getMarkupTableRow()
	 * @generated
	 */
	int MARKUP_TABLE_ROW = 172;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_TABLE_ROW__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Td</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_TABLE_ROW__TD = 1;

	/**
	 * The feature id for the '<em><b>Th</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_TABLE_ROW__TH = 2;

	/**
	 * The number of structural features of the '<em>Markup Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_TABLE_ROW_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Markup Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_TABLE_ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.MarkupTableImpl <em>Markup Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.MarkupTableImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getMarkupTable()
	 * @generated
	 */
	int MARKUP_TABLE = 173;

	/**
	 * The feature id for the '<em><b>Tr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_TABLE__TR = 0;

	/**
	 * The number of structural features of the '<em>Markup Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_TABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Markup Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.TermsAndConditionsImpl <em>Terms And Conditions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.TermsAndConditionsImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getTermsAndConditions()
	 * @generated
	 */
	int TERMS_AND_CONDITIONS = 174;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMS_AND_CONDITIONS__PART = 0;

	/**
	 * The number of structural features of the '<em>Terms And Conditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMS_AND_CONDITIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Terms And Conditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMS_AND_CONDITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.ConstraintTestImpl <em>Constraint Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.ConstraintTestImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getConstraintTest()
	 * @generated
	 */
	int CONSTRAINT_TEST = 175;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TEST__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TEST__REMARKS = 1;

	/**
	 * The number of structural features of the '<em>Constraint Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TEST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constraint Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.TimingImpl <em>Timing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.TimingImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getTiming()
	 * @generated
	 */
	int TIMING = 176;

	/**
	 * The feature id for the '<em><b>On Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__ON_DATE = 0;

	/**
	 * The feature id for the '<em><b>Within Date Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__WITHIN_DATE_RANGE = 1;

	/**
	 * The feature id for the '<em><b>At Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__AT_FREQUENCY = 2;

	/**
	 * The number of structural features of the '<em>Timing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Timing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.UsesComponentImpl <em>Uses Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.UsesComponentImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getUsesComponent()
	 * @generated
	 */
	int USES_COMPONENT = 177;

	/**
	 * The feature id for the '<em><b>Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_COMPONENT__PROP = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_COMPONENT__LINK = 1;

	/**
	 * The feature id for the '<em><b>Responsible Party</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_COMPONENT__RESPONSIBLE_PARTY = 2;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_COMPONENT__REMARKS = 3;

	/**
	 * The feature id for the '<em><b>Component Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_COMPONENT__COMPONENT_UUID = 4;

	/**
	 * The number of structural features of the '<em>Uses Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_COMPONENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Uses Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.impl.WithinDateRangeImpl <em>Within Date Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.WithinDateRangeImpl
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getWithinDateRange()
	 * @generated
	 */
	int WITHIN_DATE_RANGE = 178;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN_DATE_RANGE__REMARKS = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN_DATE_RANGE__END = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN_DATE_RANGE__START = 2;

	/**
	 * The number of structural features of the '<em>Within Date Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN_DATE_RANGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Within Date Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN_DATE_RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.nist.csrc.ns.oscal.AlignType <em>Align Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.AlignType
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getAlignType()
	 * @generated
	 */
	int ALIGN_TYPE = 179;

	/**
	 * The meta object id for the '<em>Align Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.AlignType
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getAlignTypeObject()
	 * @generated
	 */
	int ALIGN_TYPE_OBJECT = 180;

	/**
	 * The meta object id for the '<em>As Is Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getAsIsType()
	 * @generated
	 */
	int AS_IS_TYPE = 181;

	/**
	 * The meta object id for the '<em>As Is Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getAsIsTypeObject()
	 * @generated
	 */
	int AS_IS_TYPE_OBJECT = 182;

	/**
	 * The meta object id for the '<em>Base64 Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getBase64Datatype()
	 * @generated
	 */
	int BASE64_DATATYPE = 183;

	/**
	 * The meta object id for the '<em>Boolean Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getBooleanDatatype()
	 * @generated
	 */
	int BOOLEAN_DATATYPE = 184;

	/**
	 * The meta object id for the '<em>Boolean Datatype Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getBooleanDatatypeObject()
	 * @generated
	 */
	int BOOLEAN_DATATYPE_OBJECT = 185;

	/**
	 * The meta object id for the '<em>Category Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getCategoryType()
	 * @generated
	 */
	int CATEGORY_TYPE = 186;

	/**
	 * The meta object id for the '<em>City Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getCityType()
	 * @generated
	 */
	int CITY_TYPE = 187;

	/**
	 * The meta object id for the '<em>Collected Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getCollectedType()
	 * @generated
	 */
	int COLLECTED_TYPE = 188;

	/**
	 * The meta object id for the '<em>Country Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getCountryType()
	 * @generated
	 */
	int COUNTRY_TYPE = 189;

	/**
	 * The meta object id for the '<em>Date Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getDateDatatype()
	 * @generated
	 */
	int DATE_DATATYPE = 190;

	/**
	 * The meta object id for the '<em>Date Time Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getDateTimeDatatype()
	 * @generated
	 */
	int DATE_TIME_DATATYPE = 191;

	/**
	 * The meta object id for the '<em>Date Time With Timezone Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getDateTimeWithTimezoneDatatype()
	 * @generated
	 */
	int DATE_TIME_WITH_TIMEZONE_DATATYPE = 192;

	/**
	 * The meta object id for the '<em>Deadline Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getDeadlineType()
	 * @generated
	 */
	int DEADLINE_TYPE = 193;

	/**
	 * The meta object id for the '<em>Decimal Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getDecimalDatatype()
	 * @generated
	 */
	int DECIMAL_DATATYPE = 194;

	/**
	 * The meta object id for the '<em>Email Address Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getEmailAddressDatatype()
	 * @generated
	 */
	int EMAIL_ADDRESS_DATATYPE = 195;

	/**
	 * The meta object id for the '<em>End Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getEndType()
	 * @generated
	 */
	int END_TYPE = 196;

	/**
	 * The meta object id for the '<em>End Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getEndType1()
	 * @generated
	 */
	int END_TYPE1 = 197;

	/**
	 * The meta object id for the '<em>End Type2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getEndType2()
	 * @generated
	 */
	int END_TYPE2 = 198;

	/**
	 * The meta object id for the '<em>Expires Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getExpiresType()
	 * @generated
	 */
	int EXPIRES_TYPE = 199;

	/**
	 * The meta object id for the '<em>Expression Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getExpressionType()
	 * @generated
	 */
	int EXPRESSION_TYPE = 200;

	/**
	 * The meta object id for the '<em>Implementation Statement Uuid Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getImplementationStatementUuidType()
	 * @generated
	 */
	int IMPLEMENTATION_STATEMENT_UUID_TYPE = 201;

	/**
	 * The meta object id for the '<em>Information Type Id Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getInformationTypeIdType()
	 * @generated
	 */
	int INFORMATION_TYPE_ID_TYPE = 202;

	/**
	 * The meta object id for the '<em>Member Of Organization Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getMemberOfOrganizationType()
	 * @generated
	 */
	int MEMBER_OF_ORGANIZATION_TYPE = 203;

	/**
	 * The meta object id for the '<em>Method Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getMethodType()
	 * @generated
	 */
	int METHOD_TYPE = 204;

	/**
	 * The meta object id for the '<em>Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getNameType()
	 * @generated
	 */
	int NAME_TYPE = 205;

	/**
	 * The meta object id for the '<em>Non Negative Integer Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getNonNegativeIntegerDatatype()
	 * @generated
	 */
	int NON_NEGATIVE_INTEGER_DATATYPE = 206;

	/**
	 * The meta object id for the '<em>Oscal Assessment Common Risk Status FIELD</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getOscalAssessmentCommonRiskStatusFIELD()
	 * @generated
	 */
	int OSCAL_ASSESSMENT_COMMON_RISK_STATUS_FIELD = 207;

	/**
	 * The meta object id for the '<em>Oscal Control Common Parameter Value FIELD</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getOscalControlCommonParameterValueFIELD()
	 * @generated
	 */
	int OSCAL_CONTROL_COMMON_PARAMETER_VALUE_FIELD = 208;

	/**
	 * The meta object id for the '<em>Oscal Control Common With Id FIELD</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getOscalControlCommonWithIdFIELD()
	 * @generated
	 */
	int OSCAL_CONTROL_COMMON_WITH_ID_FIELD = 209;

	/**
	 * The meta object id for the '<em>Oscal Implementation Common Function Performed FIELD</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getOscalImplementationCommonFunctionPerformedFIELD()
	 * @generated
	 */
	int OSCAL_IMPLEMENTATION_COMMON_FUNCTION_PERFORMED_FIELD = 210;

	/**
	 * The meta object id for the '<em>Oscal Mapping Common Percentage FIELD</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getOscalMappingCommonPercentageFIELD()
	 * @generated
	 */
	int OSCAL_MAPPING_COMMON_PERCENTAGE_FIELD = 211;

	/**
	 * The meta object id for the '<em>Oscal Metadata Addr Line FIELD</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getOscalMetadataAddrLineFIELD()
	 * @generated
	 */
	int OSCAL_METADATA_ADDR_LINE_FIELD = 212;

	/**
	 * The meta object id for the '<em>Oscal Metadata Email Address FIELD</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getOscalMetadataEmailAddressFIELD()
	 * @generated
	 */
	int OSCAL_METADATA_EMAIL_ADDRESS_FIELD = 213;

	/**
	 * The meta object id for the '<em>Oscal Metadata Last Modified FIELD</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getOscalMetadataLastModifiedFIELD()
	 * @generated
	 */
	int OSCAL_METADATA_LAST_MODIFIED_FIELD = 214;

	/**
	 * The meta object id for the '<em>Oscal Metadata Location Uuid FIELD</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getOscalMetadataLocationUuidFIELD()
	 * @generated
	 */
	int OSCAL_METADATA_LOCATION_UUID_FIELD = 215;

	/**
	 * The meta object id for the '<em>Oscal Metadata Oscal Version FIELD</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getOscalMetadataOscalVersionFIELD()
	 * @generated
	 */
	int OSCAL_METADATA_OSCAL_VERSION_FIELD = 216;

	/**
	 * The meta object id for the '<em>Oscal Metadata Party Uuid FIELD</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getOscalMetadataPartyUuidFIELD()
	 * @generated
	 */
	int OSCAL_METADATA_PARTY_UUID_FIELD = 217;

	/**
	 * The meta object id for the '<em>Oscal Metadata Published FIELD</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getOscalMetadataPublishedFIELD()
	 * @generated
	 */
	int OSCAL_METADATA_PUBLISHED_FIELD = 218;

	/**
	 * The meta object id for the '<em>Oscal Metadata Role Id FIELD</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getOscalMetadataRoleIdFIELD()
	 * @generated
	 */
	int OSCAL_METADATA_ROLE_ID_FIELD = 219;

	/**
	 * The meta object id for the '<em>Oscal Metadata Version FIELD</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getOscalMetadataVersionFIELD()
	 * @generated
	 */
	int OSCAL_METADATA_VERSION_FIELD = 220;

	/**
	 * The meta object id for the '<em>Oscal Ssp Base FIELD</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getOscalSspBaseFIELD()
	 * @generated
	 */
	int OSCAL_SSP_BASE_FIELD = 221;

	/**
	 * The meta object id for the '<em>Oscal Ssp Date Authorized FIELD</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getOscalSspDateAuthorizedFIELD()
	 * @generated
	 */
	int OSCAL_SSP_DATE_AUTHORIZED_FIELD = 222;

	/**
	 * The meta object id for the '<em>Oscal Ssp Selected FIELD</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getOscalSspSelectedFIELD()
	 * @generated
	 */
	int OSCAL_SSP_SELECTED_FIELD = 223;

	/**
	 * The meta object id for the '<em>Party Uuid Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getPartyUuidType()
	 * @generated
	 */
	int PARTY_UUID_TYPE = 224;

	/**
	 * The meta object id for the '<em>Positive Integer Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getPositiveIntegerDatatype()
	 * @generated
	 */
	int POSITIVE_INTEGER_DATATYPE = 225;

	/**
	 * The meta object id for the '<em>Postal Code Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getPostalCodeType()
	 * @generated
	 */
	int POSTAL_CODE_TYPE = 226;

	/**
	 * The meta object id for the '<em>Relationship Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getRelationshipType()
	 * @generated
	 */
	int RELATIONSHIP_TYPE = 227;

	/**
	 * The meta object id for the '<em>Security Objective Availability Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getSecurityObjectiveAvailabilityType()
	 * @generated
	 */
	int SECURITY_OBJECTIVE_AVAILABILITY_TYPE = 228;

	/**
	 * The meta object id for the '<em>Security Objective Confidentiality Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getSecurityObjectiveConfidentialityType()
	 * @generated
	 */
	int SECURITY_OBJECTIVE_CONFIDENTIALITY_TYPE = 229;

	/**
	 * The meta object id for the '<em>Security Objective Integrity Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getSecurityObjectiveIntegrityType()
	 * @generated
	 */
	int SECURITY_OBJECTIVE_INTEGRITY_TYPE = 230;

	/**
	 * The meta object id for the '<em>Security Sensitivity Level Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getSecuritySensitivityLevelType()
	 * @generated
	 */
	int SECURITY_SENSITIVITY_LEVEL_TYPE = 231;

	/**
	 * The meta object id for the '<em>Short Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getShortNameType()
	 * @generated
	 */
	int SHORT_NAME_TYPE = 232;

	/**
	 * The meta object id for the '<em>Short Name Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getShortNameType1()
	 * @generated
	 */
	int SHORT_NAME_TYPE1 = 233;

	/**
	 * The meta object id for the '<em>Short Name Type2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getShortNameType2()
	 * @generated
	 */
	int SHORT_NAME_TYPE2 = 234;

	/**
	 * The meta object id for the '<em>Start Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getStartType()
	 * @generated
	 */
	int START_TYPE = 235;

	/**
	 * The meta object id for the '<em>Start Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getStartType1()
	 * @generated
	 */
	int START_TYPE1 = 236;

	/**
	 * The meta object id for the '<em>Start Type2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getStartType2()
	 * @generated
	 */
	int START_TYPE2 = 237;

	/**
	 * The meta object id for the '<em>Statement Id Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getStatementIdType()
	 * @generated
	 */
	int STATEMENT_ID_TYPE = 238;

	/**
	 * The meta object id for the '<em>State Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getStateType()
	 * @generated
	 */
	int STATE_TYPE = 239;

	/**
	 * The meta object id for the '<em>String Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getStringDatatype()
	 * @generated
	 */
	int STRING_DATATYPE = 240;

	/**
	 * The meta object id for the '<em>System Name Short Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getSystemNameShortType()
	 * @generated
	 */
	int SYSTEM_NAME_SHORT_TYPE = 241;

	/**
	 * The meta object id for the '<em>System Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getSystemNameType()
	 * @generated
	 */
	int SYSTEM_NAME_TYPE = 242;

	/**
	 * The meta object id for the '<em>Token Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getTokenDatatype()
	 * @generated
	 */
	int TOKEN_DATATYPE = 243;

	/**
	 * The meta object id for the '<em>Type Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 244;

	/**
	 * The meta object id for the '<em>URI Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getURIDatatype()
	 * @generated
	 */
	int URI_DATATYPE = 245;

	/**
	 * The meta object id for the '<em>URI Reference Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getURIReferenceDatatype()
	 * @generated
	 */
	int URI_REFERENCE_DATATYPE = 246;

	/**
	 * The meta object id for the '<em>Url Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getUrlType()
	 * @generated
	 */
	int URL_TYPE = 247;

	/**
	 * The meta object id for the '<em>UUID Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getUUIDDatatype()
	 * @generated
	 */
	int UUID_DATATYPE = 248;

	/**
	 * The meta object id for the '<em>Value Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nist.csrc.ns.oscal.impl.OSCALPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 249;


	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add</em>'.
	 * @see gov.nist.csrc.ns.oscal.Add
	 * @generated
	 */
	EClass getAdd();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Add#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.Add#getTitle()
	 * @see #getAdd()
	 * @generated
	 */
	EReference getAdd_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Add#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see gov.nist.csrc.ns.oscal.Add#getParam()
	 * @see #getAdd()
	 * @generated
	 */
	EReference getAdd_Param();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Add#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Add#getProp()
	 * @see #getAdd()
	 * @generated
	 */
	EReference getAdd_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Add#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Add#getLink()
	 * @see #getAdd()
	 * @generated
	 */
	EReference getAdd_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Add#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see gov.nist.csrc.ns.oscal.Add#getPart()
	 * @see #getAdd()
	 * @generated
	 */
	EReference getAdd_Part();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Add#getById <em>By Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.Add#getById()
	 * @see #getAdd()
	 * @generated
	 */
	EAttribute getAdd_ById();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Add#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see gov.nist.csrc.ns.oscal.Add#getPosition()
	 * @see #getAdd()
	 * @generated
	 */
	EAttribute getAdd_Position();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Alter <em>Alter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alter</em>'.
	 * @see gov.nist.csrc.ns.oscal.Alter
	 * @generated
	 */
	EClass getAlter();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Alter#getRemove <em>Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Remove</em>'.
	 * @see gov.nist.csrc.ns.oscal.Alter#getRemove()
	 * @see #getAlter()
	 * @generated
	 */
	EReference getAlter_Remove();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Alter#getAdd <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add</em>'.
	 * @see gov.nist.csrc.ns.oscal.Alter#getAdd()
	 * @see #getAlter()
	 * @generated
	 */
	EReference getAlter_Add();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Alter#getControlId <em>Control Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.Alter#getControlId()
	 * @see #getAlter()
	 * @generated
	 */
	EAttribute getAlter_ControlId();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.MarkupAnchor <em>Markup Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markup Anchor</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupAnchor
	 * @generated
	 */
	EClass getMarkupAnchor();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupAnchor#getMixed()
	 * @see #getMarkupAnchor()
	 * @generated
	 */
	EAttribute getMarkupAnchor_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getPhraseMarkupGroup <em>Phrase Markup Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Phrase Markup Group</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupAnchor#getPhraseMarkupGroup()
	 * @see #getMarkupAnchor()
	 * @generated
	 */
	EAttribute getMarkupAnchor_PhraseMarkupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupAnchor#getCode()
	 * @see #getMarkupAnchor()
	 * @generated
	 */
	EReference getMarkupAnchor_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupAnchor#getEm()
	 * @see #getMarkupAnchor()
	 * @generated
	 */
	EReference getMarkupAnchor_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupAnchor#getI()
	 * @see #getMarkupAnchor()
	 * @generated
	 */
	EReference getMarkupAnchor_I();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupAnchor#getB()
	 * @see #getMarkupAnchor()
	 * @generated
	 */
	EReference getMarkupAnchor_B();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupAnchor#getStrong()
	 * @see #getMarkupAnchor()
	 * @generated
	 */
	EReference getMarkupAnchor_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupAnchor#getSub()
	 * @see #getMarkupAnchor()
	 * @generated
	 */
	EReference getMarkupAnchor_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupAnchor#getSup()
	 * @see #getMarkupAnchor()
	 * @generated
	 */
	EReference getMarkupAnchor_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupAnchor#getQ()
	 * @see #getMarkupAnchor()
	 * @generated
	 */
	EReference getMarkupAnchor_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getImg <em>Img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Img</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupAnchor#getImg()
	 * @see #getMarkupAnchor()
	 * @generated
	 */
	EReference getMarkupAnchor_Img();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupAnchor#getHref()
	 * @see #getMarkupAnchor()
	 * @generated
	 */
	EAttribute getMarkupAnchor_Href();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.MarkupAnchor#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupAnchor#getTitle()
	 * @see #getMarkupAnchor()
	 * @generated
	 */
	EAttribute getMarkupAnchor_Title();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.AssessmentLog <em>Assessment Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment Log</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentLog
	 * @generated
	 */
	EClass getAssessmentLog();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentLog#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentLog#getEntry()
	 * @see #getAssessmentLog()
	 * @generated
	 */
	EReference getAssessmentLog_Entry();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.AssessmentPlatform <em>Assessment Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment Platform</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlatform
	 * @generated
	 */
	EClass getAssessmentPlatform();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssessmentPlatform#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlatform#getTitle()
	 * @see #getAssessmentPlatform()
	 * @generated
	 */
	EReference getAssessmentPlatform_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentPlatform#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlatform#getProp()
	 * @see #getAssessmentPlatform()
	 * @generated
	 */
	EReference getAssessmentPlatform_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentPlatform#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlatform#getLink()
	 * @see #getAssessmentPlatform()
	 * @generated
	 */
	EReference getAssessmentPlatform_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentPlatform#getUsesComponent <em>Uses Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses Component</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlatform#getUsesComponent()
	 * @see #getAssessmentPlatform()
	 * @generated
	 */
	EReference getAssessmentPlatform_UsesComponent();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssessmentPlatform#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlatform#getRemarks()
	 * @see #getAssessmentPlatform()
	 * @generated
	 */
	EReference getAssessmentPlatform_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.AssessmentPlatform#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlatform#getUuid()
	 * @see #getAssessmentPlatform()
	 * @generated
	 */
	EAttribute getAssessmentPlatform_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.AssociatedActivity <em>Associated Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Associated Activity</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssociatedActivity
	 * @generated
	 */
	EClass getAssociatedActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssociatedActivity#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssociatedActivity#getProp()
	 * @see #getAssociatedActivity()
	 * @generated
	 */
	EReference getAssociatedActivity_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssociatedActivity#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssociatedActivity#getLink()
	 * @see #getAssociatedActivity()
	 * @generated
	 */
	EReference getAssociatedActivity_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssociatedActivity#getResponsibleRole <em>Responsible Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible Role</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssociatedActivity#getResponsibleRole()
	 * @see #getAssociatedActivity()
	 * @generated
	 */
	EReference getAssociatedActivity_ResponsibleRole();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssociatedActivity#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subject</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssociatedActivity#getSubject()
	 * @see #getAssociatedActivity()
	 * @generated
	 */
	EReference getAssociatedActivity_Subject();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssociatedActivity#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssociatedActivity#getRemarks()
	 * @see #getAssociatedActivity()
	 * @generated
	 */
	EReference getAssociatedActivity_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.AssociatedActivity#getActivityUuid <em>Activity Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssociatedActivity#getActivityUuid()
	 * @see #getAssociatedActivity()
	 * @generated
	 */
	EAttribute getAssociatedActivity_ActivityUuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.AtFrequency <em>At Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>At Frequency</em>'.
	 * @see gov.nist.csrc.ns.oscal.AtFrequency
	 * @generated
	 */
	EClass getAtFrequency();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AtFrequency#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.AtFrequency#getRemarks()
	 * @see #getAtFrequency()
	 * @generated
	 */
	EReference getAtFrequency_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.AtFrequency#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see gov.nist.csrc.ns.oscal.AtFrequency#getPeriod()
	 * @see #getAtFrequency()
	 * @generated
	 */
	EAttribute getAtFrequency_Period();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.AtFrequency#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see gov.nist.csrc.ns.oscal.AtFrequency#getUnit()
	 * @see #getAtFrequency()
	 * @generated
	 */
	EAttribute getAtFrequency_Unit();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Attestation <em>Attestation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attestation</em>'.
	 * @see gov.nist.csrc.ns.oscal.Attestation
	 * @generated
	 */
	EClass getAttestation();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Attestation#getResponsibleParty <em>Responsible Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible Party</em>'.
	 * @see gov.nist.csrc.ns.oscal.Attestation#getResponsibleParty()
	 * @see #getAttestation()
	 * @generated
	 */
	EReference getAttestation_ResponsibleParty();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Attestation#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see gov.nist.csrc.ns.oscal.Attestation#getPart()
	 * @see #getAttestation()
	 * @generated
	 */
	EReference getAttestation_Part();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Base64 <em>Base64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base64</em>'.
	 * @see gov.nist.csrc.ns.oscal.Base64
	 * @generated
	 */
	EClass getBase64();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Base64#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.csrc.ns.oscal.Base64#getValue()
	 * @see #getBase64()
	 * @generated
	 */
	EAttribute getBase64_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Base64#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see gov.nist.csrc.ns.oscal.Base64#getFilename()
	 * @see #getBase64()
	 * @generated
	 */
	EAttribute getBase64_Filename();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Base64#getMediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media Type</em>'.
	 * @see gov.nist.csrc.ns.oscal.Base64#getMediaType()
	 * @see #getBase64()
	 * @generated
	 */
	EAttribute getBase64_MediaType();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.MarkupBlockQuote <em>Markup Block Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markup Block Quote</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupBlockQuote
	 * @generated
	 */
	EClass getMarkupBlockQuote();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.MarkupBlockQuote#getBlockElementGroup <em>Block Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Block Element Group</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupBlockQuote#getBlockElementGroup()
	 * @see #getMarkupBlockQuote()
	 * @generated
	 */
	EAttribute getMarkupBlockQuote_BlockElementGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupBlockQuote#getH1 <em>H1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H1</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupBlockQuote#getH1()
	 * @see #getMarkupBlockQuote()
	 * @generated
	 */
	EReference getMarkupBlockQuote_H1();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupBlockQuote#getH2 <em>H2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H2</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupBlockQuote#getH2()
	 * @see #getMarkupBlockQuote()
	 * @generated
	 */
	EReference getMarkupBlockQuote_H2();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupBlockQuote#getH3 <em>H3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H3</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupBlockQuote#getH3()
	 * @see #getMarkupBlockQuote()
	 * @generated
	 */
	EReference getMarkupBlockQuote_H3();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupBlockQuote#getH4 <em>H4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H4</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupBlockQuote#getH4()
	 * @see #getMarkupBlockQuote()
	 * @generated
	 */
	EReference getMarkupBlockQuote_H4();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupBlockQuote#getH5 <em>H5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H5</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupBlockQuote#getH5()
	 * @see #getMarkupBlockQuote()
	 * @generated
	 */
	EReference getMarkupBlockQuote_H5();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupBlockQuote#getH6 <em>H6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H6</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupBlockQuote#getH6()
	 * @see #getMarkupBlockQuote()
	 * @generated
	 */
	EReference getMarkupBlockQuote_H6();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupBlockQuote#getUl <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ul</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupBlockQuote#getUl()
	 * @see #getMarkupBlockQuote()
	 * @generated
	 */
	EReference getMarkupBlockQuote_Ul();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupBlockQuote#getOl <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ol</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupBlockQuote#getOl()
	 * @see #getMarkupBlockQuote()
	 * @generated
	 */
	EReference getMarkupBlockQuote_Ol();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupBlockQuote#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupBlockQuote#getPre()
	 * @see #getMarkupBlockQuote()
	 * @generated
	 */
	EReference getMarkupBlockQuote_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupBlockQuote#getHr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hr</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupBlockQuote#getHr()
	 * @see #getMarkupBlockQuote()
	 * @generated
	 */
	EReference getMarkupBlockQuote_Hr();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupBlockQuote#getBlockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blockquote</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupBlockQuote#getBlockquote()
	 * @see #getMarkupBlockQuote()
	 * @generated
	 */
	EReference getMarkupBlockQuote_Blockquote();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupBlockQuote#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupBlockQuote#getP()
	 * @see #getMarkupBlockQuote()
	 * @generated
	 */
	EReference getMarkupBlockQuote_P();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupBlockQuote#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupBlockQuote#getTable()
	 * @see #getMarkupBlockQuote()
	 * @generated
	 */
	EReference getMarkupBlockQuote_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupBlockQuote#getImg <em>Img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Img</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupBlockQuote#getImg()
	 * @see #getMarkupBlockQuote()
	 * @generated
	 */
	EReference getMarkupBlockQuote_Img();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Categorization <em>Categorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categorization</em>'.
	 * @see gov.nist.csrc.ns.oscal.Categorization
	 * @generated
	 */
	EClass getCategorization();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.Categorization#getInformationTypeId <em>Information Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Information Type Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.Categorization#getInformationTypeId()
	 * @see #getCategorization()
	 * @generated
	 */
	EAttribute getCategorization_InformationTypeId();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Categorization#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see gov.nist.csrc.ns.oscal.Categorization#getSystem()
	 * @see #getCategorization()
	 * @generated
	 */
	EAttribute getCategorization_System();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Citation <em>Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Citation</em>'.
	 * @see gov.nist.csrc.ns.oscal.Citation
	 * @generated
	 */
	EClass getCitation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Citation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see gov.nist.csrc.ns.oscal.Citation#getText()
	 * @see #getCitation()
	 * @generated
	 */
	EReference getCitation_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Citation#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Citation#getProp()
	 * @see #getCitation()
	 * @generated
	 */
	EReference getCitation_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Citation#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Citation#getLink()
	 * @see #getCitation()
	 * @generated
	 */
	EReference getCitation_Link();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.MarkupCode <em>Markup Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markup Code</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupCode
	 * @generated
	 */
	EClass getMarkupCode();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.MarkupCode#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupCode#getClass_()
	 * @see #getMarkupCode()
	 * @generated
	 */
	EAttribute getMarkupCode_Class();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Combine <em>Combine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combine</em>'.
	 * @see gov.nist.csrc.ns.oscal.Combine
	 * @generated
	 */
	EClass getCombine();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Combine#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see gov.nist.csrc.ns.oscal.Combine#getMethod()
	 * @see #getCombine()
	 * @generated
	 */
	EAttribute getCombine_Method();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.ControlObjectiveSelection <em>Control Objective Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Objective Selection</em>'.
	 * @see gov.nist.csrc.ns.oscal.ControlObjectiveSelection
	 * @generated
	 */
	EClass getControlObjectiveSelection();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ControlObjectiveSelection#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.ControlObjectiveSelection#getDescription()
	 * @see #getControlObjectiveSelection()
	 * @generated
	 */
	EReference getControlObjectiveSelection_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ControlObjectiveSelection#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.ControlObjectiveSelection#getProp()
	 * @see #getControlObjectiveSelection()
	 * @generated
	 */
	EReference getControlObjectiveSelection_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ControlObjectiveSelection#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.ControlObjectiveSelection#getLink()
	 * @see #getControlObjectiveSelection()
	 * @generated
	 */
	EReference getControlObjectiveSelection_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ControlObjectiveSelection#getIncludeAll <em>Include All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Include All</em>'.
	 * @see gov.nist.csrc.ns.oscal.ControlObjectiveSelection#getIncludeAll()
	 * @see #getControlObjectiveSelection()
	 * @generated
	 */
	EReference getControlObjectiveSelection_IncludeAll();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ControlObjectiveSelection#getIncludeObjective <em>Include Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include Objective</em>'.
	 * @see gov.nist.csrc.ns.oscal.ControlObjectiveSelection#getIncludeObjective()
	 * @see #getControlObjectiveSelection()
	 * @generated
	 */
	EReference getControlObjectiveSelection_IncludeObjective();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ControlObjectiveSelection#getExcludeObjective <em>Exclude Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exclude Objective</em>'.
	 * @see gov.nist.csrc.ns.oscal.ControlObjectiveSelection#getExcludeObjective()
	 * @see #getControlObjectiveSelection()
	 * @generated
	 */
	EReference getControlObjectiveSelection_ExcludeObjective();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ControlObjectiveSelection#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.ControlObjectiveSelection#getRemarks()
	 * @see #getControlObjectiveSelection()
	 * @generated
	 */
	EReference getControlObjectiveSelection_Remarks();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.ControlSelection <em>Control Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Selection</em>'.
	 * @see gov.nist.csrc.ns.oscal.ControlSelection
	 * @generated
	 */
	EClass getControlSelection();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ControlSelection#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.ControlSelection#getDescription()
	 * @see #getControlSelection()
	 * @generated
	 */
	EReference getControlSelection_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ControlSelection#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.ControlSelection#getProp()
	 * @see #getControlSelection()
	 * @generated
	 */
	EReference getControlSelection_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ControlSelection#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.ControlSelection#getLink()
	 * @see #getControlSelection()
	 * @generated
	 */
	EReference getControlSelection_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ControlSelection#getIncludeAll <em>Include All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Include All</em>'.
	 * @see gov.nist.csrc.ns.oscal.ControlSelection#getIncludeAll()
	 * @see #getControlSelection()
	 * @generated
	 */
	EReference getControlSelection_IncludeAll();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ControlSelection#getIncludeControl <em>Include Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include Control</em>'.
	 * @see gov.nist.csrc.ns.oscal.ControlSelection#getIncludeControl()
	 * @see #getControlSelection()
	 * @generated
	 */
	EReference getControlSelection_IncludeControl();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ControlSelection#getExcludeControl <em>Exclude Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exclude Control</em>'.
	 * @see gov.nist.csrc.ns.oscal.ControlSelection#getExcludeControl()
	 * @see #getControlSelection()
	 * @generated
	 */
	EReference getControlSelection_ExcludeControl();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ControlSelection#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.ControlSelection#getRemarks()
	 * @see #getControlSelection()
	 * @generated
	 */
	EReference getControlSelection_Remarks();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Custom <em>Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom</em>'.
	 * @see gov.nist.csrc.ns.oscal.Custom
	 * @generated
	 */
	EClass getCustom();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Custom#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see gov.nist.csrc.ns.oscal.Custom#getGroup()
	 * @see #getCustom()
	 * @generated
	 */
	EReference getCustom_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Custom#getInsertControls <em>Insert Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Insert Controls</em>'.
	 * @see gov.nist.csrc.ns.oscal.Custom#getInsertControls()
	 * @see #getCustom()
	 * @generated
	 */
	EReference getCustom_InsertControls();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see gov.nist.csrc.ns.oscal.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Dependency#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.Dependency#getRemarks()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Dependency#getTaskUuid <em>Task Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Dependency#getTaskUuid()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_TaskUuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see gov.nist.csrc.ns.oscal.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see gov.nist.csrc.ns.oscal.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link gov.nist.csrc.ns.oscal.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see gov.nist.csrc.ns.oscal.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link gov.nist.csrc.ns.oscal.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see gov.nist.csrc.ns.oscal.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.DocumentRoot#getAssessmentPlan <em>Assessment Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assessment Plan</em>'.
	 * @see gov.nist.csrc.ns.oscal.DocumentRoot#getAssessmentPlan()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AssessmentPlan();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.DocumentRoot#getAssessmentResults <em>Assessment Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assessment Results</em>'.
	 * @see gov.nist.csrc.ns.oscal.DocumentRoot#getAssessmentResults()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AssessmentResults();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.DocumentRoot#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catalog</em>'.
	 * @see gov.nist.csrc.ns.oscal.DocumentRoot#getCatalog()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Catalog();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.DocumentRoot#getComponentDefinition <em>Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Definition</em>'.
	 * @see gov.nist.csrc.ns.oscal.DocumentRoot#getComponentDefinition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ComponentDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.DocumentRoot#getMappingCollection <em>Mapping Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping Collection</em>'.
	 * @see gov.nist.csrc.ns.oscal.DocumentRoot#getMappingCollection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MappingCollection();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.DocumentRoot#getPlanOfActionAndMilestones <em>Plan Of Action And Milestones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan Of Action And Milestones</em>'.
	 * @see gov.nist.csrc.ns.oscal.DocumentRoot#getPlanOfActionAndMilestones()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PlanOfActionAndMilestones();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.DocumentRoot#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Profile</em>'.
	 * @see gov.nist.csrc.ns.oscal.DocumentRoot#getProfile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Profile();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.DocumentRoot#getSystemSecurityPlan <em>System Security Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System Security Plan</em>'.
	 * @see gov.nist.csrc.ns.oscal.DocumentRoot#getSystemSecurityPlan()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SystemSecurityPlan();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.RiskLogEntry <em>Risk Log Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Risk Log Entry</em>'.
	 * @see gov.nist.csrc.ns.oscal.RiskLogEntry
	 * @generated
	 */
	EClass getRiskLogEntry();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.RiskLogEntry#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.RiskLogEntry#getTitle()
	 * @see #getRiskLogEntry()
	 * @generated
	 */
	EReference getRiskLogEntry_Title();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.RiskLogEntry#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.RiskLogEntry#getDescription()
	 * @see #getRiskLogEntry()
	 * @generated
	 */
	EReference getRiskLogEntry_Description();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.RiskLogEntry#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see gov.nist.csrc.ns.oscal.RiskLogEntry#getStart()
	 * @see #getRiskLogEntry()
	 * @generated
	 */
	EAttribute getRiskLogEntry_Start();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.RiskLogEntry#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see gov.nist.csrc.ns.oscal.RiskLogEntry#getEnd()
	 * @see #getRiskLogEntry()
	 * @generated
	 */
	EAttribute getRiskLogEntry_End();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.RiskLogEntry#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.RiskLogEntry#getProp()
	 * @see #getRiskLogEntry()
	 * @generated
	 */
	EReference getRiskLogEntry_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.RiskLogEntry#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.RiskLogEntry#getLink()
	 * @see #getRiskLogEntry()
	 * @generated
	 */
	EReference getRiskLogEntry_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.RiskLogEntry#getLoggedBy <em>Logged By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logged By</em>'.
	 * @see gov.nist.csrc.ns.oscal.RiskLogEntry#getLoggedBy()
	 * @see #getRiskLogEntry()
	 * @generated
	 */
	EReference getRiskLogEntry_LoggedBy();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.RiskLogEntry#getStatusChange <em>Status Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Change</em>'.
	 * @see gov.nist.csrc.ns.oscal.RiskLogEntry#getStatusChange()
	 * @see #getRiskLogEntry()
	 * @generated
	 */
	EAttribute getRiskLogEntry_StatusChange();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.RiskLogEntry#getRelatedResponse <em>Related Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Related Response</em>'.
	 * @see gov.nist.csrc.ns.oscal.RiskLogEntry#getRelatedResponse()
	 * @see #getRiskLogEntry()
	 * @generated
	 */
	EReference getRiskLogEntry_RelatedResponse();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.RiskLogEntry#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.RiskLogEntry#getRemarks()
	 * @see #getRiskLogEntry()
	 * @generated
	 */
	EReference getRiskLogEntry_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.RiskLogEntry#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.RiskLogEntry#getUuid()
	 * @see #getRiskLogEntry()
	 * @generated
	 */
	EAttribute getRiskLogEntry_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry <em>Assessment Log Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment Log Entry</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentLogEntry
	 * @generated
	 */
	EClass getAssessmentLogEntry();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentLogEntry#getTitle()
	 * @see #getAssessmentLogEntry()
	 * @generated
	 */
	EReference getAssessmentLogEntry_Title();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentLogEntry#getDescription()
	 * @see #getAssessmentLogEntry()
	 * @generated
	 */
	EReference getAssessmentLogEntry_Description();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentLogEntry#getStart()
	 * @see #getAssessmentLogEntry()
	 * @generated
	 */
	EAttribute getAssessmentLogEntry_Start();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentLogEntry#getEnd()
	 * @see #getAssessmentLogEntry()
	 * @generated
	 */
	EAttribute getAssessmentLogEntry_End();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentLogEntry#getProp()
	 * @see #getAssessmentLogEntry()
	 * @generated
	 */
	EReference getAssessmentLogEntry_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentLogEntry#getLink()
	 * @see #getAssessmentLogEntry()
	 * @generated
	 */
	EReference getAssessmentLogEntry_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry#getLoggedBy <em>Logged By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logged By</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentLogEntry#getLoggedBy()
	 * @see #getAssessmentLogEntry()
	 * @generated
	 */
	EReference getAssessmentLogEntry_LoggedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry#getRelatedTask <em>Related Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Related Task</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentLogEntry#getRelatedTask()
	 * @see #getAssessmentLogEntry()
	 * @generated
	 */
	EReference getAssessmentLogEntry_RelatedTask();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentLogEntry#getRemarks()
	 * @see #getAssessmentLogEntry()
	 * @generated
	 */
	EReference getAssessmentLogEntry_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentLogEntry#getUuid()
	 * @see #getAssessmentLogEntry()
	 * @generated
	 */
	EAttribute getAssessmentLogEntry_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Export <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Export</em>'.
	 * @see gov.nist.csrc.ns.oscal.Export
	 * @generated
	 */
	EClass getExport();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Export#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.Export#getDescription()
	 * @see #getExport()
	 * @generated
	 */
	EReference getExport_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Export#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Export#getProp()
	 * @see #getExport()
	 * @generated
	 */
	EReference getExport_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Export#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Export#getLink()
	 * @see #getExport()
	 * @generated
	 */
	EReference getExport_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Export#getProvided <em>Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided</em>'.
	 * @see gov.nist.csrc.ns.oscal.Export#getProvided()
	 * @see #getExport()
	 * @generated
	 */
	EReference getExport_Provided();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Export#getResponsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsibility</em>'.
	 * @see gov.nist.csrc.ns.oscal.Export#getResponsibility()
	 * @see #getExport()
	 * @generated
	 */
	EReference getExport_Responsibility();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Export#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.Export#getRemarks()
	 * @see #getExport()
	 * @generated
	 */
	EReference getExport_Remarks();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.ExternalId <em>External Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.ExternalId
	 * @generated
	 */
	EClass getExternalId();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ExternalId#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.csrc.ns.oscal.ExternalId#getValue()
	 * @see #getExternalId()
	 * @generated
	 */
	EAttribute getExternalId_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ExternalId#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see gov.nist.csrc.ns.oscal.ExternalId#getScheme()
	 * @see #getExternalId()
	 * @generated
	 */
	EAttribute getExternalId_Scheme();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Facet <em>Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facet</em>'.
	 * @see gov.nist.csrc.ns.oscal.Facet
	 * @generated
	 */
	EClass getFacet();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Facet#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Facet#getProp()
	 * @see #getFacet()
	 * @generated
	 */
	EReference getFacet_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Facet#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Facet#getLink()
	 * @see #getFacet()
	 * @generated
	 */
	EReference getFacet_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Facet#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.Facet#getRemarks()
	 * @see #getFacet()
	 * @generated
	 */
	EReference getFacet_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Facet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gov.nist.csrc.ns.oscal.Facet#getName()
	 * @see #getFacet()
	 * @generated
	 */
	EAttribute getFacet_Name();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Facet#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see gov.nist.csrc.ns.oscal.Facet#getSystem()
	 * @see #getFacet()
	 * @generated
	 */
	EAttribute getFacet_System();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Facet#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.csrc.ns.oscal.Facet#getValue()
	 * @see #getFacet()
	 * @generated
	 */
	EAttribute getFacet_Value();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Flat <em>Flat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flat</em>'.
	 * @see gov.nist.csrc.ns.oscal.Flat
	 * @generated
	 */
	EClass getFlat();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.IdentifiedSubject <em>Identified Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identified Subject</em>'.
	 * @see gov.nist.csrc.ns.oscal.IdentifiedSubject
	 * @generated
	 */
	EClass getIdentifiedSubject();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.IdentifiedSubject#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subject</em>'.
	 * @see gov.nist.csrc.ns.oscal.IdentifiedSubject#getSubject()
	 * @see #getIdentifiedSubject()
	 * @generated
	 */
	EReference getIdentifiedSubject_Subject();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.IdentifiedSubject#getSubjectPlaceholderUuid <em>Subject Placeholder Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject Placeholder Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.IdentifiedSubject#getSubjectPlaceholderUuid()
	 * @see #getIdentifiedSubject()
	 * @generated
	 */
	EAttribute getIdentifiedSubject_SubjectPlaceholderUuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.MarkupImage <em>Markup Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markup Image</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupImage
	 * @generated
	 */
	EClass getMarkupImage();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.MarkupImage#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupImage#getAlt()
	 * @see #getMarkupImage()
	 * @generated
	 */
	EAttribute getMarkupImage_Alt();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.MarkupImage#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupImage#getSrc()
	 * @see #getMarkupImage()
	 * @generated
	 */
	EAttribute getMarkupImage_Src();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.MarkupImage#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupImage#getTitle()
	 * @see #getMarkupImage()
	 * @generated
	 */
	EAttribute getMarkupImage_Title();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.ImplementedComponent <em>Implemented Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implemented Component</em>'.
	 * @see gov.nist.csrc.ns.oscal.ImplementedComponent
	 * @generated
	 */
	EClass getImplementedComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ImplementedComponent#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.ImplementedComponent#getProp()
	 * @see #getImplementedComponent()
	 * @generated
	 */
	EReference getImplementedComponent_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ImplementedComponent#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.ImplementedComponent#getLink()
	 * @see #getImplementedComponent()
	 * @generated
	 */
	EReference getImplementedComponent_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ImplementedComponent#getResponsibleParty <em>Responsible Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible Party</em>'.
	 * @see gov.nist.csrc.ns.oscal.ImplementedComponent#getResponsibleParty()
	 * @see #getImplementedComponent()
	 * @generated
	 */
	EReference getImplementedComponent_ResponsibleParty();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ImplementedComponent#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.ImplementedComponent#getRemarks()
	 * @see #getImplementedComponent()
	 * @generated
	 */
	EReference getImplementedComponent_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ImplementedComponent#getComponentUuid <em>Component Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.ImplementedComponent#getComponentUuid()
	 * @see #getImplementedComponent()
	 * @generated
	 */
	EAttribute getImplementedComponent_ComponentUuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.InformationType <em>Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Type</em>'.
	 * @see gov.nist.csrc.ns.oscal.InformationType
	 * @generated
	 */
	EClass getInformationType();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.InformationType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.InformationType#getTitle()
	 * @see #getInformationType()
	 * @generated
	 */
	EReference getInformationType_Title();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.InformationType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.InformationType#getDescription()
	 * @see #getInformationType()
	 * @generated
	 */
	EReference getInformationType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.InformationType#getCategorization <em>Categorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categorization</em>'.
	 * @see gov.nist.csrc.ns.oscal.InformationType#getCategorization()
	 * @see #getInformationType()
	 * @generated
	 */
	EReference getInformationType_Categorization();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.InformationType#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.InformationType#getProp()
	 * @see #getInformationType()
	 * @generated
	 */
	EReference getInformationType_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.InformationType#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.InformationType#getLink()
	 * @see #getInformationType()
	 * @generated
	 */
	EReference getInformationType_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.InformationType#getConfidentialityImpact <em>Confidentiality Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Confidentiality Impact</em>'.
	 * @see gov.nist.csrc.ns.oscal.InformationType#getConfidentialityImpact()
	 * @see #getInformationType()
	 * @generated
	 */
	EReference getInformationType_ConfidentialityImpact();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.InformationType#getIntegrityImpact <em>Integrity Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integrity Impact</em>'.
	 * @see gov.nist.csrc.ns.oscal.InformationType#getIntegrityImpact()
	 * @see #getInformationType()
	 * @generated
	 */
	EReference getInformationType_IntegrityImpact();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.InformationType#getAvailabilityImpact <em>Availability Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Availability Impact</em>'.
	 * @see gov.nist.csrc.ns.oscal.InformationType#getAvailabilityImpact()
	 * @see #getInformationType()
	 * @generated
	 */
	EReference getInformationType_AvailabilityImpact();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.InformationType#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.InformationType#getUuid()
	 * @see #getInformationType()
	 * @generated
	 */
	EAttribute getInformationType_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Inherited <em>Inherited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inherited</em>'.
	 * @see gov.nist.csrc.ns.oscal.Inherited
	 * @generated
	 */
	EClass getInherited();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Inherited#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.Inherited#getDescription()
	 * @see #getInherited()
	 * @generated
	 */
	EReference getInherited_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Inherited#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Inherited#getProp()
	 * @see #getInherited()
	 * @generated
	 */
	EReference getInherited_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Inherited#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Inherited#getLink()
	 * @see #getInherited()
	 * @generated
	 */
	EReference getInherited_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Inherited#getResponsibleRole <em>Responsible Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible Role</em>'.
	 * @see gov.nist.csrc.ns.oscal.Inherited#getResponsibleRole()
	 * @see #getInherited()
	 * @generated
	 */
	EReference getInherited_ResponsibleRole();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Inherited#getProvidedUuid <em>Provided Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provided Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Inherited#getProvidedUuid()
	 * @see #getInherited()
	 * @generated
	 */
	EAttribute getInherited_ProvidedUuid();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Inherited#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Inherited#getUuid()
	 * @see #getInherited()
	 * @generated
	 */
	EAttribute getInherited_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.InlineMarkup <em>Inline Markup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Markup</em>'.
	 * @see gov.nist.csrc.ns.oscal.InlineMarkup
	 * @generated
	 */
	EClass getInlineMarkup();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.InlineMarkup#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see gov.nist.csrc.ns.oscal.InlineMarkup#getMixed()
	 * @see #getInlineMarkup()
	 * @generated
	 */
	EAttribute getInlineMarkup_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.InlineMarkup#getInlineMarkupGroup <em>Inline Markup Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Inline Markup Group</em>'.
	 * @see gov.nist.csrc.ns.oscal.InlineMarkup#getInlineMarkupGroup()
	 * @see #getInlineMarkup()
	 * @generated
	 */
	EAttribute getInlineMarkup_InlineMarkupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.InlineMarkup#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see gov.nist.csrc.ns.oscal.InlineMarkup#getA()
	 * @see #getInlineMarkup()
	 * @generated
	 */
	EReference getInlineMarkup_A();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.InlineMarkup#getInsert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Insert</em>'.
	 * @see gov.nist.csrc.ns.oscal.InlineMarkup#getInsert()
	 * @see #getInlineMarkup()
	 * @generated
	 */
	EReference getInlineMarkup_Insert();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.InlineMarkup#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see gov.nist.csrc.ns.oscal.InlineMarkup#getBr()
	 * @see #getInlineMarkup()
	 * @generated
	 */
	EReference getInlineMarkup_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.InlineMarkup#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see gov.nist.csrc.ns.oscal.InlineMarkup#getCode()
	 * @see #getInlineMarkup()
	 * @generated
	 */
	EReference getInlineMarkup_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.InlineMarkup#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see gov.nist.csrc.ns.oscal.InlineMarkup#getEm()
	 * @see #getInlineMarkup()
	 * @generated
	 */
	EReference getInlineMarkup_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.InlineMarkup#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see gov.nist.csrc.ns.oscal.InlineMarkup#getI()
	 * @see #getInlineMarkup()
	 * @generated
	 */
	EReference getInlineMarkup_I();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.InlineMarkup#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see gov.nist.csrc.ns.oscal.InlineMarkup#getB()
	 * @see #getInlineMarkup()
	 * @generated
	 */
	EReference getInlineMarkup_B();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.InlineMarkup#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see gov.nist.csrc.ns.oscal.InlineMarkup#getStrong()
	 * @see #getInlineMarkup()
	 * @generated
	 */
	EReference getInlineMarkup_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.InlineMarkup#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see gov.nist.csrc.ns.oscal.InlineMarkup#getSub()
	 * @see #getInlineMarkup()
	 * @generated
	 */
	EReference getInlineMarkup_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.InlineMarkup#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see gov.nist.csrc.ns.oscal.InlineMarkup#getSup()
	 * @see #getInlineMarkup()
	 * @generated
	 */
	EReference getInlineMarkup_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.InlineMarkup#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see gov.nist.csrc.ns.oscal.InlineMarkup#getQ()
	 * @see #getInlineMarkup()
	 * @generated
	 */
	EReference getInlineMarkup_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.InlineMarkup#getImg <em>Img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Img</em>'.
	 * @see gov.nist.csrc.ns.oscal.InlineMarkup#getImg()
	 * @see #getInlineMarkup()
	 * @generated
	 */
	EReference getInlineMarkup_Img();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.MarkupInsert <em>Markup Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markup Insert</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupInsert
	 * @generated
	 */
	EClass getMarkupInsert();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.MarkupInsert#getIdRef <em>Id Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Ref</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupInsert#getIdRef()
	 * @see #getMarkupInsert()
	 * @generated
	 */
	EAttribute getMarkupInsert_IdRef();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.MarkupInsert#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupInsert#getType()
	 * @see #getMarkupInsert()
	 * @generated
	 */
	EAttribute getMarkupInsert_Type();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.LeveragedAuthorization <em>Leveraged Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leveraged Authorization</em>'.
	 * @see gov.nist.csrc.ns.oscal.LeveragedAuthorization
	 * @generated
	 */
	EClass getLeveragedAuthorization();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.LeveragedAuthorization#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.LeveragedAuthorization#getTitle()
	 * @see #getLeveragedAuthorization()
	 * @generated
	 */
	EReference getLeveragedAuthorization_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.LeveragedAuthorization#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.LeveragedAuthorization#getProp()
	 * @see #getLeveragedAuthorization()
	 * @generated
	 */
	EReference getLeveragedAuthorization_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.LeveragedAuthorization#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.LeveragedAuthorization#getLink()
	 * @see #getLeveragedAuthorization()
	 * @generated
	 */
	EReference getLeveragedAuthorization_Link();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.LeveragedAuthorization#getPartyUuid <em>Party Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.LeveragedAuthorization#getPartyUuid()
	 * @see #getLeveragedAuthorization()
	 * @generated
	 */
	EAttribute getLeveragedAuthorization_PartyUuid();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.LeveragedAuthorization#getDateAuthorized <em>Date Authorized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Authorized</em>'.
	 * @see gov.nist.csrc.ns.oscal.LeveragedAuthorization#getDateAuthorized()
	 * @see #getLeveragedAuthorization()
	 * @generated
	 */
	EAttribute getLeveragedAuthorization_DateAuthorized();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.LeveragedAuthorization#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.LeveragedAuthorization#getRemarks()
	 * @see #getLeveragedAuthorization()
	 * @generated
	 */
	EReference getLeveragedAuthorization_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.LeveragedAuthorization#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.LeveragedAuthorization#getUuid()
	 * @see #getLeveragedAuthorization()
	 * @generated
	 */
	EAttribute getLeveragedAuthorization_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.MarkupListItem <em>Markup List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markup List Item</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupListItem
	 * @generated
	 */
	EClass getMarkupListItem();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.MarkupListItem#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupListItem#getMixed()
	 * @see #getMarkupListItem()
	 * @generated
	 */
	EAttribute getMarkupListItem_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.MarkupListItem#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupListItem#getGroup()
	 * @see #getMarkupListItem()
	 * @generated
	 */
	EAttribute getMarkupListItem_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupListItem#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupListItem#getA()
	 * @see #getMarkupListItem()
	 * @generated
	 */
	EReference getMarkupListItem_A();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupListItem#getInsert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Insert</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupListItem#getInsert()
	 * @see #getMarkupListItem()
	 * @generated
	 */
	EReference getMarkupListItem_Insert();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupListItem#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupListItem#getBr()
	 * @see #getMarkupListItem()
	 * @generated
	 */
	EReference getMarkupListItem_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupListItem#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupListItem#getCode()
	 * @see #getMarkupListItem()
	 * @generated
	 */
	EReference getMarkupListItem_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupListItem#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupListItem#getEm()
	 * @see #getMarkupListItem()
	 * @generated
	 */
	EReference getMarkupListItem_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupListItem#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupListItem#getI()
	 * @see #getMarkupListItem()
	 * @generated
	 */
	EReference getMarkupListItem_I();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupListItem#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupListItem#getB()
	 * @see #getMarkupListItem()
	 * @generated
	 */
	EReference getMarkupListItem_B();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupListItem#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupListItem#getStrong()
	 * @see #getMarkupListItem()
	 * @generated
	 */
	EReference getMarkupListItem_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupListItem#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupListItem#getSub()
	 * @see #getMarkupListItem()
	 * @generated
	 */
	EReference getMarkupListItem_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupListItem#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupListItem#getSup()
	 * @see #getMarkupListItem()
	 * @generated
	 */
	EReference getMarkupListItem_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupListItem#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupListItem#getQ()
	 * @see #getMarkupListItem()
	 * @generated
	 */
	EReference getMarkupListItem_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupListItem#getImg <em>Img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Img</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupListItem#getImg()
	 * @see #getMarkupListItem()
	 * @generated
	 */
	EReference getMarkupListItem_Img();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupListItem#getUl <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ul</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupListItem#getUl()
	 * @see #getMarkupListItem()
	 * @generated
	 */
	EReference getMarkupListItem_Ul();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupListItem#getOl <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ol</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupListItem#getOl()
	 * @see #getMarkupListItem()
	 * @generated
	 */
	EReference getMarkupListItem_Ol();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupListItem#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupListItem#getPre()
	 * @see #getMarkupListItem()
	 * @generated
	 */
	EReference getMarkupListItem_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupListItem#getHr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hr</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupListItem#getHr()
	 * @see #getMarkupListItem()
	 * @generated
	 */
	EReference getMarkupListItem_Hr();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupListItem#getBlockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blockquote</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupListItem#getBlockquote()
	 * @see #getMarkupListItem()
	 * @generated
	 */
	EReference getMarkupListItem_Blockquote();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupListItem#getH1 <em>H1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H1</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupListItem#getH1()
	 * @see #getMarkupListItem()
	 * @generated
	 */
	EReference getMarkupListItem_H1();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupListItem#getH2 <em>H2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H2</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupListItem#getH2()
	 * @see #getMarkupListItem()
	 * @generated
	 */
	EReference getMarkupListItem_H2();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupListItem#getH3 <em>H3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H3</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupListItem#getH3()
	 * @see #getMarkupListItem()
	 * @generated
	 */
	EReference getMarkupListItem_H3();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupListItem#getH4 <em>H4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H4</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupListItem#getH4()
	 * @see #getMarkupListItem()
	 * @generated
	 */
	EReference getMarkupListItem_H4();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupListItem#getH5 <em>H5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H5</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupListItem#getH5()
	 * @see #getMarkupListItem()
	 * @generated
	 */
	EReference getMarkupListItem_H5();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupListItem#getH6 <em>H6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H6</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupListItem#getH6()
	 * @see #getMarkupListItem()
	 * @generated
	 */
	EReference getMarkupListItem_H6();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupListItem#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupListItem#getP()
	 * @see #getMarkupListItem()
	 * @generated
	 */
	EReference getMarkupListItem_P();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.MarkupList <em>Markup List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markup List</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupList
	 * @generated
	 */
	EClass getMarkupList();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupList#getLi <em>Li</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Li</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupList#getLi()
	 * @see #getMarkupList()
	 * @generated
	 */
	EReference getMarkupList_Li();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.ResultLocalDefinitions <em>Result Local Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Local Definitions</em>'.
	 * @see gov.nist.csrc.ns.oscal.ResultLocalDefinitions
	 * @generated
	 */
	EClass getResultLocalDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ResultLocalDefinitions#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see gov.nist.csrc.ns.oscal.ResultLocalDefinitions#getComponent()
	 * @see #getResultLocalDefinitions()
	 * @generated
	 */
	EReference getResultLocalDefinitions_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ResultLocalDefinitions#getInventoryItem <em>Inventory Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inventory Item</em>'.
	 * @see gov.nist.csrc.ns.oscal.ResultLocalDefinitions#getInventoryItem()
	 * @see #getResultLocalDefinitions()
	 * @generated
	 */
	EReference getResultLocalDefinitions_InventoryItem();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ResultLocalDefinitions#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User</em>'.
	 * @see gov.nist.csrc.ns.oscal.ResultLocalDefinitions#getUser()
	 * @see #getResultLocalDefinitions()
	 * @generated
	 */
	EReference getResultLocalDefinitions_User();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ResultLocalDefinitions#getAssessmentAssets <em>Assessment Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assessment Assets</em>'.
	 * @see gov.nist.csrc.ns.oscal.ResultLocalDefinitions#getAssessmentAssets()
	 * @see #getResultLocalDefinitions()
	 * @generated
	 */
	EReference getResultLocalDefinitions_AssessmentAssets();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ResultLocalDefinitions#getAssessmentTask <em>Assessment Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assessment Task</em>'.
	 * @see gov.nist.csrc.ns.oscal.ResultLocalDefinitions#getAssessmentTask()
	 * @see #getResultLocalDefinitions()
	 * @generated
	 */
	EReference getResultLocalDefinitions_AssessmentTask();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.AssessmentResultsLocalDefinitions <em>Assessment Results Local Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment Results Local Definitions</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentResultsLocalDefinitions
	 * @generated
	 */
	EClass getAssessmentResultsLocalDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentResultsLocalDefinitions#getObjectivesAndMethods <em>Objectives And Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objectives And Methods</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentResultsLocalDefinitions#getObjectivesAndMethods()
	 * @see #getAssessmentResultsLocalDefinitions()
	 * @generated
	 */
	EReference getAssessmentResultsLocalDefinitions_ObjectivesAndMethods();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentResultsLocalDefinitions#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentResultsLocalDefinitions#getActivity()
	 * @see #getAssessmentResultsLocalDefinitions()
	 * @generated
	 */
	EReference getAssessmentResultsLocalDefinitions_Activity();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssessmentResultsLocalDefinitions#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentResultsLocalDefinitions#getRemarks()
	 * @see #getAssessmentResultsLocalDefinitions()
	 * @generated
	 */
	EReference getAssessmentResultsLocalDefinitions_Remarks();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.AssessmentPlanLocalDefinitions <em>Assessment Plan Local Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment Plan Local Definitions</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlanLocalDefinitions
	 * @generated
	 */
	EClass getAssessmentPlanLocalDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentPlanLocalDefinitions#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlanLocalDefinitions#getComponent()
	 * @see #getAssessmentPlanLocalDefinitions()
	 * @generated
	 */
	EReference getAssessmentPlanLocalDefinitions_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentPlanLocalDefinitions#getInventoryItem <em>Inventory Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inventory Item</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlanLocalDefinitions#getInventoryItem()
	 * @see #getAssessmentPlanLocalDefinitions()
	 * @generated
	 */
	EReference getAssessmentPlanLocalDefinitions_InventoryItem();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentPlanLocalDefinitions#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlanLocalDefinitions#getUser()
	 * @see #getAssessmentPlanLocalDefinitions()
	 * @generated
	 */
	EReference getAssessmentPlanLocalDefinitions_User();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentPlanLocalDefinitions#getObjectivesAndMethods <em>Objectives And Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objectives And Methods</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlanLocalDefinitions#getObjectivesAndMethods()
	 * @see #getAssessmentPlanLocalDefinitions()
	 * @generated
	 */
	EReference getAssessmentPlanLocalDefinitions_ObjectivesAndMethods();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentPlanLocalDefinitions#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlanLocalDefinitions#getActivity()
	 * @see #getAssessmentPlanLocalDefinitions()
	 * @generated
	 */
	EReference getAssessmentPlanLocalDefinitions_Activity();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssessmentPlanLocalDefinitions#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlanLocalDefinitions#getRemarks()
	 * @see #getAssessmentPlanLocalDefinitions()
	 * @generated
	 */
	EReference getAssessmentPlanLocalDefinitions_Remarks();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see gov.nist.csrc.ns.oscal.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Location#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.Location#getTitle()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Title();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Location#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see gov.nist.csrc.ns.oscal.Location#getAddress()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Address();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.Location#getEmailAddress <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Email Address</em>'.
	 * @see gov.nist.csrc.ns.oscal.Location#getEmailAddress()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_EmailAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Location#getTelephoneNumber <em>Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telephone Number</em>'.
	 * @see gov.nist.csrc.ns.oscal.Location#getTelephoneNumber()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_TelephoneNumber();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.Location#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Url</em>'.
	 * @see gov.nist.csrc.ns.oscal.Location#getUrl()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Url();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Location#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Location#getProp()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Location#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Location#getLink()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Location#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.Location#getRemarks()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Location#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Location#getUuid()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.MarkupLineDatatype <em>Markup Line Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markup Line Datatype</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupLineDatatype
	 * @generated
	 */
	EClass getMarkupLineDatatype();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype <em>Markup Multiline Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markup Multiline Datatype</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupMultilineDatatype
	 * @generated
	 */
	EClass getMarkupMultilineDatatype();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getBlockElementGroup <em>Block Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Block Element Group</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getBlockElementGroup()
	 * @see #getMarkupMultilineDatatype()
	 * @generated
	 */
	EAttribute getMarkupMultilineDatatype_BlockElementGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getH1 <em>H1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H1</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getH1()
	 * @see #getMarkupMultilineDatatype()
	 * @generated
	 */
	EReference getMarkupMultilineDatatype_H1();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getH2 <em>H2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H2</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getH2()
	 * @see #getMarkupMultilineDatatype()
	 * @generated
	 */
	EReference getMarkupMultilineDatatype_H2();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getH3 <em>H3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H3</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getH3()
	 * @see #getMarkupMultilineDatatype()
	 * @generated
	 */
	EReference getMarkupMultilineDatatype_H3();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getH4 <em>H4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H4</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getH4()
	 * @see #getMarkupMultilineDatatype()
	 * @generated
	 */
	EReference getMarkupMultilineDatatype_H4();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getH5 <em>H5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H5</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getH5()
	 * @see #getMarkupMultilineDatatype()
	 * @generated
	 */
	EReference getMarkupMultilineDatatype_H5();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getH6 <em>H6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H6</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getH6()
	 * @see #getMarkupMultilineDatatype()
	 * @generated
	 */
	EReference getMarkupMultilineDatatype_H6();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getUl <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ul</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getUl()
	 * @see #getMarkupMultilineDatatype()
	 * @generated
	 */
	EReference getMarkupMultilineDatatype_Ul();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getOl <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ol</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getOl()
	 * @see #getMarkupMultilineDatatype()
	 * @generated
	 */
	EReference getMarkupMultilineDatatype_Ol();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getPre()
	 * @see #getMarkupMultilineDatatype()
	 * @generated
	 */
	EReference getMarkupMultilineDatatype_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getHr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hr</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getHr()
	 * @see #getMarkupMultilineDatatype()
	 * @generated
	 */
	EReference getMarkupMultilineDatatype_Hr();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getBlockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blockquote</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getBlockquote()
	 * @see #getMarkupMultilineDatatype()
	 * @generated
	 */
	EReference getMarkupMultilineDatatype_Blockquote();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getP()
	 * @see #getMarkupMultilineDatatype()
	 * @generated
	 */
	EReference getMarkupMultilineDatatype_P();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getTable()
	 * @see #getMarkupMultilineDatatype()
	 * @generated
	 */
	EReference getMarkupMultilineDatatype_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getImg <em>Img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Img</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupMultilineDatatype#getImg()
	 * @see #getMarkupMultilineDatatype()
	 * @generated
	 */
	EReference getMarkupMultilineDatatype_Img();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.MitigatingFactor <em>Mitigating Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mitigating Factor</em>'.
	 * @see gov.nist.csrc.ns.oscal.MitigatingFactor
	 * @generated
	 */
	EClass getMitigatingFactor();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.MitigatingFactor#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.MitigatingFactor#getDescription()
	 * @see #getMitigatingFactor()
	 * @generated
	 */
	EReference getMitigatingFactor_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MitigatingFactor#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.MitigatingFactor#getProp()
	 * @see #getMitigatingFactor()
	 * @generated
	 */
	EReference getMitigatingFactor_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MitigatingFactor#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.MitigatingFactor#getLink()
	 * @see #getMitigatingFactor()
	 * @generated
	 */
	EReference getMitigatingFactor_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MitigatingFactor#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subject</em>'.
	 * @see gov.nist.csrc.ns.oscal.MitigatingFactor#getSubject()
	 * @see #getMitigatingFactor()
	 * @generated
	 */
	EReference getMitigatingFactor_Subject();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.MitigatingFactor#getImplementationUuid <em>Implementation Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.MitigatingFactor#getImplementationUuid()
	 * @see #getMitigatingFactor()
	 * @generated
	 */
	EAttribute getMitigatingFactor_ImplementationUuid();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.MitigatingFactor#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.MitigatingFactor#getUuid()
	 * @see #getMitigatingFactor()
	 * @generated
	 */
	EAttribute getMitigatingFactor_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.OnDate <em>On Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Date</em>'.
	 * @see gov.nist.csrc.ns.oscal.OnDate
	 * @generated
	 */
	EClass getOnDate();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.OnDate#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.OnDate#getRemarks()
	 * @see #getOnDate()
	 * @generated
	 */
	EReference getOnDate_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.OnDate#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see gov.nist.csrc.ns.oscal.OnDate#getDate()
	 * @see #getOnDate()
	 * @generated
	 */
	EAttribute getOnDate_Date();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.MarkupOrderedList <em>Markup Ordered List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markup Ordered List</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupOrderedList
	 * @generated
	 */
	EClass getMarkupOrderedList();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.MarkupOrderedList#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupOrderedList#getStart()
	 * @see #getMarkupOrderedList()
	 * @generated
	 */
	EAttribute getMarkupOrderedList_Start();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.PoamItemOrigin <em>Poam Item Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poam Item Origin</em>'.
	 * @see gov.nist.csrc.ns.oscal.PoamItemOrigin
	 * @generated
	 */
	EClass getPoamItemOrigin();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.PoamItemOrigin#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actor</em>'.
	 * @see gov.nist.csrc.ns.oscal.PoamItemOrigin#getActor()
	 * @see #getPoamItemOrigin()
	 * @generated
	 */
	EReference getPoamItemOrigin_Actor();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.AssessmentPlan <em>Assessment Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment Plan</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlan
	 * @generated
	 */
	EClass getAssessmentPlan();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlan#getMetadata()
	 * @see #getAssessmentPlan()
	 * @generated
	 */
	EReference getAssessmentPlan_Metadata();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getImportSsp <em>Import Ssp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Import Ssp</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlan#getImportSsp()
	 * @see #getAssessmentPlan()
	 * @generated
	 */
	EReference getAssessmentPlan_ImportSsp();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getLocalDefinitions <em>Local Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Definitions</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlan#getLocalDefinitions()
	 * @see #getAssessmentPlan()
	 * @generated
	 */
	EReference getAssessmentPlan_LocalDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getTermsAndConditions <em>Terms And Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Terms And Conditions</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlan#getTermsAndConditions()
	 * @see #getAssessmentPlan()
	 * @generated
	 */
	EReference getAssessmentPlan_TermsAndConditions();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getReviewedControls <em>Reviewed Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reviewed Controls</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlan#getReviewedControls()
	 * @see #getAssessmentPlan()
	 * @generated
	 */
	EReference getAssessmentPlan_ReviewedControls();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getAssessmentSubject <em>Assessment Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assessment Subject</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlan#getAssessmentSubject()
	 * @see #getAssessmentPlan()
	 * @generated
	 */
	EReference getAssessmentPlan_AssessmentSubject();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getAssessmentAssets <em>Assessment Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assessment Assets</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlan#getAssessmentAssets()
	 * @see #getAssessmentPlan()
	 * @generated
	 */
	EReference getAssessmentPlan_AssessmentAssets();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlan#getTask()
	 * @see #getAssessmentPlan()
	 * @generated
	 */
	EReference getAssessmentPlan_Task();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getBackMatter <em>Back Matter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Back Matter</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlan#getBackMatter()
	 * @see #getAssessmentPlan()
	 * @generated
	 */
	EReference getAssessmentPlan_BackMatter();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPlan#getUuid()
	 * @see #getAssessmentPlan()
	 * @generated
	 */
	EAttribute getAssessmentPlan_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.AssessmentResults <em>Assessment Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment Results</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentResults
	 * @generated
	 */
	EClass getAssessmentResults();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssessmentResults#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentResults#getMetadata()
	 * @see #getAssessmentResults()
	 * @generated
	 */
	EReference getAssessmentResults_Metadata();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssessmentResults#getImportAp <em>Import Ap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Import Ap</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentResults#getImportAp()
	 * @see #getAssessmentResults()
	 * @generated
	 */
	EReference getAssessmentResults_ImportAp();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssessmentResults#getLocalDefinitions <em>Local Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Definitions</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentResults#getLocalDefinitions()
	 * @see #getAssessmentResults()
	 * @generated
	 */
	EReference getAssessmentResults_LocalDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentResults#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentResults#getResult()
	 * @see #getAssessmentResults()
	 * @generated
	 */
	EReference getAssessmentResults_Result();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssessmentResults#getBackMatter <em>Back Matter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Back Matter</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentResults#getBackMatter()
	 * @see #getAssessmentResults()
	 * @generated
	 */
	EReference getAssessmentResults_BackMatter();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.AssessmentResults#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentResults#getUuid()
	 * @see #getAssessmentResults()
	 * @generated
	 */
	EAttribute getAssessmentResults_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.ImportAp <em>Import Ap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Ap</em>'.
	 * @see gov.nist.csrc.ns.oscal.ImportAp
	 * @generated
	 */
	EClass getImportAp();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ImportAp#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.ImportAp#getRemarks()
	 * @see #getImportAp()
	 * @generated
	 */
	EReference getImportAp_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ImportAp#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see gov.nist.csrc.ns.oscal.ImportAp#getHref()
	 * @see #getImportAp()
	 * @generated
	 */
	EAttribute getImportAp_Href();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see gov.nist.csrc.ns.oscal.Result
	 * @generated
	 */
	EClass getResult();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Result#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.Result#getTitle()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_Title();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Result#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.Result#getDescription()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_Description();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Result#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see gov.nist.csrc.ns.oscal.Result#getStart()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_Start();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Result#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see gov.nist.csrc.ns.oscal.Result#getEnd()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_End();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Result#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Result#getProp()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Result#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Result#getLink()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Result#getLocalDefinitions <em>Local Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Definitions</em>'.
	 * @see gov.nist.csrc.ns.oscal.Result#getLocalDefinitions()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_LocalDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Result#getReviewedControls <em>Reviewed Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reviewed Controls</em>'.
	 * @see gov.nist.csrc.ns.oscal.Result#getReviewedControls()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_ReviewedControls();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Result#getAttestation <em>Attestation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attestation</em>'.
	 * @see gov.nist.csrc.ns.oscal.Result#getAttestation()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_Attestation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Result#getAssessmentLog <em>Assessment Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assessment Log</em>'.
	 * @see gov.nist.csrc.ns.oscal.Result#getAssessmentLog()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_AssessmentLog();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Result#getObservation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Observation</em>'.
	 * @see gov.nist.csrc.ns.oscal.Result#getObservation()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_Observation();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Result#getRisk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Risk</em>'.
	 * @see gov.nist.csrc.ns.oscal.Result#getRisk()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_Risk();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Result#getFinding <em>Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Finding</em>'.
	 * @see gov.nist.csrc.ns.oscal.Result#getFinding()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_Finding();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Result#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.Result#getRemarks()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Result#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Result#getUuid()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see gov.nist.csrc.ns.oscal.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Activity#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.Activity#getTitle()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Title();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Activity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.Activity#getDescription()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Activity#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Activity#getProp()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Activity#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Activity#getLink()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Activity#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see gov.nist.csrc.ns.oscal.Activity#getStep()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Step();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Activity#getRelatedControls <em>Related Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Related Controls</em>'.
	 * @see gov.nist.csrc.ns.oscal.Activity#getRelatedControls()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_RelatedControls();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Activity#getResponsibleRole <em>Responsible Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible Role</em>'.
	 * @see gov.nist.csrc.ns.oscal.Activity#getResponsibleRole()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_ResponsibleRole();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Activity#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.Activity#getRemarks()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Activity#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Activity#getUuid()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.AssessmentAssets <em>Assessment Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment Assets</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentAssets
	 * @generated
	 */
	EClass getAssessmentAssets();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentAssets#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentAssets#getComponent()
	 * @see #getAssessmentAssets()
	 * @generated
	 */
	EReference getAssessmentAssets_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentAssets#getAssessmentPlatform <em>Assessment Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assessment Platform</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentAssets#getAssessmentPlatform()
	 * @see #getAssessmentAssets()
	 * @generated
	 */
	EReference getAssessmentAssets_AssessmentPlatform();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.AssessmentMethod <em>Assessment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment Method</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentMethod
	 * @generated
	 */
	EClass getAssessmentMethod();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssessmentMethod#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentMethod#getDescription()
	 * @see #getAssessmentMethod()
	 * @generated
	 */
	EReference getAssessmentMethod_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentMethod#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentMethod#getProp()
	 * @see #getAssessmentMethod()
	 * @generated
	 */
	EReference getAssessmentMethod_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentMethod#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentMethod#getLink()
	 * @see #getAssessmentMethod()
	 * @generated
	 */
	EReference getAssessmentMethod_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssessmentMethod#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Part</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentMethod#getPart()
	 * @see #getAssessmentMethod()
	 * @generated
	 */
	EReference getAssessmentMethod_Part();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssessmentMethod#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentMethod#getRemarks()
	 * @see #getAssessmentMethod()
	 * @generated
	 */
	EReference getAssessmentMethod_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.AssessmentMethod#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentMethod#getUuid()
	 * @see #getAssessmentMethod()
	 * @generated
	 */
	EAttribute getAssessmentMethod_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.AssessmentPart <em>Assessment Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment Part</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPart
	 * @generated
	 */
	EClass getAssessmentPart();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPart#getTitle()
	 * @see #getAssessmentPart()
	 * @generated
	 */
	EReference getAssessmentPart_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPart#getProp()
	 * @see #getAssessmentPart()
	 * @generated
	 */
	EReference getAssessmentPart_Prop();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getBlockElementGroup <em>Block Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Block Element Group</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPart#getBlockElementGroup()
	 * @see #getAssessmentPart()
	 * @generated
	 */
	EAttribute getAssessmentPart_BlockElementGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getH1 <em>H1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H1</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPart#getH1()
	 * @see #getAssessmentPart()
	 * @generated
	 */
	EReference getAssessmentPart_H1();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getH2 <em>H2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H2</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPart#getH2()
	 * @see #getAssessmentPart()
	 * @generated
	 */
	EReference getAssessmentPart_H2();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getH3 <em>H3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H3</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPart#getH3()
	 * @see #getAssessmentPart()
	 * @generated
	 */
	EReference getAssessmentPart_H3();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getH4 <em>H4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H4</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPart#getH4()
	 * @see #getAssessmentPart()
	 * @generated
	 */
	EReference getAssessmentPart_H4();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getH5 <em>H5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H5</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPart#getH5()
	 * @see #getAssessmentPart()
	 * @generated
	 */
	EReference getAssessmentPart_H5();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getH6 <em>H6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H6</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPart#getH6()
	 * @see #getAssessmentPart()
	 * @generated
	 */
	EReference getAssessmentPart_H6();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getUl <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ul</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPart#getUl()
	 * @see #getAssessmentPart()
	 * @generated
	 */
	EReference getAssessmentPart_Ul();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getOl <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ol</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPart#getOl()
	 * @see #getAssessmentPart()
	 * @generated
	 */
	EReference getAssessmentPart_Ol();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPart#getPre()
	 * @see #getAssessmentPart()
	 * @generated
	 */
	EReference getAssessmentPart_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getHr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hr</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPart#getHr()
	 * @see #getAssessmentPart()
	 * @generated
	 */
	EReference getAssessmentPart_Hr();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getBlockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blockquote</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPart#getBlockquote()
	 * @see #getAssessmentPart()
	 * @generated
	 */
	EReference getAssessmentPart_Blockquote();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPart#getP()
	 * @see #getAssessmentPart()
	 * @generated
	 */
	EReference getAssessmentPart_P();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPart#getTable()
	 * @see #getAssessmentPart()
	 * @generated
	 */
	EReference getAssessmentPart_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getImg <em>Img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Img</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPart#getImg()
	 * @see #getAssessmentPart()
	 * @generated
	 */
	EReference getAssessmentPart_Img();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPart#getPart()
	 * @see #getAssessmentPart()
	 * @generated
	 */
	EReference getAssessmentPart_Part();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPart#getLink()
	 * @see #getAssessmentPart()
	 * @generated
	 */
	EReference getAssessmentPart_Link();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPart#getClass_()
	 * @see #getAssessmentPart()
	 * @generated
	 */
	EAttribute getAssessmentPart_Class();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPart#getName()
	 * @see #getAssessmentPart()
	 * @generated
	 */
	EAttribute getAssessmentPart_Name();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPart#getNs()
	 * @see #getAssessmentPart()
	 * @generated
	 */
	EAttribute getAssessmentPart_Ns();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.AssessmentPart#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentPart#getUuid()
	 * @see #getAssessmentPart()
	 * @generated
	 */
	EAttribute getAssessmentPart_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.AssessmentSubject <em>Assessment Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment Subject</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentSubject
	 * @generated
	 */
	EClass getAssessmentSubject();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssessmentSubject#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentSubject#getDescription()
	 * @see #getAssessmentSubject()
	 * @generated
	 */
	EReference getAssessmentSubject_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentSubject#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentSubject#getProp()
	 * @see #getAssessmentSubject()
	 * @generated
	 */
	EReference getAssessmentSubject_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentSubject#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentSubject#getLink()
	 * @see #getAssessmentSubject()
	 * @generated
	 */
	EReference getAssessmentSubject_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssessmentSubject#getIncludeAll <em>Include All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Include All</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentSubject#getIncludeAll()
	 * @see #getAssessmentSubject()
	 * @generated
	 */
	EReference getAssessmentSubject_IncludeAll();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentSubject#getIncludeSubject <em>Include Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include Subject</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentSubject#getIncludeSubject()
	 * @see #getAssessmentSubject()
	 * @generated
	 */
	EReference getAssessmentSubject_IncludeSubject();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentSubject#getExcludeSubject <em>Exclude Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exclude Subject</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentSubject#getExcludeSubject()
	 * @see #getAssessmentSubject()
	 * @generated
	 */
	EReference getAssessmentSubject_ExcludeSubject();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssessmentSubject#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentSubject#getRemarks()
	 * @see #getAssessmentSubject()
	 * @generated
	 */
	EReference getAssessmentSubject_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.AssessmentSubject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentSubject#getType()
	 * @see #getAssessmentSubject()
	 * @generated
	 */
	EAttribute getAssessmentSubject_Type();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.AssessmentSubjectPlaceholder <em>Assessment Subject Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment Subject Placeholder</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentSubjectPlaceholder
	 * @generated
	 */
	EClass getAssessmentSubjectPlaceholder();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssessmentSubjectPlaceholder#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentSubjectPlaceholder#getDescription()
	 * @see #getAssessmentSubjectPlaceholder()
	 * @generated
	 */
	EReference getAssessmentSubjectPlaceholder_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentSubjectPlaceholder#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentSubjectPlaceholder#getSource()
	 * @see #getAssessmentSubjectPlaceholder()
	 * @generated
	 */
	EReference getAssessmentSubjectPlaceholder_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentSubjectPlaceholder#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentSubjectPlaceholder#getProp()
	 * @see #getAssessmentSubjectPlaceholder()
	 * @generated
	 */
	EReference getAssessmentSubjectPlaceholder_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AssessmentSubjectPlaceholder#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentSubjectPlaceholder#getLink()
	 * @see #getAssessmentSubjectPlaceholder()
	 * @generated
	 */
	EReference getAssessmentSubjectPlaceholder_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssessmentSubjectPlaceholder#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentSubjectPlaceholder#getRemarks()
	 * @see #getAssessmentSubjectPlaceholder()
	 * @generated
	 */
	EReference getAssessmentSubjectPlaceholder_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.AssessmentSubjectPlaceholder#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentSubjectPlaceholder#getUuid()
	 * @see #getAssessmentSubjectPlaceholder()
	 * @generated
	 */
	EAttribute getAssessmentSubjectPlaceholder_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.AssociatedRisk <em>Associated Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Associated Risk</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssociatedRisk
	 * @generated
	 */
	EClass getAssociatedRisk();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AssociatedRisk#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssociatedRisk#getRemarks()
	 * @see #getAssociatedRisk()
	 * @generated
	 */
	EReference getAssociatedRisk_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.AssociatedRisk#getRiskUuid <em>Risk Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssociatedRisk#getRiskUuid()
	 * @see #getAssociatedRisk()
	 * @generated
	 */
	EAttribute getAssociatedRisk_RiskUuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Characterization <em>Characterization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characterization</em>'.
	 * @see gov.nist.csrc.ns.oscal.Characterization
	 * @generated
	 */
	EClass getCharacterization();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Characterization#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Characterization#getProp()
	 * @see #getCharacterization()
	 * @generated
	 */
	EReference getCharacterization_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Characterization#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Characterization#getLink()
	 * @see #getCharacterization()
	 * @generated
	 */
	EReference getCharacterization_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Characterization#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Origin</em>'.
	 * @see gov.nist.csrc.ns.oscal.Characterization#getOrigin()
	 * @see #getCharacterization()
	 * @generated
	 */
	EReference getCharacterization_Origin();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Characterization#getFacet <em>Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Facet</em>'.
	 * @see gov.nist.csrc.ns.oscal.Characterization#getFacet()
	 * @see #getCharacterization()
	 * @generated
	 */
	EReference getCharacterization_Facet();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Finding <em>Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finding</em>'.
	 * @see gov.nist.csrc.ns.oscal.Finding
	 * @generated
	 */
	EClass getFinding();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Finding#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.Finding#getTitle()
	 * @see #getFinding()
	 * @generated
	 */
	EReference getFinding_Title();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Finding#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.Finding#getDescription()
	 * @see #getFinding()
	 * @generated
	 */
	EReference getFinding_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Finding#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Finding#getProp()
	 * @see #getFinding()
	 * @generated
	 */
	EReference getFinding_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Finding#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Finding#getLink()
	 * @see #getFinding()
	 * @generated
	 */
	EReference getFinding_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Finding#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Origin</em>'.
	 * @see gov.nist.csrc.ns.oscal.Finding#getOrigin()
	 * @see #getFinding()
	 * @generated
	 */
	EReference getFinding_Origin();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Finding#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see gov.nist.csrc.ns.oscal.Finding#getTarget()
	 * @see #getFinding()
	 * @generated
	 */
	EReference getFinding_Target();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Finding#getImplementationStatementUuid <em>Implementation Statement Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Statement Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Finding#getImplementationStatementUuid()
	 * @see #getFinding()
	 * @generated
	 */
	EAttribute getFinding_ImplementationStatementUuid();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Finding#getRelatedObservation <em>Related Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Related Observation</em>'.
	 * @see gov.nist.csrc.ns.oscal.Finding#getRelatedObservation()
	 * @see #getFinding()
	 * @generated
	 */
	EReference getFinding_RelatedObservation();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Finding#getAssociatedRisk <em>Associated Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Associated Risk</em>'.
	 * @see gov.nist.csrc.ns.oscal.Finding#getAssociatedRisk()
	 * @see #getFinding()
	 * @generated
	 */
	EReference getFinding_AssociatedRisk();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Finding#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.Finding#getRemarks()
	 * @see #getFinding()
	 * @generated
	 */
	EReference getFinding_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Finding#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Finding#getUuid()
	 * @see #getFinding()
	 * @generated
	 */
	EAttribute getFinding_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.FindingTarget <em>Finding Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finding Target</em>'.
	 * @see gov.nist.csrc.ns.oscal.FindingTarget
	 * @generated
	 */
	EClass getFindingTarget();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.FindingTarget#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.FindingTarget#getTitle()
	 * @see #getFindingTarget()
	 * @generated
	 */
	EReference getFindingTarget_Title();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.FindingTarget#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.FindingTarget#getDescription()
	 * @see #getFindingTarget()
	 * @generated
	 */
	EReference getFindingTarget_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.FindingTarget#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.FindingTarget#getProp()
	 * @see #getFindingTarget()
	 * @generated
	 */
	EReference getFindingTarget_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.FindingTarget#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.FindingTarget#getLink()
	 * @see #getFindingTarget()
	 * @generated
	 */
	EReference getFindingTarget_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.FindingTarget#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see gov.nist.csrc.ns.oscal.FindingTarget#getStatus()
	 * @see #getFindingTarget()
	 * @generated
	 */
	EReference getFindingTarget_Status();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.FindingTarget#getImplementationStatus <em>Implementation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation Status</em>'.
	 * @see gov.nist.csrc.ns.oscal.FindingTarget#getImplementationStatus()
	 * @see #getFindingTarget()
	 * @generated
	 */
	EReference getFindingTarget_ImplementationStatus();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.FindingTarget#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.FindingTarget#getRemarks()
	 * @see #getFindingTarget()
	 * @generated
	 */
	EReference getFindingTarget_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.FindingTarget#getTargetId <em>Target Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.FindingTarget#getTargetId()
	 * @see #getFindingTarget()
	 * @generated
	 */
	EAttribute getFindingTarget_TargetId();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.FindingTarget#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.nist.csrc.ns.oscal.FindingTarget#getType()
	 * @see #getFindingTarget()
	 * @generated
	 */
	EAttribute getFindingTarget_Type();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.ImportSsp <em>Import Ssp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Ssp</em>'.
	 * @see gov.nist.csrc.ns.oscal.ImportSsp
	 * @generated
	 */
	EClass getImportSsp();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ImportSsp#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.ImportSsp#getRemarks()
	 * @see #getImportSsp()
	 * @generated
	 */
	EReference getImportSsp_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ImportSsp#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see gov.nist.csrc.ns.oscal.ImportSsp#getHref()
	 * @see #getImportSsp()
	 * @generated
	 */
	EAttribute getImportSsp_Href();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.LocalObjective <em>Local Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Objective</em>'.
	 * @see gov.nist.csrc.ns.oscal.LocalObjective
	 * @generated
	 */
	EClass getLocalObjective();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.LocalObjective#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.LocalObjective#getDescription()
	 * @see #getLocalObjective()
	 * @generated
	 */
	EReference getLocalObjective_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.LocalObjective#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.LocalObjective#getProp()
	 * @see #getLocalObjective()
	 * @generated
	 */
	EReference getLocalObjective_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.LocalObjective#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.LocalObjective#getLink()
	 * @see #getLocalObjective()
	 * @generated
	 */
	EReference getLocalObjective_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.LocalObjective#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see gov.nist.csrc.ns.oscal.LocalObjective#getPart()
	 * @see #getLocalObjective()
	 * @generated
	 */
	EReference getLocalObjective_Part();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.LocalObjective#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.LocalObjective#getRemarks()
	 * @see #getLocalObjective()
	 * @generated
	 */
	EReference getLocalObjective_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.LocalObjective#getControlId <em>Control Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.LocalObjective#getControlId()
	 * @see #getLocalObjective()
	 * @generated
	 */
	EAttribute getLocalObjective_ControlId();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.LoggedBy <em>Logged By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logged By</em>'.
	 * @see gov.nist.csrc.ns.oscal.LoggedBy
	 * @generated
	 */
	EClass getLoggedBy();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.LoggedBy#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.LoggedBy#getRemarks()
	 * @see #getLoggedBy()
	 * @generated
	 */
	EReference getLoggedBy_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.LoggedBy#getPartyUuid <em>Party Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.LoggedBy#getPartyUuid()
	 * @see #getLoggedBy()
	 * @generated
	 */
	EAttribute getLoggedBy_PartyUuid();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.LoggedBy#getRoleId <em>Role Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.LoggedBy#getRoleId()
	 * @see #getLoggedBy()
	 * @generated
	 */
	EAttribute getLoggedBy_RoleId();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observation</em>'.
	 * @see gov.nist.csrc.ns.oscal.Observation
	 * @generated
	 */
	EClass getObservation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Observation#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.Observation#getTitle()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Title();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Observation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.Observation#getDescription()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Observation#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Observation#getProp()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Observation#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Observation#getLink()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Link();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.Observation#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Method</em>'.
	 * @see gov.nist.csrc.ns.oscal.Observation#getMethod()
	 * @see #getObservation()
	 * @generated
	 */
	EAttribute getObservation_Method();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.Observation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type</em>'.
	 * @see gov.nist.csrc.ns.oscal.Observation#getType()
	 * @see #getObservation()
	 * @generated
	 */
	EAttribute getObservation_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Observation#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Origin</em>'.
	 * @see gov.nist.csrc.ns.oscal.Observation#getOrigin()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Origin();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Observation#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subject</em>'.
	 * @see gov.nist.csrc.ns.oscal.Observation#getSubject()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Subject();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Observation#getRelevantEvidence <em>Relevant Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relevant Evidence</em>'.
	 * @see gov.nist.csrc.ns.oscal.Observation#getRelevantEvidence()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_RelevantEvidence();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Observation#getCollected <em>Collected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collected</em>'.
	 * @see gov.nist.csrc.ns.oscal.Observation#getCollected()
	 * @see #getObservation()
	 * @generated
	 */
	EAttribute getObservation_Collected();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Observation#getExpires <em>Expires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expires</em>'.
	 * @see gov.nist.csrc.ns.oscal.Observation#getExpires()
	 * @see #getObservation()
	 * @generated
	 */
	EAttribute getObservation_Expires();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Observation#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.Observation#getRemarks()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Observation#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Observation#getUuid()
	 * @see #getObservation()
	 * @generated
	 */
	EAttribute getObservation_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.OriginActor <em>Origin Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Origin Actor</em>'.
	 * @see gov.nist.csrc.ns.oscal.OriginActor
	 * @generated
	 */
	EClass getOriginActor();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.OriginActor#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.OriginActor#getProp()
	 * @see #getOriginActor()
	 * @generated
	 */
	EReference getOriginActor_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.OriginActor#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.OriginActor#getLink()
	 * @see #getOriginActor()
	 * @generated
	 */
	EReference getOriginActor_Link();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.OriginActor#getActorUuid <em>Actor Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actor Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.OriginActor#getActorUuid()
	 * @see #getOriginActor()
	 * @generated
	 */
	EAttribute getOriginActor_ActorUuid();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.OriginActor#getRoleId <em>Role Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.OriginActor#getRoleId()
	 * @see #getOriginActor()
	 * @generated
	 */
	EAttribute getOriginActor_RoleId();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.OriginActor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.nist.csrc.ns.oscal.OriginActor#getType()
	 * @see #getOriginActor()
	 * @generated
	 */
	EAttribute getOriginActor_Type();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Origin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Origin</em>'.
	 * @see gov.nist.csrc.ns.oscal.Origin
	 * @generated
	 */
	EClass getOrigin();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Origin#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actor</em>'.
	 * @see gov.nist.csrc.ns.oscal.Origin#getActor()
	 * @see #getOrigin()
	 * @generated
	 */
	EReference getOrigin_Actor();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Origin#getRelatedTask <em>Related Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Related Task</em>'.
	 * @see gov.nist.csrc.ns.oscal.Origin#getRelatedTask()
	 * @see #getOrigin()
	 * @generated
	 */
	EReference getOrigin_RelatedTask();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.RelatedObservation <em>Related Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related Observation</em>'.
	 * @see gov.nist.csrc.ns.oscal.RelatedObservation
	 * @generated
	 */
	EClass getRelatedObservation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.RelatedObservation#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.RelatedObservation#getRemarks()
	 * @see #getRelatedObservation()
	 * @generated
	 */
	EReference getRelatedObservation_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.RelatedObservation#getObservationUuid <em>Observation Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observation Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.RelatedObservation#getObservationUuid()
	 * @see #getRelatedObservation()
	 * @generated
	 */
	EAttribute getRelatedObservation_ObservationUuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.RelatedTask <em>Related Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related Task</em>'.
	 * @see gov.nist.csrc.ns.oscal.RelatedTask
	 * @generated
	 */
	EClass getRelatedTask();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.RelatedTask#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.RelatedTask#getProp()
	 * @see #getRelatedTask()
	 * @generated
	 */
	EReference getRelatedTask_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.RelatedTask#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.RelatedTask#getLink()
	 * @see #getRelatedTask()
	 * @generated
	 */
	EReference getRelatedTask_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.RelatedTask#getResponsibleParty <em>Responsible Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible Party</em>'.
	 * @see gov.nist.csrc.ns.oscal.RelatedTask#getResponsibleParty()
	 * @see #getRelatedTask()
	 * @generated
	 */
	EReference getRelatedTask_ResponsibleParty();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.RelatedTask#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subject</em>'.
	 * @see gov.nist.csrc.ns.oscal.RelatedTask#getSubject()
	 * @see #getRelatedTask()
	 * @generated
	 */
	EReference getRelatedTask_Subject();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.RelatedTask#getIdentifiedSubject <em>Identified Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identified Subject</em>'.
	 * @see gov.nist.csrc.ns.oscal.RelatedTask#getIdentifiedSubject()
	 * @see #getRelatedTask()
	 * @generated
	 */
	EReference getRelatedTask_IdentifiedSubject();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.RelatedTask#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.RelatedTask#getRemarks()
	 * @see #getRelatedTask()
	 * @generated
	 */
	EReference getRelatedTask_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.RelatedTask#getTaskUuid <em>Task Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.RelatedTask#getTaskUuid()
	 * @see #getRelatedTask()
	 * @generated
	 */
	EAttribute getRelatedTask_TaskUuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see gov.nist.csrc.ns.oscal.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Response#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.Response#getTitle()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_Title();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Response#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.Response#getDescription()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Response#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Response#getProp()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Response#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Response#getLink()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Response#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Origin</em>'.
	 * @see gov.nist.csrc.ns.oscal.Response#getOrigin()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_Origin();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Response#getRequiredAsset <em>Required Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Asset</em>'.
	 * @see gov.nist.csrc.ns.oscal.Response#getRequiredAsset()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_RequiredAsset();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Response#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see gov.nist.csrc.ns.oscal.Response#getTask()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_Task();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Response#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.Response#getRemarks()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Response#getLifecycle <em>Lifecycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lifecycle</em>'.
	 * @see gov.nist.csrc.ns.oscal.Response#getLifecycle()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Lifecycle();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Response#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Response#getUuid()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.ReviewedControls <em>Reviewed Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reviewed Controls</em>'.
	 * @see gov.nist.csrc.ns.oscal.ReviewedControls
	 * @generated
	 */
	EClass getReviewedControls();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ReviewedControls#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.ReviewedControls#getDescription()
	 * @see #getReviewedControls()
	 * @generated
	 */
	EReference getReviewedControls_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ReviewedControls#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.ReviewedControls#getProp()
	 * @see #getReviewedControls()
	 * @generated
	 */
	EReference getReviewedControls_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ReviewedControls#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.ReviewedControls#getLink()
	 * @see #getReviewedControls()
	 * @generated
	 */
	EReference getReviewedControls_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ReviewedControls#getControlSelection <em>Control Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control Selection</em>'.
	 * @see gov.nist.csrc.ns.oscal.ReviewedControls#getControlSelection()
	 * @see #getReviewedControls()
	 * @generated
	 */
	EReference getReviewedControls_ControlSelection();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ReviewedControls#getControlObjectiveSelection <em>Control Objective Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control Objective Selection</em>'.
	 * @see gov.nist.csrc.ns.oscal.ReviewedControls#getControlObjectiveSelection()
	 * @see #getReviewedControls()
	 * @generated
	 */
	EReference getReviewedControls_ControlObjectiveSelection();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ReviewedControls#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.ReviewedControls#getRemarks()
	 * @see #getReviewedControls()
	 * @generated
	 */
	EReference getReviewedControls_Remarks();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Risk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Risk</em>'.
	 * @see gov.nist.csrc.ns.oscal.Risk
	 * @generated
	 */
	EClass getRisk();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Risk#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.Risk#getTitle()
	 * @see #getRisk()
	 * @generated
	 */
	EReference getRisk_Title();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Risk#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.Risk#getDescription()
	 * @see #getRisk()
	 * @generated
	 */
	EReference getRisk_Description();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Risk#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see gov.nist.csrc.ns.oscal.Risk#getStatement()
	 * @see #getRisk()
	 * @generated
	 */
	EReference getRisk_Statement();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Risk#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Risk#getProp()
	 * @see #getRisk()
	 * @generated
	 */
	EReference getRisk_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Risk#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Risk#getLink()
	 * @see #getRisk()
	 * @generated
	 */
	EReference getRisk_Link();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Risk#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see gov.nist.csrc.ns.oscal.Risk#getStatus()
	 * @see #getRisk()
	 * @generated
	 */
	EAttribute getRisk_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Risk#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Origin</em>'.
	 * @see gov.nist.csrc.ns.oscal.Risk#getOrigin()
	 * @see #getRisk()
	 * @generated
	 */
	EReference getRisk_Origin();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Risk#getThreatId <em>Threat Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Threat Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.Risk#getThreatId()
	 * @see #getRisk()
	 * @generated
	 */
	EReference getRisk_ThreatId();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Risk#getCharacterization <em>Characterization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Characterization</em>'.
	 * @see gov.nist.csrc.ns.oscal.Risk#getCharacterization()
	 * @see #getRisk()
	 * @generated
	 */
	EReference getRisk_Characterization();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Risk#getMitigatingFactor <em>Mitigating Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mitigating Factor</em>'.
	 * @see gov.nist.csrc.ns.oscal.Risk#getMitigatingFactor()
	 * @see #getRisk()
	 * @generated
	 */
	EReference getRisk_MitigatingFactor();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Risk#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see gov.nist.csrc.ns.oscal.Risk#getDeadline()
	 * @see #getRisk()
	 * @generated
	 */
	EAttribute getRisk_Deadline();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Risk#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Response</em>'.
	 * @see gov.nist.csrc.ns.oscal.Risk#getResponse()
	 * @see #getRisk()
	 * @generated
	 */
	EReference getRisk_Response();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Risk#getRiskLog <em>Risk Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Risk Log</em>'.
	 * @see gov.nist.csrc.ns.oscal.Risk#getRiskLog()
	 * @see #getRisk()
	 * @generated
	 */
	EReference getRisk_RiskLog();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Risk#getRelatedObservation <em>Related Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Related Observation</em>'.
	 * @see gov.nist.csrc.ns.oscal.Risk#getRelatedObservation()
	 * @see #getRisk()
	 * @generated
	 */
	EReference getRisk_RelatedObservation();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Risk#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Risk#getUuid()
	 * @see #getRisk()
	 * @generated
	 */
	EAttribute getRisk_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.AssessmentSelectControlById <em>Assessment Select Control By Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment Select Control By Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentSelectControlById
	 * @generated
	 */
	EClass getAssessmentSelectControlById();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.AssessmentSelectControlById#getStatementId <em>Statement Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Statement Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentSelectControlById#getStatementId()
	 * @see #getAssessmentSelectControlById()
	 * @generated
	 */
	EAttribute getAssessmentSelectControlById_StatementId();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.AssessmentSelectControlById#getControlId <em>Control Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.AssessmentSelectControlById#getControlId()
	 * @see #getAssessmentSelectControlById()
	 * @generated
	 */
	EAttribute getAssessmentSelectControlById_ControlId();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.SelectObjectiveById <em>Select Objective By Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Objective By Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.SelectObjectiveById
	 * @generated
	 */
	EClass getSelectObjectiveById();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SelectObjectiveById#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.SelectObjectiveById#getRemarks()
	 * @see #getSelectObjectiveById()
	 * @generated
	 */
	EReference getSelectObjectiveById_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.SelectObjectiveById#getObjectiveId <em>Objective Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objective Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.SelectObjectiveById#getObjectiveId()
	 * @see #getSelectObjectiveById()
	 * @generated
	 */
	EAttribute getSelectObjectiveById_ObjectiveId();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.SelectSubjectById <em>Select Subject By Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Subject By Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.SelectSubjectById
	 * @generated
	 */
	EClass getSelectSubjectById();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SelectSubjectById#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.SelectSubjectById#getProp()
	 * @see #getSelectSubjectById()
	 * @generated
	 */
	EReference getSelectSubjectById_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SelectSubjectById#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.SelectSubjectById#getLink()
	 * @see #getSelectSubjectById()
	 * @generated
	 */
	EReference getSelectSubjectById_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SelectSubjectById#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.SelectSubjectById#getRemarks()
	 * @see #getSelectSubjectById()
	 * @generated
	 */
	EReference getSelectSubjectById_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.SelectSubjectById#getSubjectUuid <em>Subject Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.SelectSubjectById#getSubjectUuid()
	 * @see #getSelectSubjectById()
	 * @generated
	 */
	EAttribute getSelectSubjectById_SubjectUuid();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.SelectSubjectById#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.nist.csrc.ns.oscal.SelectSubjectById#getType()
	 * @see #getSelectSubjectById()
	 * @generated
	 */
	EAttribute getSelectSubjectById_Type();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.SubjectReference <em>Subject Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject Reference</em>'.
	 * @see gov.nist.csrc.ns.oscal.SubjectReference
	 * @generated
	 */
	EClass getSubjectReference();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SubjectReference#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.SubjectReference#getTitle()
	 * @see #getSubjectReference()
	 * @generated
	 */
	EReference getSubjectReference_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SubjectReference#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.SubjectReference#getProp()
	 * @see #getSubjectReference()
	 * @generated
	 */
	EReference getSubjectReference_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SubjectReference#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.SubjectReference#getLink()
	 * @see #getSubjectReference()
	 * @generated
	 */
	EReference getSubjectReference_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SubjectReference#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.SubjectReference#getRemarks()
	 * @see #getSubjectReference()
	 * @generated
	 */
	EReference getSubjectReference_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.SubjectReference#getSubjectUuid <em>Subject Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.SubjectReference#getSubjectUuid()
	 * @see #getSubjectReference()
	 * @generated
	 */
	EAttribute getSubjectReference_SubjectUuid();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.SubjectReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.nist.csrc.ns.oscal.SubjectReference#getType()
	 * @see #getSubjectReference()
	 * @generated
	 */
	EAttribute getSubjectReference_Type();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see gov.nist.csrc.ns.oscal.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Task#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.Task#getTitle()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Title();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Task#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.Task#getDescription()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Task#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Task#getProp()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Task#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Task#getLink()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Task#getTiming <em>Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timing</em>'.
	 * @see gov.nist.csrc.ns.oscal.Task#getTiming()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Timing();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Task#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependency</em>'.
	 * @see gov.nist.csrc.ns.oscal.Task#getDependency()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Dependency();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Task#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see gov.nist.csrc.ns.oscal.Task#getTask()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Task();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Task#getAssociatedActivity <em>Associated Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Associated Activity</em>'.
	 * @see gov.nist.csrc.ns.oscal.Task#getAssociatedActivity()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_AssociatedActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Task#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subject</em>'.
	 * @see gov.nist.csrc.ns.oscal.Task#getSubject()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Subject();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Task#getResponsibleRole <em>Responsible Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible Role</em>'.
	 * @see gov.nist.csrc.ns.oscal.Task#getResponsibleRole()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_ResponsibleRole();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Task#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.Task#getRemarks()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Task#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.nist.csrc.ns.oscal.Task#getType()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Type();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Task#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Task#getUuid()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.ThreatId <em>Threat Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threat Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.ThreatId
	 * @generated
	 */
	EClass getThreatId();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ThreatId#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.csrc.ns.oscal.ThreatId#getValue()
	 * @see #getThreatId()
	 * @generated
	 */
	EAttribute getThreatId_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ThreatId#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see gov.nist.csrc.ns.oscal.ThreatId#getHref()
	 * @see #getThreatId()
	 * @generated
	 */
	EAttribute getThreatId_Href();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ThreatId#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see gov.nist.csrc.ns.oscal.ThreatId#getSystem()
	 * @see #getThreatId()
	 * @generated
	 */
	EAttribute getThreatId_System();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog</em>'.
	 * @see gov.nist.csrc.ns.oscal.Catalog
	 * @generated
	 */
	EClass getCatalog();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Catalog#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see gov.nist.csrc.ns.oscal.Catalog#getMetadata()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Metadata();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Catalog#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see gov.nist.csrc.ns.oscal.Catalog#getParam()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Param();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Catalog#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control</em>'.
	 * @see gov.nist.csrc.ns.oscal.Catalog#getControl()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Control();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Catalog#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see gov.nist.csrc.ns.oscal.Catalog#getGroup()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Group();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Catalog#getBackMatter <em>Back Matter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Back Matter</em>'.
	 * @see gov.nist.csrc.ns.oscal.Catalog#getBackMatter()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_BackMatter();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Catalog#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Catalog#getUuid()
	 * @see #getCatalog()
	 * @generated
	 */
	EAttribute getCatalog_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see gov.nist.csrc.ns.oscal.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Control#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.Control#getTitle()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Control#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see gov.nist.csrc.ns.oscal.Control#getParam()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Param();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Control#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Control#getProp()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Control#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Control#getLink()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Control#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see gov.nist.csrc.ns.oscal.Control#getPart()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Part();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Control#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control</em>'.
	 * @see gov.nist.csrc.ns.oscal.Control#getControl()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Control();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Control#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see gov.nist.csrc.ns.oscal.Control#getClass_()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Class();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Control#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.Control#getId()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Id();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.CatalogGroup <em>Catalog Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog Group</em>'.
	 * @see gov.nist.csrc.ns.oscal.CatalogGroup
	 * @generated
	 */
	EClass getCatalogGroup();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.CatalogGroup#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.CatalogGroup#getTitle()
	 * @see #getCatalogGroup()
	 * @generated
	 */
	EReference getCatalogGroup_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.CatalogGroup#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see gov.nist.csrc.ns.oscal.CatalogGroup#getParam()
	 * @see #getCatalogGroup()
	 * @generated
	 */
	EReference getCatalogGroup_Param();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.CatalogGroup#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.CatalogGroup#getProp()
	 * @see #getCatalogGroup()
	 * @generated
	 */
	EReference getCatalogGroup_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.CatalogGroup#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.CatalogGroup#getLink()
	 * @see #getCatalogGroup()
	 * @generated
	 */
	EReference getCatalogGroup_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.CatalogGroup#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see gov.nist.csrc.ns.oscal.CatalogGroup#getPart()
	 * @see #getCatalogGroup()
	 * @generated
	 */
	EReference getCatalogGroup_Part();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.CatalogGroup#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see gov.nist.csrc.ns.oscal.CatalogGroup#getGroup()
	 * @see #getCatalogGroup()
	 * @generated
	 */
	EReference getCatalogGroup_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.CatalogGroup#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control</em>'.
	 * @see gov.nist.csrc.ns.oscal.CatalogGroup#getControl()
	 * @see #getCatalogGroup()
	 * @generated
	 */
	EReference getCatalogGroup_Control();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.CatalogGroup#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see gov.nist.csrc.ns.oscal.CatalogGroup#getClass_()
	 * @see #getCatalogGroup()
	 * @generated
	 */
	EAttribute getCatalogGroup_Class();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.CatalogGroup#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.CatalogGroup#getId()
	 * @see #getCatalogGroup()
	 * @generated
	 */
	EAttribute getCatalogGroup_Id();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see gov.nist.csrc.ns.oscal.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Capability#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.Capability#getDescription()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Capability#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Capability#getProp()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Capability#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Capability#getLink()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Capability#getIncorporatesComponent <em>Incorporates Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Incorporates Component</em>'.
	 * @see gov.nist.csrc.ns.oscal.Capability#getIncorporatesComponent()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_IncorporatesComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Capability#getControlImplementation <em>Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control Implementation</em>'.
	 * @see gov.nist.csrc.ns.oscal.Capability#getControlImplementation()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_ControlImplementation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Capability#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.Capability#getRemarks()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Capability#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gov.nist.csrc.ns.oscal.Capability#getName()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_Name();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Capability#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Capability#getUuid()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.ComponentDefinition <em>Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Definition</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentDefinition
	 * @generated
	 */
	EClass getComponentDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ComponentDefinition#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentDefinition#getMetadata()
	 * @see #getComponentDefinition()
	 * @generated
	 */
	EReference getComponentDefinition_Metadata();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ComponentDefinition#getImportComponentDefinition <em>Import Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import Component Definition</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentDefinition#getImportComponentDefinition()
	 * @see #getComponentDefinition()
	 * @generated
	 */
	EReference getComponentDefinition_ImportComponentDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ComponentDefinition#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentDefinition#getComponent()
	 * @see #getComponentDefinition()
	 * @generated
	 */
	EReference getComponentDefinition_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ComponentDefinition#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capability</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentDefinition#getCapability()
	 * @see #getComponentDefinition()
	 * @generated
	 */
	EReference getComponentDefinition_Capability();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ComponentDefinition#getBackMatter <em>Back Matter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Back Matter</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentDefinition#getBackMatter()
	 * @see #getComponentDefinition()
	 * @generated
	 */
	EReference getComponentDefinition_BackMatter();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ComponentDefinition#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentDefinition#getUuid()
	 * @see #getComponentDefinition()
	 * @generated
	 */
	EAttribute getComponentDefinition_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.ComponentControlImplementation <em>Component Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Control Implementation</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentControlImplementation
	 * @generated
	 */
	EClass getComponentControlImplementation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ComponentControlImplementation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentControlImplementation#getDescription()
	 * @see #getComponentControlImplementation()
	 * @generated
	 */
	EReference getComponentControlImplementation_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ComponentControlImplementation#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentControlImplementation#getProp()
	 * @see #getComponentControlImplementation()
	 * @generated
	 */
	EReference getComponentControlImplementation_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ComponentControlImplementation#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentControlImplementation#getLink()
	 * @see #getComponentControlImplementation()
	 * @generated
	 */
	EReference getComponentControlImplementation_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ComponentControlImplementation#getSetParameter <em>Set Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Parameter</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentControlImplementation#getSetParameter()
	 * @see #getComponentControlImplementation()
	 * @generated
	 */
	EReference getComponentControlImplementation_SetParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ComponentControlImplementation#getImplementedRequirement <em>Implemented Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implemented Requirement</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentControlImplementation#getImplementedRequirement()
	 * @see #getComponentControlImplementation()
	 * @generated
	 */
	EReference getComponentControlImplementation_ImplementedRequirement();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ComponentControlImplementation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentControlImplementation#getSource()
	 * @see #getComponentControlImplementation()
	 * @generated
	 */
	EAttribute getComponentControlImplementation_Source();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ComponentControlImplementation#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentControlImplementation#getUuid()
	 * @see #getComponentControlImplementation()
	 * @generated
	 */
	EAttribute getComponentControlImplementation_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.DefinedComponent <em>Defined Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defined Component</em>'.
	 * @see gov.nist.csrc.ns.oscal.DefinedComponent
	 * @generated
	 */
	EClass getDefinedComponent();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.DefinedComponent#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.DefinedComponent#getTitle()
	 * @see #getDefinedComponent()
	 * @generated
	 */
	EReference getDefinedComponent_Title();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.DefinedComponent#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.DefinedComponent#getDescription()
	 * @see #getDefinedComponent()
	 * @generated
	 */
	EReference getDefinedComponent_Description();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.DefinedComponent#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Purpose</em>'.
	 * @see gov.nist.csrc.ns.oscal.DefinedComponent#getPurpose()
	 * @see #getDefinedComponent()
	 * @generated
	 */
	EReference getDefinedComponent_Purpose();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.DefinedComponent#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.DefinedComponent#getProp()
	 * @see #getDefinedComponent()
	 * @generated
	 */
	EReference getDefinedComponent_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.DefinedComponent#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.DefinedComponent#getLink()
	 * @see #getDefinedComponent()
	 * @generated
	 */
	EReference getDefinedComponent_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.DefinedComponent#getResponsibleRole <em>Responsible Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible Role</em>'.
	 * @see gov.nist.csrc.ns.oscal.DefinedComponent#getResponsibleRole()
	 * @see #getDefinedComponent()
	 * @generated
	 */
	EReference getDefinedComponent_ResponsibleRole();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.DefinedComponent#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocol</em>'.
	 * @see gov.nist.csrc.ns.oscal.DefinedComponent#getProtocol()
	 * @see #getDefinedComponent()
	 * @generated
	 */
	EReference getDefinedComponent_Protocol();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.DefinedComponent#getControlImplementation <em>Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control Implementation</em>'.
	 * @see gov.nist.csrc.ns.oscal.DefinedComponent#getControlImplementation()
	 * @see #getDefinedComponent()
	 * @generated
	 */
	EReference getDefinedComponent_ControlImplementation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.DefinedComponent#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.DefinedComponent#getRemarks()
	 * @see #getDefinedComponent()
	 * @generated
	 */
	EReference getDefinedComponent_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.DefinedComponent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.nist.csrc.ns.oscal.DefinedComponent#getType()
	 * @see #getDefinedComponent()
	 * @generated
	 */
	EAttribute getDefinedComponent_Type();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.DefinedComponent#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.DefinedComponent#getUuid()
	 * @see #getDefinedComponent()
	 * @generated
	 */
	EAttribute getDefinedComponent_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.ComponentImplementedRequirement <em>Component Implemented Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Implemented Requirement</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentImplementedRequirement
	 * @generated
	 */
	EClass getComponentImplementedRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ComponentImplementedRequirement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentImplementedRequirement#getDescription()
	 * @see #getComponentImplementedRequirement()
	 * @generated
	 */
	EReference getComponentImplementedRequirement_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ComponentImplementedRequirement#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentImplementedRequirement#getProp()
	 * @see #getComponentImplementedRequirement()
	 * @generated
	 */
	EReference getComponentImplementedRequirement_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ComponentImplementedRequirement#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentImplementedRequirement#getLink()
	 * @see #getComponentImplementedRequirement()
	 * @generated
	 */
	EReference getComponentImplementedRequirement_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ComponentImplementedRequirement#getSetParameter <em>Set Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Parameter</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentImplementedRequirement#getSetParameter()
	 * @see #getComponentImplementedRequirement()
	 * @generated
	 */
	EReference getComponentImplementedRequirement_SetParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ComponentImplementedRequirement#getResponsibleRole <em>Responsible Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible Role</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentImplementedRequirement#getResponsibleRole()
	 * @see #getComponentImplementedRequirement()
	 * @generated
	 */
	EReference getComponentImplementedRequirement_ResponsibleRole();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ComponentImplementedRequirement#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentImplementedRequirement#getStatement()
	 * @see #getComponentImplementedRequirement()
	 * @generated
	 */
	EReference getComponentImplementedRequirement_Statement();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ComponentImplementedRequirement#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentImplementedRequirement#getRemarks()
	 * @see #getComponentImplementedRequirement()
	 * @generated
	 */
	EReference getComponentImplementedRequirement_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ComponentImplementedRequirement#getControlId <em>Control Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentImplementedRequirement#getControlId()
	 * @see #getComponentImplementedRequirement()
	 * @generated
	 */
	EAttribute getComponentImplementedRequirement_ControlId();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ComponentImplementedRequirement#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentImplementedRequirement#getUuid()
	 * @see #getComponentImplementedRequirement()
	 * @generated
	 */
	EAttribute getComponentImplementedRequirement_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.ImportComponentDefinition <em>Import Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Component Definition</em>'.
	 * @see gov.nist.csrc.ns.oscal.ImportComponentDefinition
	 * @generated
	 */
	EClass getImportComponentDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ImportComponentDefinition#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.ImportComponentDefinition#getRemarks()
	 * @see #getImportComponentDefinition()
	 * @generated
	 */
	EReference getImportComponentDefinition_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ImportComponentDefinition#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see gov.nist.csrc.ns.oscal.ImportComponentDefinition#getHref()
	 * @see #getImportComponentDefinition()
	 * @generated
	 */
	EAttribute getImportComponentDefinition_Href();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.IncorporatesComponent <em>Incorporates Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incorporates Component</em>'.
	 * @see gov.nist.csrc.ns.oscal.IncorporatesComponent
	 * @generated
	 */
	EClass getIncorporatesComponent();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.IncorporatesComponent#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.IncorporatesComponent#getDescription()
	 * @see #getIncorporatesComponent()
	 * @generated
	 */
	EReference getIncorporatesComponent_Description();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.IncorporatesComponent#getComponentUuid <em>Component Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.IncorporatesComponent#getComponentUuid()
	 * @see #getIncorporatesComponent()
	 * @generated
	 */
	EAttribute getIncorporatesComponent_ComponentUuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.ComponentStatement <em>Component Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Statement</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentStatement
	 * @generated
	 */
	EClass getComponentStatement();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ComponentStatement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentStatement#getDescription()
	 * @see #getComponentStatement()
	 * @generated
	 */
	EReference getComponentStatement_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ComponentStatement#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentStatement#getProp()
	 * @see #getComponentStatement()
	 * @generated
	 */
	EReference getComponentStatement_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ComponentStatement#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentStatement#getLink()
	 * @see #getComponentStatement()
	 * @generated
	 */
	EReference getComponentStatement_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ComponentStatement#getResponsibleRole <em>Responsible Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible Role</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentStatement#getResponsibleRole()
	 * @see #getComponentStatement()
	 * @generated
	 */
	EReference getComponentStatement_ResponsibleRole();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ComponentStatement#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentStatement#getRemarks()
	 * @see #getComponentStatement()
	 * @generated
	 */
	EReference getComponentStatement_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ComponentStatement#getStatementId <em>Statement Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentStatement#getStatementId()
	 * @see #getComponentStatement()
	 * @generated
	 */
	EAttribute getComponentStatement_StatementId();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ComponentStatement#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.ComponentStatement#getUuid()
	 * @see #getComponentStatement()
	 * @generated
	 */
	EAttribute getComponentStatement_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.IncludeAll <em>Include All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include All</em>'.
	 * @see gov.nist.csrc.ns.oscal.IncludeAll
	 * @generated
	 */
	EClass getIncludeAll();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Matching <em>Matching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matching</em>'.
	 * @see gov.nist.csrc.ns.oscal.Matching
	 * @generated
	 */
	EClass getMatching();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Matching#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.Matching#getRemarks()
	 * @see #getMatching()
	 * @generated
	 */
	EReference getMatching_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Matching#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see gov.nist.csrc.ns.oscal.Matching#getPattern()
	 * @see #getMatching()
	 * @generated
	 */
	EAttribute getMatching_Pattern();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see gov.nist.csrc.ns.oscal.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Parameter#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Parameter#getProp()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Parameter#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Parameter#getLink()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Parameter#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see gov.nist.csrc.ns.oscal.Parameter#getLabel()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Label();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Parameter#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Usage</em>'.
	 * @see gov.nist.csrc.ns.oscal.Parameter#getUsage()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Usage();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Parameter#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see gov.nist.csrc.ns.oscal.Parameter#getConstraint()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Constraint();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Parameter#getGuideline <em>Guideline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guideline</em>'.
	 * @see gov.nist.csrc.ns.oscal.Parameter#getGuideline()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Guideline();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see gov.nist.csrc.ns.oscal.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Parameter#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select</em>'.
	 * @see gov.nist.csrc.ns.oscal.Parameter#getSelect()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Select();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Parameter#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.Parameter#getRemarks()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Parameter#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see gov.nist.csrc.ns.oscal.Parameter#getClass_()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Class();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Parameter#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depends On</em>'.
	 * @see gov.nist.csrc.ns.oscal.Parameter#getDependsOn()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_DependsOn();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Parameter#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.Parameter#getId()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Id();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.ParameterConstraint <em>Parameter Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Constraint</em>'.
	 * @see gov.nist.csrc.ns.oscal.ParameterConstraint
	 * @generated
	 */
	EClass getParameterConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ParameterConstraint#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.ParameterConstraint#getDescription()
	 * @see #getParameterConstraint()
	 * @generated
	 */
	EReference getParameterConstraint_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ParameterConstraint#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test</em>'.
	 * @see gov.nist.csrc.ns.oscal.ParameterConstraint#getTest()
	 * @see #getParameterConstraint()
	 * @generated
	 */
	EReference getParameterConstraint_Test();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.ParameterGuideline <em>Parameter Guideline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Guideline</em>'.
	 * @see gov.nist.csrc.ns.oscal.ParameterGuideline
	 * @generated
	 */
	EClass getParameterGuideline();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.ParameterGuideline#getBlockElementGroup <em>Block Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Block Element Group</em>'.
	 * @see gov.nist.csrc.ns.oscal.ParameterGuideline#getBlockElementGroup()
	 * @see #getParameterGuideline()
	 * @generated
	 */
	EAttribute getParameterGuideline_BlockElementGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ParameterGuideline#getH1 <em>H1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H1</em>'.
	 * @see gov.nist.csrc.ns.oscal.ParameterGuideline#getH1()
	 * @see #getParameterGuideline()
	 * @generated
	 */
	EReference getParameterGuideline_H1();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ParameterGuideline#getH2 <em>H2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H2</em>'.
	 * @see gov.nist.csrc.ns.oscal.ParameterGuideline#getH2()
	 * @see #getParameterGuideline()
	 * @generated
	 */
	EReference getParameterGuideline_H2();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ParameterGuideline#getH3 <em>H3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H3</em>'.
	 * @see gov.nist.csrc.ns.oscal.ParameterGuideline#getH3()
	 * @see #getParameterGuideline()
	 * @generated
	 */
	EReference getParameterGuideline_H3();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ParameterGuideline#getH4 <em>H4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H4</em>'.
	 * @see gov.nist.csrc.ns.oscal.ParameterGuideline#getH4()
	 * @see #getParameterGuideline()
	 * @generated
	 */
	EReference getParameterGuideline_H4();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ParameterGuideline#getH5 <em>H5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H5</em>'.
	 * @see gov.nist.csrc.ns.oscal.ParameterGuideline#getH5()
	 * @see #getParameterGuideline()
	 * @generated
	 */
	EReference getParameterGuideline_H5();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ParameterGuideline#getH6 <em>H6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H6</em>'.
	 * @see gov.nist.csrc.ns.oscal.ParameterGuideline#getH6()
	 * @see #getParameterGuideline()
	 * @generated
	 */
	EReference getParameterGuideline_H6();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ParameterGuideline#getUl <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ul</em>'.
	 * @see gov.nist.csrc.ns.oscal.ParameterGuideline#getUl()
	 * @see #getParameterGuideline()
	 * @generated
	 */
	EReference getParameterGuideline_Ul();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ParameterGuideline#getOl <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ol</em>'.
	 * @see gov.nist.csrc.ns.oscal.ParameterGuideline#getOl()
	 * @see #getParameterGuideline()
	 * @generated
	 */
	EReference getParameterGuideline_Ol();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ParameterGuideline#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre</em>'.
	 * @see gov.nist.csrc.ns.oscal.ParameterGuideline#getPre()
	 * @see #getParameterGuideline()
	 * @generated
	 */
	EReference getParameterGuideline_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ParameterGuideline#getHr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hr</em>'.
	 * @see gov.nist.csrc.ns.oscal.ParameterGuideline#getHr()
	 * @see #getParameterGuideline()
	 * @generated
	 */
	EReference getParameterGuideline_Hr();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ParameterGuideline#getBlockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blockquote</em>'.
	 * @see gov.nist.csrc.ns.oscal.ParameterGuideline#getBlockquote()
	 * @see #getParameterGuideline()
	 * @generated
	 */
	EReference getParameterGuideline_Blockquote();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ParameterGuideline#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see gov.nist.csrc.ns.oscal.ParameterGuideline#getP()
	 * @see #getParameterGuideline()
	 * @generated
	 */
	EReference getParameterGuideline_P();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ParameterGuideline#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see gov.nist.csrc.ns.oscal.ParameterGuideline#getTable()
	 * @see #getParameterGuideline()
	 * @generated
	 */
	EReference getParameterGuideline_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ParameterGuideline#getImg <em>Img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Img</em>'.
	 * @see gov.nist.csrc.ns.oscal.ParameterGuideline#getImg()
	 * @see #getParameterGuideline()
	 * @generated
	 */
	EReference getParameterGuideline_Img();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.ParameterSelection <em>Parameter Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Selection</em>'.
	 * @see gov.nist.csrc.ns.oscal.ParameterSelection
	 * @generated
	 */
	EClass getParameterSelection();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ParameterSelection#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choice</em>'.
	 * @see gov.nist.csrc.ns.oscal.ParameterSelection#getChoice()
	 * @see #getParameterSelection()
	 * @generated
	 */
	EReference getParameterSelection_Choice();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ParameterSelection#getHowMany <em>How Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>How Many</em>'.
	 * @see gov.nist.csrc.ns.oscal.ParameterSelection#getHowMany()
	 * @see #getParameterSelection()
	 * @generated
	 */
	EAttribute getParameterSelection_HowMany();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see gov.nist.csrc.ns.oscal.Part
	 * @generated
	 */
	EClass getPart();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Part#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.Part#getTitle()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Part#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Part#getProp()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Prop();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.Part#getBlockElementGroup <em>Block Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Block Element Group</em>'.
	 * @see gov.nist.csrc.ns.oscal.Part#getBlockElementGroup()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_BlockElementGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Part#getH1 <em>H1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H1</em>'.
	 * @see gov.nist.csrc.ns.oscal.Part#getH1()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_H1();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Part#getH2 <em>H2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H2</em>'.
	 * @see gov.nist.csrc.ns.oscal.Part#getH2()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_H2();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Part#getH3 <em>H3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H3</em>'.
	 * @see gov.nist.csrc.ns.oscal.Part#getH3()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_H3();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Part#getH4 <em>H4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H4</em>'.
	 * @see gov.nist.csrc.ns.oscal.Part#getH4()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_H4();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Part#getH5 <em>H5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H5</em>'.
	 * @see gov.nist.csrc.ns.oscal.Part#getH5()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_H5();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Part#getH6 <em>H6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H6</em>'.
	 * @see gov.nist.csrc.ns.oscal.Part#getH6()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_H6();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Part#getUl <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ul</em>'.
	 * @see gov.nist.csrc.ns.oscal.Part#getUl()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Ul();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Part#getOl <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ol</em>'.
	 * @see gov.nist.csrc.ns.oscal.Part#getOl()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Ol();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Part#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre</em>'.
	 * @see gov.nist.csrc.ns.oscal.Part#getPre()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Part#getHr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hr</em>'.
	 * @see gov.nist.csrc.ns.oscal.Part#getHr()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Hr();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Part#getBlockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blockquote</em>'.
	 * @see gov.nist.csrc.ns.oscal.Part#getBlockquote()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Blockquote();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Part#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see gov.nist.csrc.ns.oscal.Part#getP()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_P();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Part#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see gov.nist.csrc.ns.oscal.Part#getTable()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Part#getImg <em>Img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Img</em>'.
	 * @see gov.nist.csrc.ns.oscal.Part#getImg()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Img();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Part#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see gov.nist.csrc.ns.oscal.Part#getPart()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Part();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Part#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Part#getLink()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Link();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Part#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see gov.nist.csrc.ns.oscal.Part#getClass_()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Class();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Part#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.Part#getId()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Part#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gov.nist.csrc.ns.oscal.Part#getName()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Name();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Part#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see gov.nist.csrc.ns.oscal.Part#getNs()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Ns();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.ControlSelectControlById <em>Control Select Control By Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Select Control By Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.ControlSelectControlById
	 * @generated
	 */
	EClass getControlSelectControlById();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.ControlSelectControlById#getWithId <em>With Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>With Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.ControlSelectControlById#getWithId()
	 * @see #getControlSelectControlById()
	 * @generated
	 */
	EAttribute getControlSelectControlById_WithId();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ControlSelectControlById#getMatching <em>Matching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matching</em>'.
	 * @see gov.nist.csrc.ns.oscal.ControlSelectControlById#getMatching()
	 * @see #getControlSelectControlById()
	 * @generated
	 */
	EReference getControlSelectControlById_Matching();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ControlSelectControlById#getWithChildControls <em>With Child Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>With Child Controls</em>'.
	 * @see gov.nist.csrc.ns.oscal.ControlSelectControlById#getWithChildControls()
	 * @see #getControlSelectControlById()
	 * @generated
	 */
	EAttribute getControlSelectControlById_WithChildControls();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.AuthorizedPrivilege <em>Authorized Privilege</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorized Privilege</em>'.
	 * @see gov.nist.csrc.ns.oscal.AuthorizedPrivilege
	 * @generated
	 */
	EClass getAuthorizedPrivilege();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AuthorizedPrivilege#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.AuthorizedPrivilege#getTitle()
	 * @see #getAuthorizedPrivilege()
	 * @generated
	 */
	EReference getAuthorizedPrivilege_Title();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AuthorizedPrivilege#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.AuthorizedPrivilege#getDescription()
	 * @see #getAuthorizedPrivilege()
	 * @generated
	 */
	EReference getAuthorizedPrivilege_Description();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.AuthorizedPrivilege#getFunctionPerformed <em>Function Performed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Function Performed</em>'.
	 * @see gov.nist.csrc.ns.oscal.AuthorizedPrivilege#getFunctionPerformed()
	 * @see #getAuthorizedPrivilege()
	 * @generated
	 */
	EAttribute getAuthorizedPrivilege_FunctionPerformed();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.ImplementationStatus <em>Implementation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Status</em>'.
	 * @see gov.nist.csrc.ns.oscal.ImplementationStatus
	 * @generated
	 */
	EClass getImplementationStatus();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ImplementationStatus#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.ImplementationStatus#getRemarks()
	 * @see #getImplementationStatus()
	 * @generated
	 */
	EReference getImplementationStatus_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ImplementationStatus#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see gov.nist.csrc.ns.oscal.ImplementationStatus#getState()
	 * @see #getImplementationStatus()
	 * @generated
	 */
	EAttribute getImplementationStatus_State();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.InventoryItem <em>Inventory Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inventory Item</em>'.
	 * @see gov.nist.csrc.ns.oscal.InventoryItem
	 * @generated
	 */
	EClass getInventoryItem();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.InventoryItem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.InventoryItem#getDescription()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EReference getInventoryItem_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.InventoryItem#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.InventoryItem#getProp()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EReference getInventoryItem_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.InventoryItem#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.InventoryItem#getLink()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EReference getInventoryItem_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.InventoryItem#getResponsibleParty <em>Responsible Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible Party</em>'.
	 * @see gov.nist.csrc.ns.oscal.InventoryItem#getResponsibleParty()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EReference getInventoryItem_ResponsibleParty();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.InventoryItem#getImplementedComponent <em>Implemented Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implemented Component</em>'.
	 * @see gov.nist.csrc.ns.oscal.InventoryItem#getImplementedComponent()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EReference getInventoryItem_ImplementedComponent();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.InventoryItem#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.InventoryItem#getRemarks()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EReference getInventoryItem_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.InventoryItem#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.InventoryItem#getUuid()
	 * @see #getInventoryItem()
	 * @generated
	 */
	EAttribute getInventoryItem_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.PortRange <em>Port Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Range</em>'.
	 * @see gov.nist.csrc.ns.oscal.PortRange
	 * @generated
	 */
	EClass getPortRange();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.PortRange#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.PortRange#getRemarks()
	 * @see #getPortRange()
	 * @generated
	 */
	EReference getPortRange_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.PortRange#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see gov.nist.csrc.ns.oscal.PortRange#getEnd()
	 * @see #getPortRange()
	 * @generated
	 */
	EAttribute getPortRange_End();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.PortRange#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see gov.nist.csrc.ns.oscal.PortRange#getStart()
	 * @see #getPortRange()
	 * @generated
	 */
	EAttribute getPortRange_Start();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.PortRange#getTransport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transport</em>'.
	 * @see gov.nist.csrc.ns.oscal.PortRange#getTransport()
	 * @see #getPortRange()
	 * @generated
	 */
	EAttribute getPortRange_Transport();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol</em>'.
	 * @see gov.nist.csrc.ns.oscal.Protocol
	 * @generated
	 */
	EClass getProtocol();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Protocol#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.Protocol#getTitle()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Protocol#getPortRange <em>Port Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Range</em>'.
	 * @see gov.nist.csrc.ns.oscal.Protocol#getPortRange()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_PortRange();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Protocol#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gov.nist.csrc.ns.oscal.Protocol#getName()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_Name();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Protocol#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Protocol#getUuid()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.SetParameter <em>Set Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Parameter</em>'.
	 * @see gov.nist.csrc.ns.oscal.SetParameter
	 * @generated
	 */
	EClass getSetParameter();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.SetParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see gov.nist.csrc.ns.oscal.SetParameter#getValue()
	 * @see #getSetParameter()
	 * @generated
	 */
	EAttribute getSetParameter_Value();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SetParameter#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.SetParameter#getRemarks()
	 * @see #getSetParameter()
	 * @generated
	 */
	EReference getSetParameter_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.SetParameter#getParamId <em>Param Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.SetParameter#getParamId()
	 * @see #getSetParameter()
	 * @generated
	 */
	EAttribute getSetParameter_ParamId();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.SystemComponent <em>System Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Component</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemComponent
	 * @generated
	 */
	EClass getSystemComponent();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SystemComponent#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemComponent#getTitle()
	 * @see #getSystemComponent()
	 * @generated
	 */
	EReference getSystemComponent_Title();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SystemComponent#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemComponent#getDescription()
	 * @see #getSystemComponent()
	 * @generated
	 */
	EReference getSystemComponent_Description();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SystemComponent#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Purpose</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemComponent#getPurpose()
	 * @see #getSystemComponent()
	 * @generated
	 */
	EReference getSystemComponent_Purpose();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SystemComponent#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemComponent#getProp()
	 * @see #getSystemComponent()
	 * @generated
	 */
	EReference getSystemComponent_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SystemComponent#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemComponent#getLink()
	 * @see #getSystemComponent()
	 * @generated
	 */
	EReference getSystemComponent_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SystemComponent#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemComponent#getStatus()
	 * @see #getSystemComponent()
	 * @generated
	 */
	EReference getSystemComponent_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SystemComponent#getResponsibleRole <em>Responsible Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible Role</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemComponent#getResponsibleRole()
	 * @see #getSystemComponent()
	 * @generated
	 */
	EReference getSystemComponent_ResponsibleRole();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SystemComponent#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocol</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemComponent#getProtocol()
	 * @see #getSystemComponent()
	 * @generated
	 */
	EReference getSystemComponent_Protocol();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SystemComponent#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemComponent#getRemarks()
	 * @see #getSystemComponent()
	 * @generated
	 */
	EReference getSystemComponent_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.SystemComponent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemComponent#getType()
	 * @see #getSystemComponent()
	 * @generated
	 */
	EAttribute getSystemComponent_Type();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.SystemComponent#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemComponent#getUuid()
	 * @see #getSystemComponent()
	 * @generated
	 */
	EAttribute getSystemComponent_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.SystemId <em>System Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemId
	 * @generated
	 */
	EClass getSystemId();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.SystemId#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemId#getValue()
	 * @see #getSystemId()
	 * @generated
	 */
	EAttribute getSystemId_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.SystemId#getIdentifierType <em>Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier Type</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemId#getIdentifierType()
	 * @see #getSystemId()
	 * @generated
	 */
	EAttribute getSystemId_IdentifierType();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.SystemUser <em>System User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System User</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemUser
	 * @generated
	 */
	EClass getSystemUser();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SystemUser#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemUser#getTitle()
	 * @see #getSystemUser()
	 * @generated
	 */
	EReference getSystemUser_Title();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.SystemUser#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemUser#getShortName()
	 * @see #getSystemUser()
	 * @generated
	 */
	EAttribute getSystemUser_ShortName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SystemUser#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemUser#getDescription()
	 * @see #getSystemUser()
	 * @generated
	 */
	EReference getSystemUser_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SystemUser#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemUser#getProp()
	 * @see #getSystemUser()
	 * @generated
	 */
	EReference getSystemUser_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SystemUser#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemUser#getLink()
	 * @see #getSystemUser()
	 * @generated
	 */
	EReference getSystemUser_Link();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.SystemUser#getRoleId <em>Role Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Role Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemUser#getRoleId()
	 * @see #getSystemUser()
	 * @generated
	 */
	EAttribute getSystemUser_RoleId();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SystemUser#getAuthorizedPrivilege <em>Authorized Privilege</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authorized Privilege</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemUser#getAuthorizedPrivilege()
	 * @see #getSystemUser()
	 * @generated
	 */
	EReference getSystemUser_AuthorizedPrivilege();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SystemUser#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemUser#getRemarks()
	 * @see #getSystemUser()
	 * @generated
	 */
	EReference getSystemUser_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.SystemUser#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemUser#getUuid()
	 * @see #getSystemUser()
	 * @generated
	 */
	EAttribute getSystemUser_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.ConfidenceScore <em>Confidence Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Confidence Score</em>'.
	 * @see gov.nist.csrc.ns.oscal.ConfidenceScore
	 * @generated
	 */
	EClass getConfidenceScore();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ConfidenceScore#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see gov.nist.csrc.ns.oscal.ConfidenceScore#getCategory()
	 * @see #getConfidenceScore()
	 * @generated
	 */
	EAttribute getConfidenceScore_Category();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ConfidenceScore#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see gov.nist.csrc.ns.oscal.ConfidenceScore#getPercentage()
	 * @see #getConfidenceScore()
	 * @generated
	 */
	EAttribute getConfidenceScore_Percentage();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Coverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coverage</em>'.
	 * @see gov.nist.csrc.ns.oscal.Coverage
	 * @generated
	 */
	EClass getCoverage();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Coverage#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.csrc.ns.oscal.Coverage#getValue()
	 * @see #getCoverage()
	 * @generated
	 */
	EAttribute getCoverage_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Coverage#getGenerationMethod <em>Generation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generation Method</em>'.
	 * @see gov.nist.csrc.ns.oscal.Coverage#getGenerationMethod()
	 * @see #getCoverage()
	 * @generated
	 */
	EAttribute getCoverage_GenerationMethod();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.GapSummary <em>Gap Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gap Summary</em>'.
	 * @see gov.nist.csrc.ns.oscal.GapSummary
	 * @generated
	 */
	EClass getGapSummary();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.GapSummary#getUnmappedControls <em>Unmapped Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unmapped Controls</em>'.
	 * @see gov.nist.csrc.ns.oscal.GapSummary#getUnmappedControls()
	 * @see #getGapSummary()
	 * @generated
	 */
	EReference getGapSummary_UnmappedControls();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.GapSummary#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.GapSummary#getUuid()
	 * @see #getGapSummary()
	 * @generated
	 */
	EAttribute getGapSummary_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.MapEntry <em>Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Entry</em>'.
	 * @see gov.nist.csrc.ns.oscal.MapEntry
	 * @generated
	 */
	EClass getMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.MapEntry#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship</em>'.
	 * @see gov.nist.csrc.ns.oscal.MapEntry#getRelationship()
	 * @see #getMapEntry()
	 * @generated
	 */
	EAttribute getMapEntry_Relationship();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MapEntry#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see gov.nist.csrc.ns.oscal.MapEntry#getSource()
	 * @see #getMapEntry()
	 * @generated
	 */
	EReference getMapEntry_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MapEntry#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see gov.nist.csrc.ns.oscal.MapEntry#getTarget()
	 * @see #getMapEntry()
	 * @generated
	 */
	EReference getMapEntry_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MapEntry#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qualifier</em>'.
	 * @see gov.nist.csrc.ns.oscal.MapEntry#getQualifier()
	 * @see #getMapEntry()
	 * @generated
	 */
	EReference getMapEntry_Qualifier();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.MapEntry#getConfidenceScore <em>Confidence Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Confidence Score</em>'.
	 * @see gov.nist.csrc.ns.oscal.MapEntry#getConfidenceScore()
	 * @see #getMapEntry()
	 * @generated
	 */
	EReference getMapEntry_ConfidenceScore();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.MapEntry#getCoverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coverage</em>'.
	 * @see gov.nist.csrc.ns.oscal.MapEntry#getCoverage()
	 * @see #getMapEntry()
	 * @generated
	 */
	EReference getMapEntry_Coverage();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MapEntry#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.MapEntry#getProp()
	 * @see #getMapEntry()
	 * @generated
	 */
	EReference getMapEntry_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MapEntry#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.MapEntry#getLink()
	 * @see #getMapEntry()
	 * @generated
	 */
	EReference getMapEntry_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.MapEntry#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.MapEntry#getRemarks()
	 * @see #getMapEntry()
	 * @generated
	 */
	EReference getMapEntry_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.MapEntry#getMatchingRationale <em>Matching Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matching Rationale</em>'.
	 * @see gov.nist.csrc.ns.oscal.MapEntry#getMatchingRationale()
	 * @see #getMapEntry()
	 * @generated
	 */
	EAttribute getMapEntry_MatchingRationale();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.MapEntry#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see gov.nist.csrc.ns.oscal.MapEntry#getNs()
	 * @see #getMapEntry()
	 * @generated
	 */
	EAttribute getMapEntry_Ns();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.MapEntry#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.MapEntry#getUuid()
	 * @see #getMapEntry()
	 * @generated
	 */
	EAttribute getMapEntry_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see gov.nist.csrc.ns.oscal.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Mapping#getSourceResource <em>Source Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Resource</em>'.
	 * @see gov.nist.csrc.ns.oscal.Mapping#getSourceResource()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_SourceResource();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Mapping#getTargetResource <em>Target Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Resource</em>'.
	 * @see gov.nist.csrc.ns.oscal.Mapping#getTargetResource()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_TargetResource();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Mapping#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map</em>'.
	 * @see gov.nist.csrc.ns.oscal.Mapping#getMap()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Map();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Mapping#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Mapping#getProp()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Mapping#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Mapping#getLink()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Mapping#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.Mapping#getRemarks()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Remarks();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Mapping#getMappingDescription <em>Mapping Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.Mapping#getMappingDescription()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_MappingDescription();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Mapping#getSourceGapSummary <em>Source Gap Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Gap Summary</em>'.
	 * @see gov.nist.csrc.ns.oscal.Mapping#getSourceGapSummary()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_SourceGapSummary();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Mapping#getTargetGapSummary <em>Target Gap Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Gap Summary</em>'.
	 * @see gov.nist.csrc.ns.oscal.Mapping#getTargetGapSummary()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_TargetGapSummary();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Mapping#getConfidenceScore <em>Confidence Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Confidence Score</em>'.
	 * @see gov.nist.csrc.ns.oscal.Mapping#getConfidenceScore()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_ConfidenceScore();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Mapping#getCoverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coverage</em>'.
	 * @see gov.nist.csrc.ns.oscal.Mapping#getCoverage()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Coverage();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Mapping#getMatchingRationale <em>Matching Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matching Rationale</em>'.
	 * @see gov.nist.csrc.ns.oscal.Mapping#getMatchingRationale()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_MatchingRationale();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Mapping#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see gov.nist.csrc.ns.oscal.Mapping#getMethod()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_Method();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Mapping#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see gov.nist.csrc.ns.oscal.Mapping#getStatus()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_Status();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Mapping#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Mapping#getUuid()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.MappingItem <em>Mapping Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Item</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingItem
	 * @generated
	 */
	EClass getMappingItem();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MappingItem#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingItem#getProp()
	 * @see #getMappingItem()
	 * @generated
	 */
	EReference getMappingItem_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MappingItem#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingItem#getLink()
	 * @see #getMappingItem()
	 * @generated
	 */
	EReference getMappingItem_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.MappingItem#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingItem#getRemarks()
	 * @see #getMappingItem()
	 * @generated
	 */
	EReference getMappingItem_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.MappingItem#getIdRef <em>Id Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Ref</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingItem#getIdRef()
	 * @see #getMappingItem()
	 * @generated
	 */
	EAttribute getMappingItem_IdRef();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.MappingItem#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingItem#getType()
	 * @see #getMappingItem()
	 * @generated
	 */
	EAttribute getMappingItem_Type();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.MappingProvenance <em>Mapping Provenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Provenance</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingProvenance
	 * @generated
	 */
	EClass getMappingProvenance();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.MappingProvenance#getConfidenceScore <em>Confidence Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Confidence Score</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingProvenance#getConfidenceScore()
	 * @see #getMappingProvenance()
	 * @generated
	 */
	EReference getMappingProvenance_ConfidenceScore();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.MappingProvenance#getCoverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coverage</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingProvenance#getCoverage()
	 * @see #getMappingProvenance()
	 * @generated
	 */
	EReference getMappingProvenance_Coverage();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.MappingProvenance#getMappingDescription <em>Mapping Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingProvenance#getMappingDescription()
	 * @see #getMappingProvenance()
	 * @generated
	 */
	EReference getMappingProvenance_MappingDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MappingProvenance#getResponsibleParty <em>Responsible Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible Party</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingProvenance#getResponsibleParty()
	 * @see #getMappingProvenance()
	 * @generated
	 */
	EReference getMappingProvenance_ResponsibleParty();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MappingProvenance#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingProvenance#getProp()
	 * @see #getMappingProvenance()
	 * @generated
	 */
	EReference getMappingProvenance_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MappingProvenance#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingProvenance#getLink()
	 * @see #getMappingProvenance()
	 * @generated
	 */
	EReference getMappingProvenance_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.MappingProvenance#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingProvenance#getRemarks()
	 * @see #getMappingProvenance()
	 * @generated
	 */
	EReference getMappingProvenance_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.MappingProvenance#getMatchingRationale <em>Matching Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matching Rationale</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingProvenance#getMatchingRationale()
	 * @see #getMappingProvenance()
	 * @generated
	 */
	EAttribute getMappingProvenance_MatchingRationale();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.MappingProvenance#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingProvenance#getMethod()
	 * @see #getMappingProvenance()
	 * @generated
	 */
	EAttribute getMappingProvenance_Method();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.MappingProvenance#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingProvenance#getStatus()
	 * @see #getMappingProvenance()
	 * @generated
	 */
	EAttribute getMappingProvenance_Status();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.MappingResourceReference <em>Mapping Resource Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Resource Reference</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingResourceReference
	 * @generated
	 */
	EClass getMappingResourceReference();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MappingResourceReference#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingResourceReference#getProp()
	 * @see #getMappingResourceReference()
	 * @generated
	 */
	EReference getMappingResourceReference_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MappingResourceReference#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingResourceReference#getLink()
	 * @see #getMappingResourceReference()
	 * @generated
	 */
	EReference getMappingResourceReference_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.MappingResourceReference#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingResourceReference#getRemarks()
	 * @see #getMappingResourceReference()
	 * @generated
	 */
	EReference getMappingResourceReference_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.MappingResourceReference#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingResourceReference#getHref()
	 * @see #getMappingResourceReference()
	 * @generated
	 */
	EAttribute getMappingResourceReference_Href();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.MappingResourceReference#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingResourceReference#getNs()
	 * @see #getMappingResourceReference()
	 * @generated
	 */
	EAttribute getMappingResourceReference_Ns();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.MappingResourceReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingResourceReference#getType()
	 * @see #getMappingResourceReference()
	 * @generated
	 */
	EAttribute getMappingResourceReference_Type();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.QualifierItem <em>Qualifier Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualifier Item</em>'.
	 * @see gov.nist.csrc.ns.oscal.QualifierItem
	 * @generated
	 */
	EClass getQualifierItem();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.QualifierItem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.QualifierItem#getDescription()
	 * @see #getQualifierItem()
	 * @generated
	 */
	EReference getQualifierItem_Description();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.QualifierItem#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.QualifierItem#getRemarks()
	 * @see #getQualifierItem()
	 * @generated
	 */
	EReference getQualifierItem_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.QualifierItem#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see gov.nist.csrc.ns.oscal.QualifierItem#getCategory()
	 * @see #getQualifierItem()
	 * @generated
	 */
	EAttribute getQualifierItem_Category();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.QualifierItem#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predicate</em>'.
	 * @see gov.nist.csrc.ns.oscal.QualifierItem#getPredicate()
	 * @see #getQualifierItem()
	 * @generated
	 */
	EAttribute getQualifierItem_Predicate();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.QualifierItem#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see gov.nist.csrc.ns.oscal.QualifierItem#getSubject()
	 * @see #getQualifierItem()
	 * @generated
	 */
	EAttribute getQualifierItem_Subject();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.MappingCollection <em>Mapping Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Collection</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingCollection
	 * @generated
	 */
	EClass getMappingCollection();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.MappingCollection#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingCollection#getMetadata()
	 * @see #getMappingCollection()
	 * @generated
	 */
	EReference getMappingCollection_Metadata();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.MappingCollection#getProvenance <em>Provenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provenance</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingCollection#getProvenance()
	 * @see #getMappingCollection()
	 * @generated
	 */
	EReference getMappingCollection_Provenance();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MappingCollection#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapping</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingCollection#getMapping()
	 * @see #getMappingCollection()
	 * @generated
	 */
	EReference getMappingCollection_Mapping();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.MappingCollection#getBackMatter <em>Back Matter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Back Matter</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingCollection#getBackMatter()
	 * @see #getMappingCollection()
	 * @generated
	 */
	EReference getMappingCollection_BackMatter();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.MappingCollection#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.MappingCollection#getUuid()
	 * @see #getMappingCollection()
	 * @generated
	 */
	EAttribute getMappingCollection_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see gov.nist.csrc.ns.oscal.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Action#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Action#getProp()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Action#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Action#getLink()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Action#getResponsibleParty <em>Responsible Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible Party</em>'.
	 * @see gov.nist.csrc.ns.oscal.Action#getResponsibleParty()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ResponsibleParty();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Action#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.Action#getRemarks()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Action#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see gov.nist.csrc.ns.oscal.Action#getDate()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Date();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Action#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see gov.nist.csrc.ns.oscal.Action#getSystem()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_System();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Action#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.nist.csrc.ns.oscal.Action#getType()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Type();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Action#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Action#getUuid()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see gov.nist.csrc.ns.oscal.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.Address#getAddrLine <em>Addr Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Addr Line</em>'.
	 * @see gov.nist.csrc.ns.oscal.Address#getAddrLine()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_AddrLine();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see gov.nist.csrc.ns.oscal.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_City();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Address#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see gov.nist.csrc.ns.oscal.Address#getState()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_State();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Address#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see gov.nist.csrc.ns.oscal.Address#getPostalCode()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_PostalCode();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see gov.nist.csrc.ns.oscal.Address#getCountry()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Country();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Address#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.nist.csrc.ns.oscal.Address#getType()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Type();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.BackMatter <em>Back Matter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Back Matter</em>'.
	 * @see gov.nist.csrc.ns.oscal.BackMatter
	 * @generated
	 */
	EClass getBackMatter();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.BackMatter#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource</em>'.
	 * @see gov.nist.csrc.ns.oscal.BackMatter#getResource()
	 * @see #getBackMatter()
	 * @generated
	 */
	EReference getBackMatter_Resource();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.DocumentId <em>Document Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.DocumentId
	 * @generated
	 */
	EClass getDocumentId();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.DocumentId#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.csrc.ns.oscal.DocumentId#getValue()
	 * @see #getDocumentId()
	 * @generated
	 */
	EAttribute getDocumentId_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.DocumentId#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see gov.nist.csrc.ns.oscal.DocumentId#getScheme()
	 * @see #getDocumentId()
	 * @generated
	 */
	EAttribute getDocumentId_Scheme();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Hash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hash</em>'.
	 * @see gov.nist.csrc.ns.oscal.Hash
	 * @generated
	 */
	EClass getHash();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Hash#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.csrc.ns.oscal.Hash#getValue()
	 * @see #getHash()
	 * @generated
	 */
	EAttribute getHash_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Hash#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see gov.nist.csrc.ns.oscal.Hash#getAlgorithm()
	 * @see #getHash()
	 * @generated
	 */
	EAttribute getHash_Algorithm();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Link#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see gov.nist.csrc.ns.oscal.Link#getText()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Text();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Link#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see gov.nist.csrc.ns.oscal.Link#getHref()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Href();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Link#getMediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media Type</em>'.
	 * @see gov.nist.csrc.ns.oscal.Link#getMediaType()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_MediaType();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Link#getRel <em>Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel</em>'.
	 * @see gov.nist.csrc.ns.oscal.Link#getRel()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Rel();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Link#getResourceFragment <em>Resource Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Fragment</em>'.
	 * @see gov.nist.csrc.ns.oscal.Link#getResourceFragment()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_ResourceFragment();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata</em>'.
	 * @see gov.nist.csrc.ns.oscal.Metadata
	 * @generated
	 */
	EClass getMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Metadata#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.Metadata#getTitle()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Title();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Metadata#getPublished <em>Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Published</em>'.
	 * @see gov.nist.csrc.ns.oscal.Metadata#getPublished()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Published();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Metadata#getLastModified <em>Last Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified</em>'.
	 * @see gov.nist.csrc.ns.oscal.Metadata#getLastModified()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_LastModified();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Metadata#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see gov.nist.csrc.ns.oscal.Metadata#getVersion()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Version();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Metadata#getOscalVersion <em>Oscal Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oscal Version</em>'.
	 * @see gov.nist.csrc.ns.oscal.Metadata#getOscalVersion()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_OscalVersion();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Metadata#getRevisions <em>Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Revisions</em>'.
	 * @see gov.nist.csrc.ns.oscal.Metadata#getRevisions()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Revisions();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Metadata#getDocumentId <em>Document Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Document Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.Metadata#getDocumentId()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_DocumentId();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Metadata#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Metadata#getProp()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Metadata#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Metadata#getLink()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Metadata#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see gov.nist.csrc.ns.oscal.Metadata#getRole()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Role();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Metadata#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location</em>'.
	 * @see gov.nist.csrc.ns.oscal.Metadata#getLocation()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Metadata#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Party</em>'.
	 * @see gov.nist.csrc.ns.oscal.Metadata#getParty()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Party();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Metadata#getResponsibleParty <em>Responsible Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible Party</em>'.
	 * @see gov.nist.csrc.ns.oscal.Metadata#getResponsibleParty()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_ResponsibleParty();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Metadata#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see gov.nist.csrc.ns.oscal.Metadata#getAction()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Action();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Metadata#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.Metadata#getRemarks()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Remarks();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see gov.nist.csrc.ns.oscal.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Property#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.Property#getRemarks()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Property#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see gov.nist.csrc.ns.oscal.Property#getClass_()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Class();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Property#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see gov.nist.csrc.ns.oscal.Property#getGroup()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Group();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gov.nist.csrc.ns.oscal.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Property#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see gov.nist.csrc.ns.oscal.Property#getNs()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Ns();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Property#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Property#getUuid()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Uuid();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.csrc.ns.oscal.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.ResponsibleParty <em>Responsible Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsible Party</em>'.
	 * @see gov.nist.csrc.ns.oscal.ResponsibleParty
	 * @generated
	 */
	EClass getResponsibleParty();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.ResponsibleParty#getPartyUuid <em>Party Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Party Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.ResponsibleParty#getPartyUuid()
	 * @see #getResponsibleParty()
	 * @generated
	 */
	EAttribute getResponsibleParty_PartyUuid();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ResponsibleParty#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.ResponsibleParty#getProp()
	 * @see #getResponsibleParty()
	 * @generated
	 */
	EReference getResponsibleParty_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ResponsibleParty#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.ResponsibleParty#getLink()
	 * @see #getResponsibleParty()
	 * @generated
	 */
	EReference getResponsibleParty_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ResponsibleParty#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.ResponsibleParty#getRemarks()
	 * @see #getResponsibleParty()
	 * @generated
	 */
	EReference getResponsibleParty_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ResponsibleParty#getRoleId <em>Role Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.ResponsibleParty#getRoleId()
	 * @see #getResponsibleParty()
	 * @generated
	 */
	EAttribute getResponsibleParty_RoleId();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.ResponsibleRole <em>Responsible Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsible Role</em>'.
	 * @see gov.nist.csrc.ns.oscal.ResponsibleRole
	 * @generated
	 */
	EClass getResponsibleRole();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ResponsibleRole#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.ResponsibleRole#getProp()
	 * @see #getResponsibleRole()
	 * @generated
	 */
	EReference getResponsibleRole_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ResponsibleRole#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.ResponsibleRole#getLink()
	 * @see #getResponsibleRole()
	 * @generated
	 */
	EReference getResponsibleRole_Link();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.ResponsibleRole#getPartyUuid <em>Party Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Party Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.ResponsibleRole#getPartyUuid()
	 * @see #getResponsibleRole()
	 * @generated
	 */
	EAttribute getResponsibleRole_PartyUuid();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ResponsibleRole#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.ResponsibleRole#getRemarks()
	 * @see #getResponsibleRole()
	 * @generated
	 */
	EReference getResponsibleRole_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ResponsibleRole#getRoleId <em>Role Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.ResponsibleRole#getRoleId()
	 * @see #getResponsibleRole()
	 * @generated
	 */
	EAttribute getResponsibleRole_RoleId();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.TelephoneNumber <em>Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Telephone Number</em>'.
	 * @see gov.nist.csrc.ns.oscal.TelephoneNumber
	 * @generated
	 */
	EClass getTelephoneNumber();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.TelephoneNumber#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.nist.csrc.ns.oscal.TelephoneNumber#getValue()
	 * @see #getTelephoneNumber()
	 * @generated
	 */
	EAttribute getTelephoneNumber_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.TelephoneNumber#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.nist.csrc.ns.oscal.TelephoneNumber#getType()
	 * @see #getTelephoneNumber()
	 * @generated
	 */
	EAttribute getTelephoneNumber_Type();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.PoamLocalDefinitions <em>Poam Local Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poam Local Definitions</em>'.
	 * @see gov.nist.csrc.ns.oscal.PoamLocalDefinitions
	 * @generated
	 */
	EClass getPoamLocalDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.PoamLocalDefinitions#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see gov.nist.csrc.ns.oscal.PoamLocalDefinitions#getComponent()
	 * @see #getPoamLocalDefinitions()
	 * @generated
	 */
	EReference getPoamLocalDefinitions_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.PoamLocalDefinitions#getInventoryItem <em>Inventory Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inventory Item</em>'.
	 * @see gov.nist.csrc.ns.oscal.PoamLocalDefinitions#getInventoryItem()
	 * @see #getPoamLocalDefinitions()
	 * @generated
	 */
	EReference getPoamLocalDefinitions_InventoryItem();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.PoamLocalDefinitions#getAssessmentAssets <em>Assessment Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assessment Assets</em>'.
	 * @see gov.nist.csrc.ns.oscal.PoamLocalDefinitions#getAssessmentAssets()
	 * @see #getPoamLocalDefinitions()
	 * @generated
	 */
	EReference getPoamLocalDefinitions_AssessmentAssets();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.PoamLocalDefinitions#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.PoamLocalDefinitions#getRemarks()
	 * @see #getPoamLocalDefinitions()
	 * @generated
	 */
	EReference getPoamLocalDefinitions_Remarks();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones <em>Plan Of Action And Milestones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Of Action And Milestones</em>'.
	 * @see gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones
	 * @generated
	 */
	EClass getPlanOfActionAndMilestones();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getMetadata()
	 * @see #getPlanOfActionAndMilestones()
	 * @generated
	 */
	EReference getPlanOfActionAndMilestones_Metadata();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getImportSsp <em>Import Ssp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Import Ssp</em>'.
	 * @see gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getImportSsp()
	 * @see #getPlanOfActionAndMilestones()
	 * @generated
	 */
	EReference getPlanOfActionAndMilestones_ImportSsp();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getSystemId <em>System Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getSystemId()
	 * @see #getPlanOfActionAndMilestones()
	 * @generated
	 */
	EReference getPlanOfActionAndMilestones_SystemId();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getLocalDefinitions <em>Local Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Definitions</em>'.
	 * @see gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getLocalDefinitions()
	 * @see #getPlanOfActionAndMilestones()
	 * @generated
	 */
	EReference getPlanOfActionAndMilestones_LocalDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getObservation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Observation</em>'.
	 * @see gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getObservation()
	 * @see #getPlanOfActionAndMilestones()
	 * @generated
	 */
	EReference getPlanOfActionAndMilestones_Observation();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getRisk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Risk</em>'.
	 * @see gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getRisk()
	 * @see #getPlanOfActionAndMilestones()
	 * @generated
	 */
	EReference getPlanOfActionAndMilestones_Risk();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getFinding <em>Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Finding</em>'.
	 * @see gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getFinding()
	 * @see #getPlanOfActionAndMilestones()
	 * @generated
	 */
	EReference getPlanOfActionAndMilestones_Finding();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getPoamItem <em>Poam Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Poam Item</em>'.
	 * @see gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getPoamItem()
	 * @see #getPlanOfActionAndMilestones()
	 * @generated
	 */
	EReference getPlanOfActionAndMilestones_PoamItem();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getBackMatter <em>Back Matter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Back Matter</em>'.
	 * @see gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getBackMatter()
	 * @see #getPlanOfActionAndMilestones()
	 * @generated
	 */
	EReference getPlanOfActionAndMilestones_BackMatter();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones#getUuid()
	 * @see #getPlanOfActionAndMilestones()
	 * @generated
	 */
	EAttribute getPlanOfActionAndMilestones_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.PoamItem <em>Poam Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poam Item</em>'.
	 * @see gov.nist.csrc.ns.oscal.PoamItem
	 * @generated
	 */
	EClass getPoamItem();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.PoamItem#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.PoamItem#getTitle()
	 * @see #getPoamItem()
	 * @generated
	 */
	EReference getPoamItem_Title();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.PoamItem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.PoamItem#getDescription()
	 * @see #getPoamItem()
	 * @generated
	 */
	EReference getPoamItem_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.PoamItem#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.PoamItem#getProp()
	 * @see #getPoamItem()
	 * @generated
	 */
	EReference getPoamItem_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.PoamItem#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.PoamItem#getLink()
	 * @see #getPoamItem()
	 * @generated
	 */
	EReference getPoamItem_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.PoamItem#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Origin</em>'.
	 * @see gov.nist.csrc.ns.oscal.PoamItem#getOrigin()
	 * @see #getPoamItem()
	 * @generated
	 */
	EReference getPoamItem_Origin();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.PoamItem#getRelatedFinding <em>Related Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Related Finding</em>'.
	 * @see gov.nist.csrc.ns.oscal.PoamItem#getRelatedFinding()
	 * @see #getPoamItem()
	 * @generated
	 */
	EReference getPoamItem_RelatedFinding();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.PoamItem#getRelatedObservation <em>Related Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Related Observation</em>'.
	 * @see gov.nist.csrc.ns.oscal.PoamItem#getRelatedObservation()
	 * @see #getPoamItem()
	 * @generated
	 */
	EReference getPoamItem_RelatedObservation();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.PoamItem#getAssociatedRisk <em>Associated Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Associated Risk</em>'.
	 * @see gov.nist.csrc.ns.oscal.PoamItem#getAssociatedRisk()
	 * @see #getPoamItem()
	 * @generated
	 */
	EReference getPoamItem_AssociatedRisk();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.PoamItem#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.PoamItem#getRemarks()
	 * @see #getPoamItem()
	 * @generated
	 */
	EReference getPoamItem_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.PoamItem#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.PoamItem#getUuid()
	 * @see #getPoamItem()
	 * @generated
	 */
	EAttribute getPoamItem_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.ProfileGroup <em>Profile Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile Group</em>'.
	 * @see gov.nist.csrc.ns.oscal.ProfileGroup
	 * @generated
	 */
	EClass getProfileGroup();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ProfileGroup#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.ProfileGroup#getTitle()
	 * @see #getProfileGroup()
	 * @generated
	 */
	EReference getProfileGroup_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ProfileGroup#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see gov.nist.csrc.ns.oscal.ProfileGroup#getParam()
	 * @see #getProfileGroup()
	 * @generated
	 */
	EReference getProfileGroup_Param();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ProfileGroup#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.ProfileGroup#getProp()
	 * @see #getProfileGroup()
	 * @generated
	 */
	EReference getProfileGroup_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ProfileGroup#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.ProfileGroup#getLink()
	 * @see #getProfileGroup()
	 * @generated
	 */
	EReference getProfileGroup_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ProfileGroup#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see gov.nist.csrc.ns.oscal.ProfileGroup#getPart()
	 * @see #getProfileGroup()
	 * @generated
	 */
	EReference getProfileGroup_Part();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ProfileGroup#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see gov.nist.csrc.ns.oscal.ProfileGroup#getGroup()
	 * @see #getProfileGroup()
	 * @generated
	 */
	EReference getProfileGroup_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ProfileGroup#getInsertControls <em>Insert Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Insert Controls</em>'.
	 * @see gov.nist.csrc.ns.oscal.ProfileGroup#getInsertControls()
	 * @see #getProfileGroup()
	 * @generated
	 */
	EReference getProfileGroup_InsertControls();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ProfileGroup#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see gov.nist.csrc.ns.oscal.ProfileGroup#getClass_()
	 * @see #getProfileGroup()
	 * @generated
	 */
	EAttribute getProfileGroup_Class();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ProfileGroup#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.ProfileGroup#getId()
	 * @see #getProfileGroup()
	 * @generated
	 */
	EAttribute getProfileGroup_Id();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see gov.nist.csrc.ns.oscal.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Import#getIncludeAll <em>Include All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Include All</em>'.
	 * @see gov.nist.csrc.ns.oscal.Import#getIncludeAll()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_IncludeAll();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Import#getIncludeControls <em>Include Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include Controls</em>'.
	 * @see gov.nist.csrc.ns.oscal.Import#getIncludeControls()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_IncludeControls();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Import#getExcludeControls <em>Exclude Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exclude Controls</em>'.
	 * @see gov.nist.csrc.ns.oscal.Import#getExcludeControls()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_ExcludeControls();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Import#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see gov.nist.csrc.ns.oscal.Import#getHref()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Href();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.InsertControls <em>Insert Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert Controls</em>'.
	 * @see gov.nist.csrc.ns.oscal.InsertControls
	 * @generated
	 */
	EClass getInsertControls();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.InsertControls#getIncludeAll <em>Include All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Include All</em>'.
	 * @see gov.nist.csrc.ns.oscal.InsertControls#getIncludeAll()
	 * @see #getInsertControls()
	 * @generated
	 */
	EReference getInsertControls_IncludeAll();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.InsertControls#getIncludeControls <em>Include Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include Controls</em>'.
	 * @see gov.nist.csrc.ns.oscal.InsertControls#getIncludeControls()
	 * @see #getInsertControls()
	 * @generated
	 */
	EReference getInsertControls_IncludeControls();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.InsertControls#getExcludeControls <em>Exclude Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exclude Controls</em>'.
	 * @see gov.nist.csrc.ns.oscal.InsertControls#getExcludeControls()
	 * @see #getInsertControls()
	 * @generated
	 */
	EReference getInsertControls_ExcludeControls();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.InsertControls#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see gov.nist.csrc.ns.oscal.InsertControls#getOrder()
	 * @see #getInsertControls()
	 * @generated
	 */
	EAttribute getInsertControls_Order();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Merge <em>Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge</em>'.
	 * @see gov.nist.csrc.ns.oscal.Merge
	 * @generated
	 */
	EClass getMerge();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Merge#getCombine <em>Combine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Combine</em>'.
	 * @see gov.nist.csrc.ns.oscal.Merge#getCombine()
	 * @see #getMerge()
	 * @generated
	 */
	EReference getMerge_Combine();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Merge#getFlat <em>Flat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flat</em>'.
	 * @see gov.nist.csrc.ns.oscal.Merge#getFlat()
	 * @see #getMerge()
	 * @generated
	 */
	EReference getMerge_Flat();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Merge#isAsIs <em>As Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>As Is</em>'.
	 * @see gov.nist.csrc.ns.oscal.Merge#isAsIs()
	 * @see #getMerge()
	 * @generated
	 */
	EAttribute getMerge_AsIs();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Merge#getCustom <em>Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom</em>'.
	 * @see gov.nist.csrc.ns.oscal.Merge#getCustom()
	 * @see #getMerge()
	 * @generated
	 */
	EReference getMerge_Custom();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Modify <em>Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify</em>'.
	 * @see gov.nist.csrc.ns.oscal.Modify
	 * @generated
	 */
	EClass getModify();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Modify#getSetParameter <em>Set Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Parameter</em>'.
	 * @see gov.nist.csrc.ns.oscal.Modify#getSetParameter()
	 * @see #getModify()
	 * @generated
	 */
	EReference getModify_SetParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Modify#getAlter <em>Alter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alter</em>'.
	 * @see gov.nist.csrc.ns.oscal.Modify#getAlter()
	 * @see #getModify()
	 * @generated
	 */
	EReference getModify_Alter();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile</em>'.
	 * @see gov.nist.csrc.ns.oscal.Profile
	 * @generated
	 */
	EClass getProfile();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Profile#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see gov.nist.csrc.ns.oscal.Profile#getMetadata()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Metadata();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Profile#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see gov.nist.csrc.ns.oscal.Profile#getImport()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Import();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Profile#getMerge <em>Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Merge</em>'.
	 * @see gov.nist.csrc.ns.oscal.Profile#getMerge()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Merge();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Profile#getModify <em>Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modify</em>'.
	 * @see gov.nist.csrc.ns.oscal.Profile#getModify()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Modify();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Profile#getBackMatter <em>Back Matter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Back Matter</em>'.
	 * @see gov.nist.csrc.ns.oscal.Profile#getBackMatter()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_BackMatter();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Profile#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Profile#getUuid()
	 * @see #getProfile()
	 * @generated
	 */
	EAttribute getProfile_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.AuthorizationBoundary <em>Authorization Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization Boundary</em>'.
	 * @see gov.nist.csrc.ns.oscal.AuthorizationBoundary
	 * @generated
	 */
	EClass getAuthorizationBoundary();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AuthorizationBoundary#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.AuthorizationBoundary#getDescription()
	 * @see #getAuthorizationBoundary()
	 * @generated
	 */
	EReference getAuthorizationBoundary_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AuthorizationBoundary#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.AuthorizationBoundary#getProp()
	 * @see #getAuthorizationBoundary()
	 * @generated
	 */
	EReference getAuthorizationBoundary_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AuthorizationBoundary#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.AuthorizationBoundary#getLink()
	 * @see #getAuthorizationBoundary()
	 * @generated
	 */
	EReference getAuthorizationBoundary_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.AuthorizationBoundary#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagram</em>'.
	 * @see gov.nist.csrc.ns.oscal.AuthorizationBoundary#getDiagram()
	 * @see #getAuthorizationBoundary()
	 * @generated
	 */
	EReference getAuthorizationBoundary_Diagram();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.AuthorizationBoundary#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.AuthorizationBoundary#getRemarks()
	 * @see #getAuthorizationBoundary()
	 * @generated
	 */
	EReference getAuthorizationBoundary_Remarks();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.ByComponent <em>By Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>By Component</em>'.
	 * @see gov.nist.csrc.ns.oscal.ByComponent
	 * @generated
	 */
	EClass getByComponent();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ByComponent#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.ByComponent#getDescription()
	 * @see #getByComponent()
	 * @generated
	 */
	EReference getByComponent_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ByComponent#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.ByComponent#getProp()
	 * @see #getByComponent()
	 * @generated
	 */
	EReference getByComponent_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ByComponent#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.ByComponent#getLink()
	 * @see #getByComponent()
	 * @generated
	 */
	EReference getByComponent_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ByComponent#getSetParameter <em>Set Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Parameter</em>'.
	 * @see gov.nist.csrc.ns.oscal.ByComponent#getSetParameter()
	 * @see #getByComponent()
	 * @generated
	 */
	EReference getByComponent_SetParameter();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ByComponent#getImplementationStatus <em>Implementation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation Status</em>'.
	 * @see gov.nist.csrc.ns.oscal.ByComponent#getImplementationStatus()
	 * @see #getByComponent()
	 * @generated
	 */
	EReference getByComponent_ImplementationStatus();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ByComponent#getExport <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Export</em>'.
	 * @see gov.nist.csrc.ns.oscal.ByComponent#getExport()
	 * @see #getByComponent()
	 * @generated
	 */
	EReference getByComponent_Export();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ByComponent#getInherited <em>Inherited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inherited</em>'.
	 * @see gov.nist.csrc.ns.oscal.ByComponent#getInherited()
	 * @see #getByComponent()
	 * @generated
	 */
	EReference getByComponent_Inherited();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ByComponent#getSatisfied <em>Satisfied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Satisfied</em>'.
	 * @see gov.nist.csrc.ns.oscal.ByComponent#getSatisfied()
	 * @see #getByComponent()
	 * @generated
	 */
	EReference getByComponent_Satisfied();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ByComponent#getResponsibleRole <em>Responsible Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible Role</em>'.
	 * @see gov.nist.csrc.ns.oscal.ByComponent#getResponsibleRole()
	 * @see #getByComponent()
	 * @generated
	 */
	EReference getByComponent_ResponsibleRole();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ByComponent#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.ByComponent#getRemarks()
	 * @see #getByComponent()
	 * @generated
	 */
	EReference getByComponent_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ByComponent#getComponentUuid <em>Component Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.ByComponent#getComponentUuid()
	 * @see #getByComponent()
	 * @generated
	 */
	EAttribute getByComponent_ComponentUuid();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ByComponent#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.ByComponent#getUuid()
	 * @see #getByComponent()
	 * @generated
	 */
	EAttribute getByComponent_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.SspControlImplementation <em>Ssp Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssp Control Implementation</em>'.
	 * @see gov.nist.csrc.ns.oscal.SspControlImplementation
	 * @generated
	 */
	EClass getSspControlImplementation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SspControlImplementation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.SspControlImplementation#getDescription()
	 * @see #getSspControlImplementation()
	 * @generated
	 */
	EReference getSspControlImplementation_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SspControlImplementation#getSetParameter <em>Set Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Parameter</em>'.
	 * @see gov.nist.csrc.ns.oscal.SspControlImplementation#getSetParameter()
	 * @see #getSspControlImplementation()
	 * @generated
	 */
	EReference getSspControlImplementation_SetParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SspControlImplementation#getImplementedRequirement <em>Implemented Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implemented Requirement</em>'.
	 * @see gov.nist.csrc.ns.oscal.SspControlImplementation#getImplementedRequirement()
	 * @see #getSspControlImplementation()
	 * @generated
	 */
	EReference getSspControlImplementation_ImplementedRequirement();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow</em>'.
	 * @see gov.nist.csrc.ns.oscal.DataFlow
	 * @generated
	 */
	EClass getDataFlow();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.DataFlow#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.DataFlow#getDescription()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.DataFlow#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.DataFlow#getProp()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.DataFlow#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.DataFlow#getLink()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.DataFlow#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagram</em>'.
	 * @see gov.nist.csrc.ns.oscal.DataFlow#getDiagram()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Diagram();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.DataFlow#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.DataFlow#getRemarks()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Remarks();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see gov.nist.csrc.ns.oscal.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Diagram#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.Diagram#getDescription()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Diagram#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Diagram#getProp()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Diagram#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Diagram#getLink()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Diagram#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Caption</em>'.
	 * @see gov.nist.csrc.ns.oscal.Diagram#getCaption()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Caption();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Diagram#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.Diagram#getRemarks()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Diagram#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Diagram#getUuid()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Impact <em>Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Impact</em>'.
	 * @see gov.nist.csrc.ns.oscal.Impact
	 * @generated
	 */
	EClass getImpact();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Impact#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Impact#getProp()
	 * @see #getImpact()
	 * @generated
	 */
	EReference getImpact_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Impact#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Impact#getLink()
	 * @see #getImpact()
	 * @generated
	 */
	EReference getImpact_Link();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Impact#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base</em>'.
	 * @see gov.nist.csrc.ns.oscal.Impact#getBase()
	 * @see #getImpact()
	 * @generated
	 */
	EAttribute getImpact_Base();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Impact#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see gov.nist.csrc.ns.oscal.Impact#getSelected()
	 * @see #getImpact()
	 * @generated
	 */
	EAttribute getImpact_Selected();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Impact#getAdjustmentJustification <em>Adjustment Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adjustment Justification</em>'.
	 * @see gov.nist.csrc.ns.oscal.Impact#getAdjustmentJustification()
	 * @see #getImpact()
	 * @generated
	 */
	EReference getImpact_AdjustmentJustification();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.SspImplementedRequirement <em>Ssp Implemented Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssp Implemented Requirement</em>'.
	 * @see gov.nist.csrc.ns.oscal.SspImplementedRequirement
	 * @generated
	 */
	EClass getSspImplementedRequirement();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SspImplementedRequirement#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.SspImplementedRequirement#getProp()
	 * @see #getSspImplementedRequirement()
	 * @generated
	 */
	EReference getSspImplementedRequirement_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SspImplementedRequirement#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.SspImplementedRequirement#getLink()
	 * @see #getSspImplementedRequirement()
	 * @generated
	 */
	EReference getSspImplementedRequirement_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SspImplementedRequirement#getSetParameter <em>Set Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Parameter</em>'.
	 * @see gov.nist.csrc.ns.oscal.SspImplementedRequirement#getSetParameter()
	 * @see #getSspImplementedRequirement()
	 * @generated
	 */
	EReference getSspImplementedRequirement_SetParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SspImplementedRequirement#getResponsibleRole <em>Responsible Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible Role</em>'.
	 * @see gov.nist.csrc.ns.oscal.SspImplementedRequirement#getResponsibleRole()
	 * @see #getSspImplementedRequirement()
	 * @generated
	 */
	EReference getSspImplementedRequirement_ResponsibleRole();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SspImplementedRequirement#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see gov.nist.csrc.ns.oscal.SspImplementedRequirement#getStatement()
	 * @see #getSspImplementedRequirement()
	 * @generated
	 */
	EReference getSspImplementedRequirement_Statement();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SspImplementedRequirement#getByComponent <em>By Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>By Component</em>'.
	 * @see gov.nist.csrc.ns.oscal.SspImplementedRequirement#getByComponent()
	 * @see #getSspImplementedRequirement()
	 * @generated
	 */
	EReference getSspImplementedRequirement_ByComponent();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SspImplementedRequirement#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.SspImplementedRequirement#getRemarks()
	 * @see #getSspImplementedRequirement()
	 * @generated
	 */
	EReference getSspImplementedRequirement_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.SspImplementedRequirement#getControlId <em>Control Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.SspImplementedRequirement#getControlId()
	 * @see #getSspImplementedRequirement()
	 * @generated
	 */
	EAttribute getSspImplementedRequirement_ControlId();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.SspImplementedRequirement#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.SspImplementedRequirement#getUuid()
	 * @see #getSspImplementedRequirement()
	 * @generated
	 */
	EAttribute getSspImplementedRequirement_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.ImportProfile <em>Import Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Profile</em>'.
	 * @see gov.nist.csrc.ns.oscal.ImportProfile
	 * @generated
	 */
	EClass getImportProfile();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ImportProfile#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.ImportProfile#getRemarks()
	 * @see #getImportProfile()
	 * @generated
	 */
	EReference getImportProfile_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ImportProfile#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see gov.nist.csrc.ns.oscal.ImportProfile#getHref()
	 * @see #getImportProfile()
	 * @generated
	 */
	EAttribute getImportProfile_Href();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.NetworkArchitecture <em>Network Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Architecture</em>'.
	 * @see gov.nist.csrc.ns.oscal.NetworkArchitecture
	 * @generated
	 */
	EClass getNetworkArchitecture();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.NetworkArchitecture#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.NetworkArchitecture#getDescription()
	 * @see #getNetworkArchitecture()
	 * @generated
	 */
	EReference getNetworkArchitecture_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.NetworkArchitecture#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.NetworkArchitecture#getProp()
	 * @see #getNetworkArchitecture()
	 * @generated
	 */
	EReference getNetworkArchitecture_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.NetworkArchitecture#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.NetworkArchitecture#getLink()
	 * @see #getNetworkArchitecture()
	 * @generated
	 */
	EReference getNetworkArchitecture_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.NetworkArchitecture#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagram</em>'.
	 * @see gov.nist.csrc.ns.oscal.NetworkArchitecture#getDiagram()
	 * @see #getNetworkArchitecture()
	 * @generated
	 */
	EReference getNetworkArchitecture_Diagram();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.NetworkArchitecture#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.NetworkArchitecture#getRemarks()
	 * @see #getNetworkArchitecture()
	 * @generated
	 */
	EReference getNetworkArchitecture_Remarks();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.SecurityImpactLevel <em>Security Impact Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Impact Level</em>'.
	 * @see gov.nist.csrc.ns.oscal.SecurityImpactLevel
	 * @generated
	 */
	EClass getSecurityImpactLevel();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.SecurityImpactLevel#getSecurityObjectiveConfidentiality <em>Security Objective Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Objective Confidentiality</em>'.
	 * @see gov.nist.csrc.ns.oscal.SecurityImpactLevel#getSecurityObjectiveConfidentiality()
	 * @see #getSecurityImpactLevel()
	 * @generated
	 */
	EAttribute getSecurityImpactLevel_SecurityObjectiveConfidentiality();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.SecurityImpactLevel#getSecurityObjectiveIntegrity <em>Security Objective Integrity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Objective Integrity</em>'.
	 * @see gov.nist.csrc.ns.oscal.SecurityImpactLevel#getSecurityObjectiveIntegrity()
	 * @see #getSecurityImpactLevel()
	 * @generated
	 */
	EAttribute getSecurityImpactLevel_SecurityObjectiveIntegrity();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.SecurityImpactLevel#getSecurityObjectiveAvailability <em>Security Objective Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Objective Availability</em>'.
	 * @see gov.nist.csrc.ns.oscal.SecurityImpactLevel#getSecurityObjectiveAvailability()
	 * @see #getSecurityImpactLevel()
	 * @generated
	 */
	EAttribute getSecurityImpactLevel_SecurityObjectiveAvailability();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.SspStatement <em>Ssp Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssp Statement</em>'.
	 * @see gov.nist.csrc.ns.oscal.SspStatement
	 * @generated
	 */
	EClass getSspStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SspStatement#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.SspStatement#getProp()
	 * @see #getSspStatement()
	 * @generated
	 */
	EReference getSspStatement_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SspStatement#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.SspStatement#getLink()
	 * @see #getSspStatement()
	 * @generated
	 */
	EReference getSspStatement_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SspStatement#getResponsibleRole <em>Responsible Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible Role</em>'.
	 * @see gov.nist.csrc.ns.oscal.SspStatement#getResponsibleRole()
	 * @see #getSspStatement()
	 * @generated
	 */
	EReference getSspStatement_ResponsibleRole();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SspStatement#getByComponent <em>By Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>By Component</em>'.
	 * @see gov.nist.csrc.ns.oscal.SspStatement#getByComponent()
	 * @see #getSspStatement()
	 * @generated
	 */
	EReference getSspStatement_ByComponent();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SspStatement#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.SspStatement#getRemarks()
	 * @see #getSspStatement()
	 * @generated
	 */
	EReference getSspStatement_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.SspStatement#getStatementId <em>Statement Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.SspStatement#getStatementId()
	 * @see #getSspStatement()
	 * @generated
	 */
	EAttribute getSspStatement_StatementId();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.SspStatement#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.SspStatement#getUuid()
	 * @see #getSspStatement()
	 * @generated
	 */
	EAttribute getSspStatement_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.SystemStatus <em>System Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Status</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemStatus
	 * @generated
	 */
	EClass getSystemStatus();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SystemStatus#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemStatus#getRemarks()
	 * @see #getSystemStatus()
	 * @generated
	 */
	EReference getSystemStatus_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.SystemStatus#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemStatus#getState()
	 * @see #getSystemStatus()
	 * @generated
	 */
	EAttribute getSystemStatus_State();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics <em>System Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Characteristics</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemCharacteristics
	 * @generated
	 */
	EClass getSystemCharacteristics();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getSystemId <em>System Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemCharacteristics#getSystemId()
	 * @see #getSystemCharacteristics()
	 * @generated
	 */
	EReference getSystemCharacteristics_SystemId();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getSystemName <em>System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Name</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemCharacteristics#getSystemName()
	 * @see #getSystemCharacteristics()
	 * @generated
	 */
	EAttribute getSystemCharacteristics_SystemName();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getSystemNameShort <em>System Name Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Name Short</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemCharacteristics#getSystemNameShort()
	 * @see #getSystemCharacteristics()
	 * @generated
	 */
	EAttribute getSystemCharacteristics_SystemNameShort();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemCharacteristics#getDescription()
	 * @see #getSystemCharacteristics()
	 * @generated
	 */
	EReference getSystemCharacteristics_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemCharacteristics#getProp()
	 * @see #getSystemCharacteristics()
	 * @generated
	 */
	EReference getSystemCharacteristics_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemCharacteristics#getLink()
	 * @see #getSystemCharacteristics()
	 * @generated
	 */
	EReference getSystemCharacteristics_Link();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getDateAuthorized <em>Date Authorized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Authorized</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemCharacteristics#getDateAuthorized()
	 * @see #getSystemCharacteristics()
	 * @generated
	 */
	EAttribute getSystemCharacteristics_DateAuthorized();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getSecuritySensitivityLevel <em>Security Sensitivity Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Sensitivity Level</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemCharacteristics#getSecuritySensitivityLevel()
	 * @see #getSystemCharacteristics()
	 * @generated
	 */
	EAttribute getSystemCharacteristics_SecuritySensitivityLevel();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getSystemInformation <em>System Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System Information</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemCharacteristics#getSystemInformation()
	 * @see #getSystemCharacteristics()
	 * @generated
	 */
	EReference getSystemCharacteristics_SystemInformation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getSecurityImpactLevel <em>Security Impact Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Impact Level</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemCharacteristics#getSecurityImpactLevel()
	 * @see #getSystemCharacteristics()
	 * @generated
	 */
	EReference getSystemCharacteristics_SecurityImpactLevel();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemCharacteristics#getStatus()
	 * @see #getSystemCharacteristics()
	 * @generated
	 */
	EReference getSystemCharacteristics_Status();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getAuthorizationBoundary <em>Authorization Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authorization Boundary</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemCharacteristics#getAuthorizationBoundary()
	 * @see #getSystemCharacteristics()
	 * @generated
	 */
	EReference getSystemCharacteristics_AuthorizationBoundary();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getNetworkArchitecture <em>Network Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network Architecture</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemCharacteristics#getNetworkArchitecture()
	 * @see #getSystemCharacteristics()
	 * @generated
	 */
	EReference getSystemCharacteristics_NetworkArchitecture();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getDataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Flow</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemCharacteristics#getDataFlow()
	 * @see #getSystemCharacteristics()
	 * @generated
	 */
	EReference getSystemCharacteristics_DataFlow();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getResponsibleParty <em>Responsible Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible Party</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemCharacteristics#getResponsibleParty()
	 * @see #getSystemCharacteristics()
	 * @generated
	 */
	EReference getSystemCharacteristics_ResponsibleParty();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SystemCharacteristics#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemCharacteristics#getRemarks()
	 * @see #getSystemCharacteristics()
	 * @generated
	 */
	EReference getSystemCharacteristics_Remarks();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.SystemImplementation <em>System Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Implementation</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemImplementation
	 * @generated
	 */
	EClass getSystemImplementation();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SystemImplementation#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemImplementation#getProp()
	 * @see #getSystemImplementation()
	 * @generated
	 */
	EReference getSystemImplementation_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SystemImplementation#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemImplementation#getLink()
	 * @see #getSystemImplementation()
	 * @generated
	 */
	EReference getSystemImplementation_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SystemImplementation#getLeveragedAuthorization <em>Leveraged Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Leveraged Authorization</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemImplementation#getLeveragedAuthorization()
	 * @see #getSystemImplementation()
	 * @generated
	 */
	EReference getSystemImplementation_LeveragedAuthorization();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SystemImplementation#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemImplementation#getUser()
	 * @see #getSystemImplementation()
	 * @generated
	 */
	EReference getSystemImplementation_User();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SystemImplementation#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemImplementation#getComponent()
	 * @see #getSystemImplementation()
	 * @generated
	 */
	EReference getSystemImplementation_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SystemImplementation#getInventoryItem <em>Inventory Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inventory Item</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemImplementation#getInventoryItem()
	 * @see #getSystemImplementation()
	 * @generated
	 */
	EReference getSystemImplementation_InventoryItem();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SystemImplementation#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemImplementation#getRemarks()
	 * @see #getSystemImplementation()
	 * @generated
	 */
	EReference getSystemImplementation_Remarks();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.SystemInformation <em>System Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Information</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemInformation
	 * @generated
	 */
	EClass getSystemInformation();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SystemInformation#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemInformation#getProp()
	 * @see #getSystemInformation()
	 * @generated
	 */
	EReference getSystemInformation_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SystemInformation#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemInformation#getLink()
	 * @see #getSystemInformation()
	 * @generated
	 */
	EReference getSystemInformation_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.SystemInformation#getInformationType <em>Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Information Type</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemInformation#getInformationType()
	 * @see #getSystemInformation()
	 * @generated
	 */
	EReference getSystemInformation_InformationType();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.SystemSecurityPlan <em>System Security Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Security Plan</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemSecurityPlan
	 * @generated
	 */
	EClass getSystemSecurityPlan();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SystemSecurityPlan#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemSecurityPlan#getMetadata()
	 * @see #getSystemSecurityPlan()
	 * @generated
	 */
	EReference getSystemSecurityPlan_Metadata();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SystemSecurityPlan#getImportProfile <em>Import Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Import Profile</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemSecurityPlan#getImportProfile()
	 * @see #getSystemSecurityPlan()
	 * @generated
	 */
	EReference getSystemSecurityPlan_ImportProfile();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SystemSecurityPlan#getSystemCharacteristics <em>System Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System Characteristics</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemSecurityPlan#getSystemCharacteristics()
	 * @see #getSystemSecurityPlan()
	 * @generated
	 */
	EReference getSystemSecurityPlan_SystemCharacteristics();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SystemSecurityPlan#getSystemImplementation <em>System Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System Implementation</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemSecurityPlan#getSystemImplementation()
	 * @see #getSystemSecurityPlan()
	 * @generated
	 */
	EReference getSystemSecurityPlan_SystemImplementation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SystemSecurityPlan#getControlImplementation <em>Control Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control Implementation</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemSecurityPlan#getControlImplementation()
	 * @see #getSystemSecurityPlan()
	 * @generated
	 */
	EReference getSystemSecurityPlan_ControlImplementation();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SystemSecurityPlan#getBackMatter <em>Back Matter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Back Matter</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemSecurityPlan#getBackMatter()
	 * @see #getSystemSecurityPlan()
	 * @generated
	 */
	EReference getSystemSecurityPlan_BackMatter();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.SystemSecurityPlan#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemSecurityPlan#getUuid()
	 * @see #getSystemSecurityPlan()
	 * @generated
	 */
	EAttribute getSystemSecurityPlan_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Party <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party</em>'.
	 * @see gov.nist.csrc.ns.oscal.Party
	 * @generated
	 */
	EClass getParty();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Party#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gov.nist.csrc.ns.oscal.Party#getName()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_Name();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Party#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see gov.nist.csrc.ns.oscal.Party#getShortName()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_ShortName();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Party#getExternalId <em>External Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.Party#getExternalId()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_ExternalId();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Party#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Party#getProp()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Party#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Party#getLink()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_Link();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.Party#getEmailAddress <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Email Address</em>'.
	 * @see gov.nist.csrc.ns.oscal.Party#getEmailAddress()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_EmailAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Party#getTelephoneNumber <em>Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telephone Number</em>'.
	 * @see gov.nist.csrc.ns.oscal.Party#getTelephoneNumber()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_TelephoneNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Party#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see gov.nist.csrc.ns.oscal.Party#getAddress()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_Address();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.Party#getLocationUuid <em>Location Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Location Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Party#getLocationUuid()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_LocationUuid();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.Party#getMemberOfOrganization <em>Member Of Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Member Of Organization</em>'.
	 * @see gov.nist.csrc.ns.oscal.Party#getMemberOfOrganization()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_MemberOfOrganization();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Party#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.Party#getRemarks()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Party#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gov.nist.csrc.ns.oscal.Party#getType()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_Type();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Party#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Party#getUuid()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.MarkupPreformatted <em>Markup Preformatted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markup Preformatted</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupPreformatted
	 * @generated
	 */
	EClass getMarkupPreformatted();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Provided <em>Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided</em>'.
	 * @see gov.nist.csrc.ns.oscal.Provided
	 * @generated
	 */
	EClass getProvided();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Provided#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.Provided#getDescription()
	 * @see #getProvided()
	 * @generated
	 */
	EReference getProvided_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Provided#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Provided#getProp()
	 * @see #getProvided()
	 * @generated
	 */
	EReference getProvided_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Provided#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Provided#getLink()
	 * @see #getProvided()
	 * @generated
	 */
	EReference getProvided_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Provided#getResponsibleRole <em>Responsible Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible Role</em>'.
	 * @see gov.nist.csrc.ns.oscal.Provided#getResponsibleRole()
	 * @see #getProvided()
	 * @generated
	 */
	EReference getProvided_ResponsibleRole();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Provided#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.Provided#getRemarks()
	 * @see #getProvided()
	 * @generated
	 */
	EReference getProvided_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Provided#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Provided#getUuid()
	 * @see #getProvided()
	 * @generated
	 */
	EAttribute getProvided_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.RelatedFinding <em>Related Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related Finding</em>'.
	 * @see gov.nist.csrc.ns.oscal.RelatedFinding
	 * @generated
	 */
	EClass getRelatedFinding();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.RelatedFinding#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.RelatedFinding#getRemarks()
	 * @see #getRelatedFinding()
	 * @generated
	 */
	EReference getRelatedFinding_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.RelatedFinding#getFindingUuid <em>Finding Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finding Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.RelatedFinding#getFindingUuid()
	 * @see #getRelatedFinding()
	 * @generated
	 */
	EAttribute getRelatedFinding_FindingUuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.RelatedResponse <em>Related Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related Response</em>'.
	 * @see gov.nist.csrc.ns.oscal.RelatedResponse
	 * @generated
	 */
	EClass getRelatedResponse();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.RelatedResponse#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.RelatedResponse#getProp()
	 * @see #getRelatedResponse()
	 * @generated
	 */
	EReference getRelatedResponse_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.RelatedResponse#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.RelatedResponse#getLink()
	 * @see #getRelatedResponse()
	 * @generated
	 */
	EReference getRelatedResponse_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.RelatedResponse#getRelatedTask <em>Related Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Related Task</em>'.
	 * @see gov.nist.csrc.ns.oscal.RelatedResponse#getRelatedTask()
	 * @see #getRelatedResponse()
	 * @generated
	 */
	EReference getRelatedResponse_RelatedTask();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.RelatedResponse#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.RelatedResponse#getRemarks()
	 * @see #getRelatedResponse()
	 * @generated
	 */
	EReference getRelatedResponse_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.RelatedResponse#getResponseUuid <em>Response Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.RelatedResponse#getResponseUuid()
	 * @see #getRelatedResponse()
	 * @generated
	 */
	EAttribute getRelatedResponse_ResponseUuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.RelevantEvidence <em>Relevant Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relevant Evidence</em>'.
	 * @see gov.nist.csrc.ns.oscal.RelevantEvidence
	 * @generated
	 */
	EClass getRelevantEvidence();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.RelevantEvidence#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.RelevantEvidence#getDescription()
	 * @see #getRelevantEvidence()
	 * @generated
	 */
	EReference getRelevantEvidence_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.RelevantEvidence#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.RelevantEvidence#getProp()
	 * @see #getRelevantEvidence()
	 * @generated
	 */
	EReference getRelevantEvidence_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.RelevantEvidence#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.RelevantEvidence#getLink()
	 * @see #getRelevantEvidence()
	 * @generated
	 */
	EReference getRelevantEvidence_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.RelevantEvidence#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.RelevantEvidence#getRemarks()
	 * @see #getRelevantEvidence()
	 * @generated
	 */
	EReference getRelevantEvidence_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.RelevantEvidence#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see gov.nist.csrc.ns.oscal.RelevantEvidence#getHref()
	 * @see #getRelevantEvidence()
	 * @generated
	 */
	EAttribute getRelevantEvidence_Href();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Remove <em>Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove</em>'.
	 * @see gov.nist.csrc.ns.oscal.Remove
	 * @generated
	 */
	EClass getRemove();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Remove#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.Remove#getRemarks()
	 * @see #getRemove()
	 * @generated
	 */
	EReference getRemove_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Remove#getByClass <em>By Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Class</em>'.
	 * @see gov.nist.csrc.ns.oscal.Remove#getByClass()
	 * @see #getRemove()
	 * @generated
	 */
	EAttribute getRemove_ByClass();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Remove#getById <em>By Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.Remove#getById()
	 * @see #getRemove()
	 * @generated
	 */
	EAttribute getRemove_ById();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Remove#getByItemName <em>By Item Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Item Name</em>'.
	 * @see gov.nist.csrc.ns.oscal.Remove#getByItemName()
	 * @see #getRemove()
	 * @generated
	 */
	EAttribute getRemove_ByItemName();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Remove#getByName <em>By Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Name</em>'.
	 * @see gov.nist.csrc.ns.oscal.Remove#getByName()
	 * @see #getRemove()
	 * @generated
	 */
	EAttribute getRemove_ByName();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Remove#getByNs <em>By Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Ns</em>'.
	 * @see gov.nist.csrc.ns.oscal.Remove#getByNs()
	 * @see #getRemove()
	 * @generated
	 */
	EAttribute getRemove_ByNs();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.RequiredAsset <em>Required Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Asset</em>'.
	 * @see gov.nist.csrc.ns.oscal.RequiredAsset
	 * @generated
	 */
	EClass getRequiredAsset();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.RequiredAsset#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subject</em>'.
	 * @see gov.nist.csrc.ns.oscal.RequiredAsset#getSubject()
	 * @see #getRequiredAsset()
	 * @generated
	 */
	EReference getRequiredAsset_Subject();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.RequiredAsset#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.RequiredAsset#getTitle()
	 * @see #getRequiredAsset()
	 * @generated
	 */
	EReference getRequiredAsset_Title();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.RequiredAsset#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.RequiredAsset#getDescription()
	 * @see #getRequiredAsset()
	 * @generated
	 */
	EReference getRequiredAsset_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.RequiredAsset#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.RequiredAsset#getProp()
	 * @see #getRequiredAsset()
	 * @generated
	 */
	EReference getRequiredAsset_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.RequiredAsset#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.RequiredAsset#getLink()
	 * @see #getRequiredAsset()
	 * @generated
	 */
	EReference getRequiredAsset_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.RequiredAsset#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.RequiredAsset#getRemarks()
	 * @see #getRequiredAsset()
	 * @generated
	 */
	EReference getRequiredAsset_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.RequiredAsset#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.RequiredAsset#getUuid()
	 * @see #getRequiredAsset()
	 * @generated
	 */
	EAttribute getRequiredAsset_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.BackMatterResource <em>Back Matter Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Back Matter Resource</em>'.
	 * @see gov.nist.csrc.ns.oscal.BackMatterResource
	 * @generated
	 */
	EClass getBackMatterResource();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.BackMatterResource#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.BackMatterResource#getTitle()
	 * @see #getBackMatterResource()
	 * @generated
	 */
	EReference getBackMatterResource_Title();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.BackMatterResource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.BackMatterResource#getDescription()
	 * @see #getBackMatterResource()
	 * @generated
	 */
	EReference getBackMatterResource_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.BackMatterResource#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.BackMatterResource#getProp()
	 * @see #getBackMatterResource()
	 * @generated
	 */
	EReference getBackMatterResource_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.BackMatterResource#getDocumentId <em>Document Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Document Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.BackMatterResource#getDocumentId()
	 * @see #getBackMatterResource()
	 * @generated
	 */
	EReference getBackMatterResource_DocumentId();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.BackMatterResource#getCitation <em>Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Citation</em>'.
	 * @see gov.nist.csrc.ns.oscal.BackMatterResource#getCitation()
	 * @see #getBackMatterResource()
	 * @generated
	 */
	EReference getBackMatterResource_Citation();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.BackMatterResource#getRlink <em>Rlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rlink</em>'.
	 * @see gov.nist.csrc.ns.oscal.BackMatterResource#getRlink()
	 * @see #getBackMatterResource()
	 * @generated
	 */
	EReference getBackMatterResource_Rlink();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.BackMatterResource#getBase64 <em>Base64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base64</em>'.
	 * @see gov.nist.csrc.ns.oscal.BackMatterResource#getBase64()
	 * @see #getBackMatterResource()
	 * @generated
	 */
	EReference getBackMatterResource_Base64();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.BackMatterResource#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.BackMatterResource#getRemarks()
	 * @see #getBackMatterResource()
	 * @generated
	 */
	EReference getBackMatterResource_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.BackMatterResource#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.BackMatterResource#getUuid()
	 * @see #getBackMatterResource()
	 * @generated
	 */
	EAttribute getBackMatterResource_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Responsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsibility</em>'.
	 * @see gov.nist.csrc.ns.oscal.Responsibility
	 * @generated
	 */
	EClass getResponsibility();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Responsibility#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.Responsibility#getDescription()
	 * @see #getResponsibility()
	 * @generated
	 */
	EReference getResponsibility_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Responsibility#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Responsibility#getProp()
	 * @see #getResponsibility()
	 * @generated
	 */
	EReference getResponsibility_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Responsibility#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Responsibility#getLink()
	 * @see #getResponsibility()
	 * @generated
	 */
	EReference getResponsibility_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Responsibility#getResponsibleRole <em>Responsible Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible Role</em>'.
	 * @see gov.nist.csrc.ns.oscal.Responsibility#getResponsibleRole()
	 * @see #getResponsibility()
	 * @generated
	 */
	EReference getResponsibility_ResponsibleRole();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Responsibility#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.Responsibility#getRemarks()
	 * @see #getResponsibility()
	 * @generated
	 */
	EReference getResponsibility_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Responsibility#getProvidedUuid <em>Provided Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provided Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Responsibility#getProvidedUuid()
	 * @see #getResponsibility()
	 * @generated
	 */
	EAttribute getResponsibility_ProvidedUuid();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Responsibility#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Responsibility#getUuid()
	 * @see #getResponsibility()
	 * @generated
	 */
	EAttribute getResponsibility_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Revisions <em>Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revisions</em>'.
	 * @see gov.nist.csrc.ns.oscal.Revisions
	 * @generated
	 */
	EClass getRevisions();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Revisions#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Revision</em>'.
	 * @see gov.nist.csrc.ns.oscal.Revisions#getRevision()
	 * @see #getRevisions()
	 * @generated
	 */
	EReference getRevisions_Revision();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Revision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revision</em>'.
	 * @see gov.nist.csrc.ns.oscal.Revision
	 * @generated
	 */
	EClass getRevision();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Revision#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.Revision#getTitle()
	 * @see #getRevision()
	 * @generated
	 */
	EReference getRevision_Title();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Revision#getPublished <em>Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Published</em>'.
	 * @see gov.nist.csrc.ns.oscal.Revision#getPublished()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_Published();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Revision#getLastModified <em>Last Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified</em>'.
	 * @see gov.nist.csrc.ns.oscal.Revision#getLastModified()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_LastModified();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Revision#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see gov.nist.csrc.ns.oscal.Revision#getVersion()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_Version();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Revision#getOscalVersion <em>Oscal Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oscal Version</em>'.
	 * @see gov.nist.csrc.ns.oscal.Revision#getOscalVersion()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_OscalVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Revision#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Revision#getProp()
	 * @see #getRevision()
	 * @generated
	 */
	EReference getRevision_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Revision#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Revision#getLink()
	 * @see #getRevision()
	 * @generated
	 */
	EReference getRevision_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Revision#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.Revision#getRemarks()
	 * @see #getRevision()
	 * @generated
	 */
	EReference getRevision_Remarks();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.RiskLog <em>Risk Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Risk Log</em>'.
	 * @see gov.nist.csrc.ns.oscal.RiskLog
	 * @generated
	 */
	EClass getRiskLog();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.RiskLog#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see gov.nist.csrc.ns.oscal.RiskLog#getEntry()
	 * @see #getRiskLog()
	 * @generated
	 */
	EReference getRiskLog_Entry();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Rlink <em>Rlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rlink</em>'.
	 * @see gov.nist.csrc.ns.oscal.Rlink
	 * @generated
	 */
	EClass getRlink();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Rlink#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hash</em>'.
	 * @see gov.nist.csrc.ns.oscal.Rlink#getHash()
	 * @see #getRlink()
	 * @generated
	 */
	EReference getRlink_Hash();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Rlink#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see gov.nist.csrc.ns.oscal.Rlink#getHref()
	 * @see #getRlink()
	 * @generated
	 */
	EAttribute getRlink_Href();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Rlink#getMediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media Type</em>'.
	 * @see gov.nist.csrc.ns.oscal.Rlink#getMediaType()
	 * @see #getRlink()
	 * @generated
	 */
	EAttribute getRlink_MediaType();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see gov.nist.csrc.ns.oscal.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Role#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.Role#getTitle()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Title();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Role#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see gov.nist.csrc.ns.oscal.Role#getShortName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_ShortName();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Role#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.Role#getDescription()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Role#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Role#getProp()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Role#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Role#getLink()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Role#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.Role#getRemarks()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Role#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.Role#getId()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Id();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Satisfied <em>Satisfied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satisfied</em>'.
	 * @see gov.nist.csrc.ns.oscal.Satisfied
	 * @generated
	 */
	EClass getSatisfied();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Satisfied#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.Satisfied#getDescription()
	 * @see #getSatisfied()
	 * @generated
	 */
	EReference getSatisfied_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Satisfied#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Satisfied#getProp()
	 * @see #getSatisfied()
	 * @generated
	 */
	EReference getSatisfied_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Satisfied#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Satisfied#getLink()
	 * @see #getSatisfied()
	 * @generated
	 */
	EReference getSatisfied_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Satisfied#getResponsibleRole <em>Responsible Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible Role</em>'.
	 * @see gov.nist.csrc.ns.oscal.Satisfied#getResponsibleRole()
	 * @see #getSatisfied()
	 * @generated
	 */
	EReference getSatisfied_ResponsibleRole();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Satisfied#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.Satisfied#getRemarks()
	 * @see #getSatisfied()
	 * @generated
	 */
	EReference getSatisfied_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Satisfied#getResponsibilityUuid <em>Responsibility Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Responsibility Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Satisfied#getResponsibilityUuid()
	 * @see #getSatisfied()
	 * @generated
	 */
	EAttribute getSatisfied_ResponsibilityUuid();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Satisfied#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Satisfied#getUuid()
	 * @see #getSatisfied()
	 * @generated
	 */
	EAttribute getSatisfied_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.ProfileSetParameter <em>Profile Set Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile Set Parameter</em>'.
	 * @see gov.nist.csrc.ns.oscal.ProfileSetParameter
	 * @generated
	 */
	EClass getProfileSetParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.ProfileSetParameter#getProp()
	 * @see #getProfileSetParameter()
	 * @generated
	 */
	EReference getProfileSetParameter_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.ProfileSetParameter#getLink()
	 * @see #getProfileSetParameter()
	 * @generated
	 */
	EReference getProfileSetParameter_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see gov.nist.csrc.ns.oscal.ProfileSetParameter#getLabel()
	 * @see #getProfileSetParameter()
	 * @generated
	 */
	EReference getProfileSetParameter_Label();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Usage</em>'.
	 * @see gov.nist.csrc.ns.oscal.ProfileSetParameter#getUsage()
	 * @see #getProfileSetParameter()
	 * @generated
	 */
	EReference getProfileSetParameter_Usage();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see gov.nist.csrc.ns.oscal.ProfileSetParameter#getConstraint()
	 * @see #getProfileSetParameter()
	 * @generated
	 */
	EReference getProfileSetParameter_Constraint();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getGuideline <em>Guideline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guideline</em>'.
	 * @see gov.nist.csrc.ns.oscal.ProfileSetParameter#getGuideline()
	 * @see #getProfileSetParameter()
	 * @generated
	 */
	EReference getProfileSetParameter_Guideline();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see gov.nist.csrc.ns.oscal.ProfileSetParameter#getValue()
	 * @see #getProfileSetParameter()
	 * @generated
	 */
	EAttribute getProfileSetParameter_Value();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select</em>'.
	 * @see gov.nist.csrc.ns.oscal.ProfileSetParameter#getSelect()
	 * @see #getProfileSetParameter()
	 * @generated
	 */
	EReference getProfileSetParameter_Select();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see gov.nist.csrc.ns.oscal.ProfileSetParameter#getClass_()
	 * @see #getProfileSetParameter()
	 * @generated
	 */
	EAttribute getProfileSetParameter_Class();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depends On</em>'.
	 * @see gov.nist.csrc.ns.oscal.ProfileSetParameter#getDependsOn()
	 * @see #getProfileSetParameter()
	 * @generated
	 */
	EAttribute getProfileSetParameter_DependsOn();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ProfileSetParameter#getParamId <em>Param Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param Id</em>'.
	 * @see gov.nist.csrc.ns.oscal.ProfileSetParameter#getParamId()
	 * @see #getProfileSetParameter()
	 * @generated
	 */
	EAttribute getProfileSetParameter_ParamId();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.PlaceholderSource <em>Placeholder Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placeholder Source</em>'.
	 * @see gov.nist.csrc.ns.oscal.PlaceholderSource
	 * @generated
	 */
	EClass getPlaceholderSource();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.PlaceholderSource#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.PlaceholderSource#getRemarks()
	 * @see #getPlaceholderSource()
	 * @generated
	 */
	EReference getPlaceholderSource_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.PlaceholderSource#getTaskUuid <em>Task Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.PlaceholderSource#getTaskUuid()
	 * @see #getPlaceholderSource()
	 * @generated
	 */
	EAttribute getPlaceholderSource_TaskUuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.FindingTargetStatus <em>Finding Target Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finding Target Status</em>'.
	 * @see gov.nist.csrc.ns.oscal.FindingTargetStatus
	 * @generated
	 */
	EClass getFindingTargetStatus();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.FindingTargetStatus#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.FindingTargetStatus#getRemarks()
	 * @see #getFindingTargetStatus()
	 * @generated
	 */
	EReference getFindingTargetStatus_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.FindingTargetStatus#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see gov.nist.csrc.ns.oscal.FindingTargetStatus#getReason()
	 * @see #getFindingTargetStatus()
	 * @generated
	 */
	EAttribute getFindingTargetStatus_Reason();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.FindingTargetStatus#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see gov.nist.csrc.ns.oscal.FindingTargetStatus#getState()
	 * @see #getFindingTargetStatus()
	 * @generated
	 */
	EAttribute getFindingTargetStatus_State();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.SystemComponentStatus <em>System Component Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Component Status</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemComponentStatus
	 * @generated
	 */
	EClass getSystemComponentStatus();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.SystemComponentStatus#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemComponentStatus#getRemarks()
	 * @see #getSystemComponentStatus()
	 * @generated
	 */
	EReference getSystemComponentStatus_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.SystemComponentStatus#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see gov.nist.csrc.ns.oscal.SystemComponentStatus#getState()
	 * @see #getSystemComponentStatus()
	 * @generated
	 */
	EAttribute getSystemComponentStatus_State();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see gov.nist.csrc.ns.oscal.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Step#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see gov.nist.csrc.ns.oscal.Step#getTitle()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Title();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Step#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see gov.nist.csrc.ns.oscal.Step#getDescription()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Step#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.Step#getProp()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Step#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.Step#getLink()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Link();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Step#getReviewedControls <em>Reviewed Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reviewed Controls</em>'.
	 * @see gov.nist.csrc.ns.oscal.Step#getReviewedControls()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_ReviewedControls();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.Step#getResponsibleRole <em>Responsible Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible Role</em>'.
	 * @see gov.nist.csrc.ns.oscal.Step#getResponsibleRole()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_ResponsibleRole();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Step#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.Step#getRemarks()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.Step#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.Step#getUuid()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Uuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.MarkupTableCell <em>Markup Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markup Table Cell</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupTableCell
	 * @generated
	 */
	EClass getMarkupTableCell();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.MarkupTableCell#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupTableCell#getAlign()
	 * @see #getMarkupTableCell()
	 * @generated
	 */
	EAttribute getMarkupTableCell_Align();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.MarkupTableRow <em>Markup Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markup Table Row</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupTableRow
	 * @generated
	 */
	EClass getMarkupTableRow();

	/**
	 * Returns the meta object for the attribute list '{@link gov.nist.csrc.ns.oscal.MarkupTableRow#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupTableRow#getGroup()
	 * @see #getMarkupTableRow()
	 * @generated
	 */
	EAttribute getMarkupTableRow_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupTableRow#getTd <em>Td</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Td</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupTableRow#getTd()
	 * @see #getMarkupTableRow()
	 * @generated
	 */
	EReference getMarkupTableRow_Td();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupTableRow#getTh <em>Th</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Th</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupTableRow#getTh()
	 * @see #getMarkupTableRow()
	 * @generated
	 */
	EReference getMarkupTableRow_Th();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.MarkupTable <em>Markup Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markup Table</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupTable
	 * @generated
	 */
	EClass getMarkupTable();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.MarkupTable#getTr <em>Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tr</em>'.
	 * @see gov.nist.csrc.ns.oscal.MarkupTable#getTr()
	 * @see #getMarkupTable()
	 * @generated
	 */
	EReference getMarkupTable_Tr();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.TermsAndConditions <em>Terms And Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terms And Conditions</em>'.
	 * @see gov.nist.csrc.ns.oscal.TermsAndConditions
	 * @generated
	 */
	EClass getTermsAndConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.TermsAndConditions#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see gov.nist.csrc.ns.oscal.TermsAndConditions#getPart()
	 * @see #getTermsAndConditions()
	 * @generated
	 */
	EReference getTermsAndConditions_Part();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.ConstraintTest <em>Constraint Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Test</em>'.
	 * @see gov.nist.csrc.ns.oscal.ConstraintTest
	 * @generated
	 */
	EClass getConstraintTest();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.ConstraintTest#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see gov.nist.csrc.ns.oscal.ConstraintTest#getExpression()
	 * @see #getConstraintTest()
	 * @generated
	 */
	EAttribute getConstraintTest_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.ConstraintTest#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.ConstraintTest#getRemarks()
	 * @see #getConstraintTest()
	 * @generated
	 */
	EReference getConstraintTest_Remarks();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.Timing <em>Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing</em>'.
	 * @see gov.nist.csrc.ns.oscal.Timing
	 * @generated
	 */
	EClass getTiming();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Timing#getOnDate <em>On Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Date</em>'.
	 * @see gov.nist.csrc.ns.oscal.Timing#getOnDate()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_OnDate();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Timing#getWithinDateRange <em>Within Date Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Within Date Range</em>'.
	 * @see gov.nist.csrc.ns.oscal.Timing#getWithinDateRange()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_WithinDateRange();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.Timing#getAtFrequency <em>At Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>At Frequency</em>'.
	 * @see gov.nist.csrc.ns.oscal.Timing#getAtFrequency()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_AtFrequency();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.UsesComponent <em>Uses Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uses Component</em>'.
	 * @see gov.nist.csrc.ns.oscal.UsesComponent
	 * @generated
	 */
	EClass getUsesComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.UsesComponent#getProp <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prop</em>'.
	 * @see gov.nist.csrc.ns.oscal.UsesComponent#getProp()
	 * @see #getUsesComponent()
	 * @generated
	 */
	EReference getUsesComponent_Prop();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.UsesComponent#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see gov.nist.csrc.ns.oscal.UsesComponent#getLink()
	 * @see #getUsesComponent()
	 * @generated
	 */
	EReference getUsesComponent_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.nist.csrc.ns.oscal.UsesComponent#getResponsibleParty <em>Responsible Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible Party</em>'.
	 * @see gov.nist.csrc.ns.oscal.UsesComponent#getResponsibleParty()
	 * @see #getUsesComponent()
	 * @generated
	 */
	EReference getUsesComponent_ResponsibleParty();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.UsesComponent#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.UsesComponent#getRemarks()
	 * @see #getUsesComponent()
	 * @generated
	 */
	EReference getUsesComponent_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.UsesComponent#getComponentUuid <em>Component Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Uuid</em>'.
	 * @see gov.nist.csrc.ns.oscal.UsesComponent#getComponentUuid()
	 * @see #getUsesComponent()
	 * @generated
	 */
	EAttribute getUsesComponent_ComponentUuid();

	/**
	 * Returns the meta object for class '{@link gov.nist.csrc.ns.oscal.WithinDateRange <em>Within Date Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Within Date Range</em>'.
	 * @see gov.nist.csrc.ns.oscal.WithinDateRange
	 * @generated
	 */
	EClass getWithinDateRange();

	/**
	 * Returns the meta object for the containment reference '{@link gov.nist.csrc.ns.oscal.WithinDateRange#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remarks</em>'.
	 * @see gov.nist.csrc.ns.oscal.WithinDateRange#getRemarks()
	 * @see #getWithinDateRange()
	 * @generated
	 */
	EReference getWithinDateRange_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.WithinDateRange#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see gov.nist.csrc.ns.oscal.WithinDateRange#getEnd()
	 * @see #getWithinDateRange()
	 * @generated
	 */
	EAttribute getWithinDateRange_End();

	/**
	 * Returns the meta object for the attribute '{@link gov.nist.csrc.ns.oscal.WithinDateRange#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see gov.nist.csrc.ns.oscal.WithinDateRange#getStart()
	 * @see #getWithinDateRange()
	 * @generated
	 */
	EAttribute getWithinDateRange_Start();

	/**
	 * Returns the meta object for enum '{@link gov.nist.csrc.ns.oscal.AlignType <em>Align Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Align Type</em>'.
	 * @see gov.nist.csrc.ns.oscal.AlignType
	 * @generated
	 */
	EEnum getAlignType();

	/**
	 * Returns the meta object for data type '{@link gov.nist.csrc.ns.oscal.AlignType <em>Align Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Align Type Object</em>'.
	 * @see gov.nist.csrc.ns.oscal.AlignType
	 * @model instanceClass="gov.nist.csrc.ns.oscal.AlignType"
	 *        extendedMetaData="name='alignType:Object' baseType='alignType'"
	 * @generated
	 */
	EDataType getAlignTypeObject();

	/**
	 * Returns the meta object for data type '<em>As Is Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                           
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Group As-Is</b>
     *   : Indicates that the controls selected should retain their original grouping as defined in the import source.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>As Is Type</em>'.
	 * @model instanceClass="boolean"
	 *        extendedMetaData="name='as-is_._type' baseType='BooleanDatatype'"
	 * @generated
	 */
	EDataType getAsIsType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>As Is Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>As Is Type Object</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        extendedMetaData="name='as-is_._type:Object' baseType='as-is_._type'"
	 * @generated
	 */
	EDataType getAsIsTypeObject();

	/**
	 * Returns the meta object for data type '<em>Base64 Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Binary data encoded using the Base64 encoding algorithm
     * 				as defined by RFC4648.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Base64 Datatype</em>'.
	 * @model instanceClass="byte[]"
	 *        extendedMetaData="name='Base64Datatype' baseType='http://www.eclipse.org/emf/2003/XMLType#base64Binary' pattern='[0-9A-Za-z+/]+={0,2}'"
	 * @generated
	 */
	EDataType getBase64Datatype();

	/**
	 * Returns the meta object for data type '<em>Boolean Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A binary value that is either: true (or 1) or false (or 0).
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Boolean Datatype</em>'.
	 * @model instanceClass="boolean"
	 *        extendedMetaData="name='BooleanDatatype' baseType='http://www.eclipse.org/emf/2003/XMLType#boolean' pattern='true|1|false|0'"
	 * @generated
	 */
	EDataType getBooleanDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean Datatype Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean Datatype Object</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        extendedMetaData="name='BooleanDatatype:Object' baseType='BooleanDatatype'"
	 * @generated
	 */
	EDataType getBooleanDatatypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Category Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='category_._type' baseType='StringDatatype'"
	 * @generated
	 */
	EDataType getCategoryType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>City Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                        
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">City</b>
     *   : City, town or geographical region for the mailing address.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>City Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='city_._type' baseType='StringDatatype'"
	 * @generated
	 */
	EDataType getCityType();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Collected Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                        
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Collected Field</b>
     *   : Date/time stamp identifying when the finding information was collected.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Collected Type</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='collected_._type' baseType='DateTimeWithTimezoneDatatype'"
	 * @generated
	 */
	EDataType getCollectedType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Country Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                        
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Country Code</b>
     *   : The ISO 3166-1 alpha-2 country code for the mailing address.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Country Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='country_._type' baseType='StringDatatype'"
	 * @generated
	 */
	EDataType getCountryType();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Date Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A string representing a 24-hour period with an optional timezone.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Date Datatype</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='DateDatatype' baseType='http://www.eclipse.org/emf/2003/XMLType#date' pattern='(((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)|(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))|(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))|(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30)))(Z|(-((0[0-9]|1[0-2]):00|0[39]:30)|\\+((0[0-9]|1[0-4]):00|(0[34569]|10):30|(0[58]|12):45)))?'"
	 * @generated
	 */
	EDataType getDateDatatype();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Date Time Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A string representing a point in time with an optional timezone.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Date Time Datatype</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='DateTimeDatatype' baseType='http://www.eclipse.org/emf/2003/XMLType#dateTime' pattern='(((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)|(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))|(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))|(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30)))T(2[0-3]|[01][0-9]):([0-5][0-9]):([0-5][0-9])(\\.[0-9]+)?(Z|(-((0[0-9]|1[0-2]):00|0[39]:30)|\\+((0[0-9]|1[0-4]):00|(0[34569]|10):30|(0[58]|12):45)))?'"
	 * @generated
	 */
	EDataType getDateTimeDatatype();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Date Time With Timezone Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A string representing a point in time with a required timezone.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Date Time With Timezone Datatype</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='DateTimeWithTimezoneDatatype' baseType='DateTimeDatatype' pattern='(((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)|(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))|(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))|(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30)))T(2[0-3]|[01][0-9]):([0-5][0-9]):([0-5][0-9])(\\.[0-9]+)?(Z|(-((0[0-9]|1[0-2]):00|0[39]:30)|\\+((0[0-9]|1[0-4]):00|(0[34569]|10):30|(0[58]|12):45)))'"
	 * @generated
	 */
	EDataType getDateTimeWithTimezoneDatatype();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Deadline Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                        
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Risk Resolution Deadline</b>
     *   : The date/time by which the risk must be resolved.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Deadline Type</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='deadline_._type' baseType='DateTimeWithTimezoneDatatype'"
	 * @generated
	 */
	EDataType getDeadlineType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Decimal Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A real number expressed using a whole and optional fractional part
     * 				separated by a period.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Decimal Datatype</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='DecimalDatatype' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' pattern='\\S(.*\\S)?'"
	 * @generated
	 */
	EDataType getDecimalDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Email Address Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * An email address string formatted according to RFC 6531.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Email Address Datatype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='EmailAddressDatatype' baseType='StringDatatype' pattern='.+@.+'"
	 * @generated
	 */
	EDataType getEmailAddressDatatype();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>End Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                                          
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">End</b>
     *   : Identifies the end date and time of an event. If the event is a point in time, the start and end will be the same date and time.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>End Type</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='end_._type' baseType='DateTimeWithTimezoneDatatype'"
	 * @generated
	 */
	EDataType getEndType();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>End Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                                          
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">End</b>
     *   : Identifies the end date and time of the event. If the event is a point in time, the start and end will be the same date and time.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>End Type1</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='end_._1_._type' baseType='DateTimeWithTimezoneDatatype'"
	 * @generated
	 */
	EDataType getEndType1();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>End Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                        
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">end field</b>
     *   : Date/time stamp identifying the end of the evidence collection reflected in these results. In a continuous motoring scenario, this may contain the same value as start if appropriate.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>End Type2</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='end_._2_._type' baseType='DateTimeWithTimezoneDatatype'"
	 * @generated
	 */
	EDataType getEndType2();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Expires Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                        
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Expires Field</b>
     *   : Date/time identifying when the finding information is out-of-date and no longer valid. Typically used with continuous assessment scenarios.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Expires Type</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='expires_._type' baseType='DateTimeWithTimezoneDatatype'"
	 * @generated
	 */
	EDataType getExpiresType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                                 
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Constraint test</b>
     *   : A formal (executable) expression of a constraint.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Expression Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='expression_._type' baseType='StringDatatype'"
	 * @generated
	 */
	EDataType getExpressionType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Implementation Statement Uuid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                        
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Implementation Statement UUID</b>
     *   : A machine-oriented identifier reference to the implementation statement in the SSP to which this finding is related.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Implementation Statement Uuid Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='implementation-statement-uuid_._type' baseType='UUIDDatatype'"
	 * @generated
	 */
	EDataType getImplementationStatementUuidType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Information Type Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                                          
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Information Type Systematized Identifier</b>
     *   : A human-oriented, globally unique identifier qualified by the given identification system used, such as NIST SP 800-60. This identifier has cross-instance scope and can be used to reference this system elsewhere in this or other OSCAL instances. This id should be assigned per-subject, which means it should be consistently used to identify the same subject across revisions of the document.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Information Type Id Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='information-type-id_._type' baseType='StringDatatype'"
	 * @generated
	 */
	EDataType getInformationTypeIdType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Member Of Organization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                                 
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Organizational Affiliation</b>
     *   : A reference to another party by UUID, typically an organization, that this subject is associated with.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Member Of Organization Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='member-of-organization_._type' baseType='UUIDDatatype'"
	 * @generated
	 */
	EDataType getMemberOfOrganizationType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                        
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Observation Method</b>
     *   : Identifies how the observation was made.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Method Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='method_._type' baseType='StringDatatype'"
	 * @generated
	 */
	EDataType getMethodType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                                 
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Party Name</b>
     *   : The full name of the party. This is typically the legal name associated with the party.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='name_._type' baseType='StringDatatype'"
	 * @generated
	 */
	EDataType getNameType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Non Negative Integer Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * An integer value that is equal to or greater than 0.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Non Negative Integer Datatype</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='NonNegativeIntegerDatatype' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger' pattern='\\S(.*\\S)?'"
	 * @generated
	 */
	EDataType getNonNegativeIntegerDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Oscal Assessment Common Risk Status FIELD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *               
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Risk Status</b>
     *   : Describes the status of the associated risk.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Oscal Assessment Common Risk Status FIELD</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='oscal-assessment-common-risk-status-FIELD' baseType='TokenDatatype'"
	 * @generated
	 */
	EDataType getOscalAssessmentCommonRiskStatusFIELD();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Oscal Control Common Parameter Value FIELD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *               
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Parameter Value</b>
     *   : A parameter value or set of values.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Oscal Control Common Parameter Value FIELD</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='oscal-control-common-parameter-value-FIELD' baseType='StringDatatype'"
	 * @generated
	 */
	EDataType getOscalControlCommonParameterValueFIELD();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Oscal Control Common With Id FIELD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *               
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Match Controls by Identifier</b>
     *   : Selecting a control by its ID given as a literal.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Oscal Control Common With Id FIELD</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='oscal-control-common-with-id-FIELD' baseType='TokenDatatype'"
	 * @generated
	 */
	EDataType getOscalControlCommonWithIdFIELD();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Oscal Implementation Common Function Performed FIELD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *               
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Functions Performed</b>
     *   : Describes a function performed for a given authorized privilege by this user class.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Oscal Implementation Common Function Performed FIELD</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='oscal-implementation-common-function-performed-FIELD' baseType='StringDatatype'"
	 * @generated
	 */
	EDataType getOscalImplementationCommonFunctionPerformedFIELD();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Oscal Mapping Common Percentage FIELD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *               
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Percentage</b>
     *   : A decimal value from 0-1, representing a percentage.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Oscal Mapping Common Percentage FIELD</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='oscal-mapping-common-percentage-FIELD' baseType='DecimalDatatype'"
	 * @generated
	 */
	EDataType getOscalMappingCommonPercentageFIELD();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Oscal Metadata Addr Line FIELD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *               
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Address line</b>
     *   : A single line of an address.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Oscal Metadata Addr Line FIELD</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='oscal-metadata-addr-line-FIELD' baseType='StringDatatype'"
	 * @generated
	 */
	EDataType getOscalMetadataAddrLineFIELD();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Oscal Metadata Email Address FIELD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *               
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Email Address</b>
     *   : An email address as defined by RFC 5322 Section 3.4.1.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Oscal Metadata Email Address FIELD</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='oscal-metadata-email-address-FIELD' baseType='EmailAddressDatatype'"
	 * @generated
	 */
	EDataType getOscalMetadataEmailAddressFIELD();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Oscal Metadata Last Modified FIELD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *               
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Last Modified Timestamp</b>
     *   : The date and time the document was last stored for later retrieval.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Oscal Metadata Last Modified FIELD</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='oscal-metadata-last-modified-FIELD' baseType='DateTimeWithTimezoneDatatype'"
	 * @generated
	 */
	EDataType getOscalMetadataLastModifiedFIELD();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Oscal Metadata Location Uuid FIELD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *               
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Location Universally Unique Identifier Reference</b>
     *   : Reference to a location by UUID.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Oscal Metadata Location Uuid FIELD</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='oscal-metadata-location-uuid-FIELD' baseType='UUIDDatatype'"
	 * @generated
	 */
	EDataType getOscalMetadataLocationUuidFIELD();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Oscal Metadata Oscal Version FIELD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *               
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">OSCAL Version</b>
     *   : The OSCAL model version the document was authored against and will conform to as valid.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Oscal Metadata Oscal Version FIELD</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='oscal-metadata-oscal-version-FIELD' baseType='StringDatatype'"
	 * @generated
	 */
	EDataType getOscalMetadataOscalVersionFIELD();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Oscal Metadata Party Uuid FIELD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *               
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Party Universally Unique Identifier Reference</b>
     *   : Reference to a party by UUID.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Oscal Metadata Party Uuid FIELD</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='oscal-metadata-party-uuid-FIELD' baseType='UUIDDatatype'"
	 * @generated
	 */
	EDataType getOscalMetadataPartyUuidFIELD();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Oscal Metadata Published FIELD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *               
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Publication Timestamp</b>
     *   : The date and time the document was last made available.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Oscal Metadata Published FIELD</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='oscal-metadata-published-FIELD' baseType='DateTimeWithTimezoneDatatype'"
	 * @generated
	 */
	EDataType getOscalMetadataPublishedFIELD();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Oscal Metadata Role Id FIELD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *               
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Role Identifier Reference</b>
     *   : Reference to a role by UUID.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Oscal Metadata Role Id FIELD</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='oscal-metadata-role-id-FIELD' baseType='TokenDatatype'"
	 * @generated
	 */
	EDataType getOscalMetadataRoleIdFIELD();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Oscal Metadata Version FIELD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *               
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Document Version</b>
     *   : Used to distinguish a specific revision of an OSCAL document from other previous and future versions.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Oscal Metadata Version FIELD</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='oscal-metadata-version-FIELD' baseType='StringDatatype'"
	 * @generated
	 */
	EDataType getOscalMetadataVersionFIELD();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Oscal Ssp Base FIELD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *               
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Base Level (Confidentiality, Integrity, or Availability)</b>
     *   : The prescribed base (Confidentiality, Integrity, or Availability) security impact level.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Oscal Ssp Base FIELD</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='oscal-ssp-base-FIELD' baseType='StringDatatype'"
	 * @generated
	 */
	EDataType getOscalSspBaseFIELD();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Oscal Ssp Date Authorized FIELD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *               
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">System Authorization Date</b>
     *   : The date the system received its authorization.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Oscal Ssp Date Authorized FIELD</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='oscal-ssp-date-authorized-FIELD' baseType='DateDatatype'"
	 * @generated
	 */
	EDataType getOscalSspDateAuthorizedFIELD();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Oscal Ssp Selected FIELD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *               
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Selected Level (Confidentiality, Integrity, or Availability)</b>
     *   : The selected (Confidentiality, Integrity, or Availability) security impact level.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Oscal Ssp Selected FIELD</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='oscal-ssp-selected-FIELD' baseType='StringDatatype'"
	 * @generated
	 */
	EDataType getOscalSspSelectedFIELD();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Party Uuid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                                 
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">party-uuid field</b>
     *   : A machine-oriented identifier reference to the party that manages the leveraged system.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Party Uuid Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='party-uuid_._type' baseType='UUIDDatatype'"
	 * @generated
	 */
	EDataType getPartyUuidType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Positive Integer Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * An integer value that is greater than 0.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Positive Integer Datatype</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='PositiveIntegerDatatype' baseType='http://www.eclipse.org/emf/2003/XMLType#positiveInteger' pattern='\\S(.*\\S)?'"
	 * @generated
	 */
	EDataType getPositiveIntegerDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Postal Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                        
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Postal Code</b>
     *   : Postal or ZIP code for mailing address.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Postal Code Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='postal-code_._type' baseType='StringDatatype'"
	 * @generated
	 */
	EDataType getPostalCodeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                        
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Mapping Entry Relationship</b>
     *   : The relationship type for the mapping entry, which describes the relationship between the effective requirements of the specified source and target sets in the context of the matching-rationale method globaly defined in the provenance unless overwritten locally in the  map. The relationship type and the matching-rationale must be used together. However, more than one matching-rationale method may apply to a source and target pair. 
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Relationship Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='relationship_._type' baseType='TokenDatatype'"
	 * @generated
	 */
	EDataType getRelationshipType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Security Objective Availability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                        
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Security Objective: Availability</b>
     *   : A target-level of availability for the system, based on the sensitivity of information within the system.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Security Objective Availability Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='security-objective-availability_._type' baseType='StringDatatype'"
	 * @generated
	 */
	EDataType getSecurityObjectiveAvailabilityType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Security Objective Confidentiality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                        
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Security Objective: Confidentiality</b>
     *   : A target-level of confidentiality for the system, based on the sensitivity of information within the system.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Security Objective Confidentiality Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='security-objective-confidentiality_._type' baseType='StringDatatype'"
	 * @generated
	 */
	EDataType getSecurityObjectiveConfidentialityType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Security Objective Integrity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                        
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Security Objective: Integrity</b>
     *   : A target-level of integrity for the system, based on the sensitivity of information within the system.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Security Objective Integrity Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='security-objective-integrity_._type' baseType='StringDatatype'"
	 * @generated
	 */
	EDataType getSecurityObjectiveIntegrityType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Security Sensitivity Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                        
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Security Sensitivity Level</b>
     *   : The overall information system sensitivity categorization, such as defined by FIPS-199.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Security Sensitivity Level Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='security-sensitivity-level_._type' baseType='StringDatatype'"
	 * @generated
	 */
	EDataType getSecuritySensitivityLevelType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Short Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                        
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">User Short Name</b>
     *   : A short common name, abbreviation, or acronym for the user.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Short Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='short-name_._type' baseType='StringDatatype'"
	 * @generated
	 */
	EDataType getShortNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Short Name Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                                 
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Party Short Name</b>
     *   : A short common name, abbreviation, or acronym for the party.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Short Name Type1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='short-name_._1_._type' baseType='StringDatatype'"
	 * @generated
	 */
	EDataType getShortNameType1();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Short Name Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                                 
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Role Short Name</b>
     *   : A short common name, abbreviation, or acronym for the role.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Short Name Type2</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='short-name_._2_._type' baseType='StringDatatype'"
	 * @generated
	 */
	EDataType getShortNameType2();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Start Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                                          
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Start</b>
     *   : Identifies the start date and time of an event.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Start Type</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='start_._type' baseType='DateTimeWithTimezoneDatatype'"
	 * @generated
	 */
	EDataType getStartType();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Start Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                                          
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Start</b>
     *   : Identifies the start date and time of the event.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Start Type1</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='start_._1_._type' baseType='DateTimeWithTimezoneDatatype'"
	 * @generated
	 */
	EDataType getStartType1();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Start Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                        
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">start field</b>
     *   : Date/time stamp identifying the start of the evidence collection reflected in these results.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Start Type2</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='start_._2_._type' baseType='DateTimeWithTimezoneDatatype'"
	 * @generated
	 */
	EDataType getStartType2();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Statement Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                        
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Include Specific Statements</b>
     *   : Used to constrain the selection to only specificity identified statements.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Statement Id Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='statement-id_._type' baseType='TokenDatatype'"
	 * @generated
	 */
	EDataType getStatementIdType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                        
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">State</b>
     *   : State, province or analogous geographical region for a mailing address.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>State Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='state_._type' baseType='StringDatatype'"
	 * @generated
	 */
	EDataType getStateType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A non-empty string of Unicode characters with leading and trailing whitespace
     * 				disallowed. Whitespace is: U+9, U+10, U+32 or [ \n\t]+
     * The 'string' datatype restricts the XSD type by prohibiting leading 
     * 					and trailing whitespace, and something (not only whitespace) is required.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>String Datatype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='StringDatatype' baseType='http://www.eclipse.org/emf/2003/XMLType#string' whiteSpace='preserve' pattern='\\S(.*\\S)?'"
	 * @generated
	 */
	EDataType getStringDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>System Name Short Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                        
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">System Name - Short</b>
     *   : A short name for the system, such as an acronym, that is suitable for display in a data table or summary list.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>System Name Short Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='system-name-short_._type' baseType='StringDatatype'"
	 * @generated
	 */
	EDataType getSystemNameShortType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>System Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                        
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">System Name - Full</b>
     *   : The full name of the system.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>System Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='system-name_._type' baseType='StringDatatype'"
	 * @generated
	 */
	EDataType getSystemNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Token Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A non-empty, non-colonized name as defined by XML Schema Part 2: Datatypes
     * 				Second Edition (https://www.w3.org/TR/xmlschema11-2/#NCName), with leading and trailing
     * 				whitespace disallowed.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Token Datatype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TokenDatatype' baseType='StringDatatype' pattern='(\\p{L}|_)(\\p{L}|\\p{N}|[.\\-_])*'"
	 * @generated
	 */
	EDataType getTokenDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                        
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Observation Type</b>
     *   : Identifies the nature of the observation. More than one may be used to further qualify and enable filtering.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Type Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='type_._type' baseType='TokenDatatype'"
	 * @generated
	 */
	EDataType getTypeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>URI Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A universal resource identifier (URI) formatted according to RFC3986.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>URI Datatype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='URIDatatype' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI' pattern='[a-zA-Z][a-zA-Z0-9+\\-.]+:.*\\S'"
	 * @generated
	 */
	EDataType getURIDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>URI Reference Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A URI Reference, either a URI or a relative-reference, formatted according to section 4.1 of RFC3986.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>URI Reference Datatype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='URIReferenceDatatype' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI' pattern='\\S(.*\\S)?'"
	 * @generated
	 */
	EDataType getURIReferenceDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Url Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                                 
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Location URL</b>
     *   : The uniform resource locator (URL) for a web site or other resource associated with the location.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Url Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='url_._type' baseType='URIDatatype'"
	 * @generated
	 */
	EDataType getUrlType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>UUID Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A type 4 ('random' or 'pseudorandom') or type 5 UUID per RFC
     * 				4122.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>UUID Datatype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='UUIDDatatype' baseType='StringDatatype' pattern='[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-[45][0-9A-Fa-f]{3}-[89ABab][0-9A-Fa-f]{3}-[0-9A-Fa-f]{12}'"
	 * @generated
	 */
	EDataType getUUIDDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *                        
     *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Parameter Value</b>
     *   : A parameter value or set of values.
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Value Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='value_._type' baseType='StringDatatype'"
	 * @generated
	 */
	EDataType getValueType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OSCALFactory getOSCALFactory();

} //OSCALPackage
