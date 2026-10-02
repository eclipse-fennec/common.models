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
package gov.nist.csrc.ns.oscal.impl;

import gov.nist.csrc.ns.oscal.AssessmentAssets;
import gov.nist.csrc.ns.oscal.AssessmentPlan;
import gov.nist.csrc.ns.oscal.AssessmentPlanLocalDefinitions;
import gov.nist.csrc.ns.oscal.AssessmentSubject;
import gov.nist.csrc.ns.oscal.BackMatter;
import gov.nist.csrc.ns.oscal.ImportSsp;
import gov.nist.csrc.ns.oscal.Metadata;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.ReviewedControls;
import gov.nist.csrc.ns.oscal.Task;
import gov.nist.csrc.ns.oscal.TermsAndConditions;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assessment Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPlanImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPlanImpl#getImportSsp <em>Import Ssp</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPlanImpl#getLocalDefinitions <em>Local Definitions</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPlanImpl#getTermsAndConditions <em>Terms And Conditions</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPlanImpl#getReviewedControls <em>Reviewed Controls</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPlanImpl#getAssessmentSubject <em>Assessment Subject</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPlanImpl#getAssessmentAssets <em>Assessment Assets</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPlanImpl#getTask <em>Task</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPlanImpl#getBackMatter <em>Back Matter</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentPlanImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssessmentPlanImpl extends MinimalEObjectImpl.Container implements AssessmentPlan {
	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected Metadata metadata;

	/**
	 * The cached value of the '{@link #getImportSsp() <em>Import Ssp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportSsp()
	 * @generated
	 * @ordered
	 */
	protected ImportSsp importSsp;

	/**
	 * The cached value of the '{@link #getLocalDefinitions() <em>Local Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalDefinitions()
	 * @generated
	 * @ordered
	 */
	protected AssessmentPlanLocalDefinitions localDefinitions;

	/**
	 * The cached value of the '{@link #getTermsAndConditions() <em>Terms And Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermsAndConditions()
	 * @generated
	 * @ordered
	 */
	protected TermsAndConditions termsAndConditions;

	/**
	 * The cached value of the '{@link #getReviewedControls() <em>Reviewed Controls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewedControls()
	 * @generated
	 * @ordered
	 */
	protected ReviewedControls reviewedControls;

	/**
	 * The cached value of the '{@link #getAssessmentSubject() <em>Assessment Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<AssessmentSubject> assessmentSubject;

	/**
	 * The cached value of the '{@link #getAssessmentAssets() <em>Assessment Assets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentAssets()
	 * @generated
	 * @ordered
	 */
	protected AssessmentAssets assessmentAssets;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> task;

	/**
	 * The cached value of the '{@link #getBackMatter() <em>Back Matter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackMatter()
	 * @generated
	 * @ordered
	 */
	protected BackMatter backMatter;

	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getAssessmentPlan();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metadata getMetadata() {
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(Metadata newMetadata, NotificationChain msgs) {
		Metadata oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_PLAN__METADATA, oldMetadata, newMetadata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetadata(Metadata newMetadata) {
		if (newMetadata != metadata) {
			NotificationChain msgs = null;
			if (metadata != null)
				msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.ASSESSMENT_PLAN__METADATA, null, msgs);
			if (newMetadata != null)
				msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.ASSESSMENT_PLAN__METADATA, null, msgs);
			msgs = basicSetMetadata(newMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_PLAN__METADATA, newMetadata, newMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportSsp getImportSsp() {
		return importSsp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportSsp(ImportSsp newImportSsp, NotificationChain msgs) {
		ImportSsp oldImportSsp = importSsp;
		importSsp = newImportSsp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_PLAN__IMPORT_SSP, oldImportSsp, newImportSsp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImportSsp(ImportSsp newImportSsp) {
		if (newImportSsp != importSsp) {
			NotificationChain msgs = null;
			if (importSsp != null)
				msgs = ((InternalEObject)importSsp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.ASSESSMENT_PLAN__IMPORT_SSP, null, msgs);
			if (newImportSsp != null)
				msgs = ((InternalEObject)newImportSsp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.ASSESSMENT_PLAN__IMPORT_SSP, null, msgs);
			msgs = basicSetImportSsp(newImportSsp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_PLAN__IMPORT_SSP, newImportSsp, newImportSsp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentPlanLocalDefinitions getLocalDefinitions() {
		return localDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalDefinitions(AssessmentPlanLocalDefinitions newLocalDefinitions, NotificationChain msgs) {
		AssessmentPlanLocalDefinitions oldLocalDefinitions = localDefinitions;
		localDefinitions = newLocalDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_PLAN__LOCAL_DEFINITIONS, oldLocalDefinitions, newLocalDefinitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalDefinitions(AssessmentPlanLocalDefinitions newLocalDefinitions) {
		if (newLocalDefinitions != localDefinitions) {
			NotificationChain msgs = null;
			if (localDefinitions != null)
				msgs = ((InternalEObject)localDefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.ASSESSMENT_PLAN__LOCAL_DEFINITIONS, null, msgs);
			if (newLocalDefinitions != null)
				msgs = ((InternalEObject)newLocalDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.ASSESSMENT_PLAN__LOCAL_DEFINITIONS, null, msgs);
			msgs = basicSetLocalDefinitions(newLocalDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_PLAN__LOCAL_DEFINITIONS, newLocalDefinitions, newLocalDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TermsAndConditions getTermsAndConditions() {
		return termsAndConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTermsAndConditions(TermsAndConditions newTermsAndConditions, NotificationChain msgs) {
		TermsAndConditions oldTermsAndConditions = termsAndConditions;
		termsAndConditions = newTermsAndConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_PLAN__TERMS_AND_CONDITIONS, oldTermsAndConditions, newTermsAndConditions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTermsAndConditions(TermsAndConditions newTermsAndConditions) {
		if (newTermsAndConditions != termsAndConditions) {
			NotificationChain msgs = null;
			if (termsAndConditions != null)
				msgs = ((InternalEObject)termsAndConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.ASSESSMENT_PLAN__TERMS_AND_CONDITIONS, null, msgs);
			if (newTermsAndConditions != null)
				msgs = ((InternalEObject)newTermsAndConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.ASSESSMENT_PLAN__TERMS_AND_CONDITIONS, null, msgs);
			msgs = basicSetTermsAndConditions(newTermsAndConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_PLAN__TERMS_AND_CONDITIONS, newTermsAndConditions, newTermsAndConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReviewedControls getReviewedControls() {
		return reviewedControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReviewedControls(ReviewedControls newReviewedControls, NotificationChain msgs) {
		ReviewedControls oldReviewedControls = reviewedControls;
		reviewedControls = newReviewedControls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_PLAN__REVIEWED_CONTROLS, oldReviewedControls, newReviewedControls);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReviewedControls(ReviewedControls newReviewedControls) {
		if (newReviewedControls != reviewedControls) {
			NotificationChain msgs = null;
			if (reviewedControls != null)
				msgs = ((InternalEObject)reviewedControls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.ASSESSMENT_PLAN__REVIEWED_CONTROLS, null, msgs);
			if (newReviewedControls != null)
				msgs = ((InternalEObject)newReviewedControls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.ASSESSMENT_PLAN__REVIEWED_CONTROLS, null, msgs);
			msgs = basicSetReviewedControls(newReviewedControls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_PLAN__REVIEWED_CONTROLS, newReviewedControls, newReviewedControls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssessmentSubject> getAssessmentSubject() {
		if (assessmentSubject == null) {
			assessmentSubject = new EObjectContainmentEList<AssessmentSubject>(AssessmentSubject.class, this, OSCALPackage.ASSESSMENT_PLAN__ASSESSMENT_SUBJECT);
		}
		return assessmentSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentAssets getAssessmentAssets() {
		return assessmentAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssessmentAssets(AssessmentAssets newAssessmentAssets, NotificationChain msgs) {
		AssessmentAssets oldAssessmentAssets = assessmentAssets;
		assessmentAssets = newAssessmentAssets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_PLAN__ASSESSMENT_ASSETS, oldAssessmentAssets, newAssessmentAssets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssessmentAssets(AssessmentAssets newAssessmentAssets) {
		if (newAssessmentAssets != assessmentAssets) {
			NotificationChain msgs = null;
			if (assessmentAssets != null)
				msgs = ((InternalEObject)assessmentAssets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.ASSESSMENT_PLAN__ASSESSMENT_ASSETS, null, msgs);
			if (newAssessmentAssets != null)
				msgs = ((InternalEObject)newAssessmentAssets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.ASSESSMENT_PLAN__ASSESSMENT_ASSETS, null, msgs);
			msgs = basicSetAssessmentAssets(newAssessmentAssets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_PLAN__ASSESSMENT_ASSETS, newAssessmentAssets, newAssessmentAssets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Task> getTask() {
		if (task == null) {
			task = new EObjectContainmentEList<Task>(Task.class, this, OSCALPackage.ASSESSMENT_PLAN__TASK);
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BackMatter getBackMatter() {
		return backMatter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackMatter(BackMatter newBackMatter, NotificationChain msgs) {
		BackMatter oldBackMatter = backMatter;
		backMatter = newBackMatter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_PLAN__BACK_MATTER, oldBackMatter, newBackMatter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackMatter(BackMatter newBackMatter) {
		if (newBackMatter != backMatter) {
			NotificationChain msgs = null;
			if (backMatter != null)
				msgs = ((InternalEObject)backMatter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.ASSESSMENT_PLAN__BACK_MATTER, null, msgs);
			if (newBackMatter != null)
				msgs = ((InternalEObject)newBackMatter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.ASSESSMENT_PLAN__BACK_MATTER, null, msgs);
			msgs = basicSetBackMatter(newBackMatter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_PLAN__BACK_MATTER, newBackMatter, newBackMatter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_PLAN__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.ASSESSMENT_PLAN__METADATA:
				return basicSetMetadata(null, msgs);
			case OSCALPackage.ASSESSMENT_PLAN__IMPORT_SSP:
				return basicSetImportSsp(null, msgs);
			case OSCALPackage.ASSESSMENT_PLAN__LOCAL_DEFINITIONS:
				return basicSetLocalDefinitions(null, msgs);
			case OSCALPackage.ASSESSMENT_PLAN__TERMS_AND_CONDITIONS:
				return basicSetTermsAndConditions(null, msgs);
			case OSCALPackage.ASSESSMENT_PLAN__REVIEWED_CONTROLS:
				return basicSetReviewedControls(null, msgs);
			case OSCALPackage.ASSESSMENT_PLAN__ASSESSMENT_SUBJECT:
				return ((InternalEList<?>)getAssessmentSubject()).basicRemove(otherEnd, msgs);
			case OSCALPackage.ASSESSMENT_PLAN__ASSESSMENT_ASSETS:
				return basicSetAssessmentAssets(null, msgs);
			case OSCALPackage.ASSESSMENT_PLAN__TASK:
				return ((InternalEList<?>)getTask()).basicRemove(otherEnd, msgs);
			case OSCALPackage.ASSESSMENT_PLAN__BACK_MATTER:
				return basicSetBackMatter(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OSCALPackage.ASSESSMENT_PLAN__METADATA:
				return getMetadata();
			case OSCALPackage.ASSESSMENT_PLAN__IMPORT_SSP:
				return getImportSsp();
			case OSCALPackage.ASSESSMENT_PLAN__LOCAL_DEFINITIONS:
				return getLocalDefinitions();
			case OSCALPackage.ASSESSMENT_PLAN__TERMS_AND_CONDITIONS:
				return getTermsAndConditions();
			case OSCALPackage.ASSESSMENT_PLAN__REVIEWED_CONTROLS:
				return getReviewedControls();
			case OSCALPackage.ASSESSMENT_PLAN__ASSESSMENT_SUBJECT:
				return getAssessmentSubject();
			case OSCALPackage.ASSESSMENT_PLAN__ASSESSMENT_ASSETS:
				return getAssessmentAssets();
			case OSCALPackage.ASSESSMENT_PLAN__TASK:
				return getTask();
			case OSCALPackage.ASSESSMENT_PLAN__BACK_MATTER:
				return getBackMatter();
			case OSCALPackage.ASSESSMENT_PLAN__UUID:
				return getUuid();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OSCALPackage.ASSESSMENT_PLAN__METADATA:
				setMetadata((Metadata)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PLAN__IMPORT_SSP:
				setImportSsp((ImportSsp)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PLAN__LOCAL_DEFINITIONS:
				setLocalDefinitions((AssessmentPlanLocalDefinitions)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PLAN__TERMS_AND_CONDITIONS:
				setTermsAndConditions((TermsAndConditions)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PLAN__REVIEWED_CONTROLS:
				setReviewedControls((ReviewedControls)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PLAN__ASSESSMENT_SUBJECT:
				getAssessmentSubject().clear();
				getAssessmentSubject().addAll((Collection<? extends AssessmentSubject>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PLAN__ASSESSMENT_ASSETS:
				setAssessmentAssets((AssessmentAssets)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PLAN__TASK:
				getTask().clear();
				getTask().addAll((Collection<? extends Task>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PLAN__BACK_MATTER:
				setBackMatter((BackMatter)newValue);
				return;
			case OSCALPackage.ASSESSMENT_PLAN__UUID:
				setUuid((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OSCALPackage.ASSESSMENT_PLAN__METADATA:
				setMetadata((Metadata)null);
				return;
			case OSCALPackage.ASSESSMENT_PLAN__IMPORT_SSP:
				setImportSsp((ImportSsp)null);
				return;
			case OSCALPackage.ASSESSMENT_PLAN__LOCAL_DEFINITIONS:
				setLocalDefinitions((AssessmentPlanLocalDefinitions)null);
				return;
			case OSCALPackage.ASSESSMENT_PLAN__TERMS_AND_CONDITIONS:
				setTermsAndConditions((TermsAndConditions)null);
				return;
			case OSCALPackage.ASSESSMENT_PLAN__REVIEWED_CONTROLS:
				setReviewedControls((ReviewedControls)null);
				return;
			case OSCALPackage.ASSESSMENT_PLAN__ASSESSMENT_SUBJECT:
				getAssessmentSubject().clear();
				return;
			case OSCALPackage.ASSESSMENT_PLAN__ASSESSMENT_ASSETS:
				setAssessmentAssets((AssessmentAssets)null);
				return;
			case OSCALPackage.ASSESSMENT_PLAN__TASK:
				getTask().clear();
				return;
			case OSCALPackage.ASSESSMENT_PLAN__BACK_MATTER:
				setBackMatter((BackMatter)null);
				return;
			case OSCALPackage.ASSESSMENT_PLAN__UUID:
				setUuid(UUID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OSCALPackage.ASSESSMENT_PLAN__METADATA:
				return metadata != null;
			case OSCALPackage.ASSESSMENT_PLAN__IMPORT_SSP:
				return importSsp != null;
			case OSCALPackage.ASSESSMENT_PLAN__LOCAL_DEFINITIONS:
				return localDefinitions != null;
			case OSCALPackage.ASSESSMENT_PLAN__TERMS_AND_CONDITIONS:
				return termsAndConditions != null;
			case OSCALPackage.ASSESSMENT_PLAN__REVIEWED_CONTROLS:
				return reviewedControls != null;
			case OSCALPackage.ASSESSMENT_PLAN__ASSESSMENT_SUBJECT:
				return assessmentSubject != null && !assessmentSubject.isEmpty();
			case OSCALPackage.ASSESSMENT_PLAN__ASSESSMENT_ASSETS:
				return assessmentAssets != null;
			case OSCALPackage.ASSESSMENT_PLAN__TASK:
				return task != null && !task.isEmpty();
			case OSCALPackage.ASSESSMENT_PLAN__BACK_MATTER:
				return backMatter != null;
			case OSCALPackage.ASSESSMENT_PLAN__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //AssessmentPlanImpl
