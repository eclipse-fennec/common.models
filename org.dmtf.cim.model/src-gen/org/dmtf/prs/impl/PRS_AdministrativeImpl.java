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
package org.dmtf.prs.impl;

import org.dmtf.prs.PRS_Administrative;
import org.dmtf.prs.PrsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PRS Administrative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.impl.PRS_AdministrativeImpl#getComplianceLevel <em>Compliance Level</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_AdministrativeImpl#getDocumentStatus <em>Document Status</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_AdministrativeImpl#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_AdministrativeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_AdministrativeImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_AdministrativeImpl#getDisclaimer <em>Disclaimer</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_AdministrativeImpl#getRights <em>Rights</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PRS_AdministrativeImpl extends PRS_ExchangeElementImpl implements PRS_Administrative {
	/**
	 * The default value of the '{@link #getComplianceLevel() <em>Compliance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplianceLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COMPLIANCE_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComplianceLevel() <em>Compliance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplianceLevel()
	 * @generated
	 * @ordered
	 */
	protected Integer complianceLevel = COMPLIANCE_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentStatus() <em>Document Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DOCUMENT_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentStatus() <em>Document Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer documentStatus = DOCUMENT_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistribution() <em>Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DISTRIBUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistribution() <em>Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution()
	 * @generated
	 * @ordered
	 */
	protected Integer distribution = DISTRIBUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected static final String COPYRIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected String copyright = COPYRIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisclaimer() <em>Disclaimer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisclaimer()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCLAIMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisclaimer() <em>Disclaimer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisclaimer()
	 * @generated
	 * @ordered
	 */
	protected String disclaimer = DISCLAIMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRights() <em>Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRights()
	 * @generated
	 * @ordered
	 */
	protected static final String RIGHTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRights() <em>Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRights()
	 * @generated
	 * @ordered
	 */
	protected String rights = RIGHTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PRS_AdministrativeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrsPackage.Literals.PRS_ADMINISTRATIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getComplianceLevel() {
		return complianceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComplianceLevel(Integer newComplianceLevel) {
		Integer oldComplianceLevel = complianceLevel;
		complianceLevel = newComplianceLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ADMINISTRATIVE__COMPLIANCE_LEVEL, oldComplianceLevel, complianceLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDocumentStatus() {
		return documentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentStatus(Integer newDocumentStatus) {
		Integer oldDocumentStatus = documentStatus;
		documentStatus = newDocumentStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ADMINISTRATIVE__DOCUMENT_STATUS, oldDocumentStatus, documentStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDistribution() {
		return distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistribution(Integer newDistribution) {
		Integer oldDistribution = distribution;
		distribution = newDistribution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ADMINISTRATIVE__DISTRIBUTION, oldDistribution, distribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ADMINISTRATIVE__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCopyright(String newCopyright) {
		String oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ADMINISTRATIVE__COPYRIGHT, oldCopyright, copyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisclaimer() {
		return disclaimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisclaimer(String newDisclaimer) {
		String oldDisclaimer = disclaimer;
		disclaimer = newDisclaimer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ADMINISTRATIVE__DISCLAIMER, oldDisclaimer, disclaimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRights() {
		return rights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRights(String newRights) {
		String oldRights = rights;
		rights = newRights;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ADMINISTRATIVE__RIGHTS, oldRights, rights));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrsPackage.PRS_ADMINISTRATIVE__COMPLIANCE_LEVEL:
				return getComplianceLevel();
			case PrsPackage.PRS_ADMINISTRATIVE__DOCUMENT_STATUS:
				return getDocumentStatus();
			case PrsPackage.PRS_ADMINISTRATIVE__DISTRIBUTION:
				return getDistribution();
			case PrsPackage.PRS_ADMINISTRATIVE__LANGUAGE:
				return getLanguage();
			case PrsPackage.PRS_ADMINISTRATIVE__COPYRIGHT:
				return getCopyright();
			case PrsPackage.PRS_ADMINISTRATIVE__DISCLAIMER:
				return getDisclaimer();
			case PrsPackage.PRS_ADMINISTRATIVE__RIGHTS:
				return getRights();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PrsPackage.PRS_ADMINISTRATIVE__COMPLIANCE_LEVEL:
				setComplianceLevel((Integer)newValue);
				return;
			case PrsPackage.PRS_ADMINISTRATIVE__DOCUMENT_STATUS:
				setDocumentStatus((Integer)newValue);
				return;
			case PrsPackage.PRS_ADMINISTRATIVE__DISTRIBUTION:
				setDistribution((Integer)newValue);
				return;
			case PrsPackage.PRS_ADMINISTRATIVE__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case PrsPackage.PRS_ADMINISTRATIVE__COPYRIGHT:
				setCopyright((String)newValue);
				return;
			case PrsPackage.PRS_ADMINISTRATIVE__DISCLAIMER:
				setDisclaimer((String)newValue);
				return;
			case PrsPackage.PRS_ADMINISTRATIVE__RIGHTS:
				setRights((String)newValue);
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
			case PrsPackage.PRS_ADMINISTRATIVE__COMPLIANCE_LEVEL:
				setComplianceLevel(COMPLIANCE_LEVEL_EDEFAULT);
				return;
			case PrsPackage.PRS_ADMINISTRATIVE__DOCUMENT_STATUS:
				setDocumentStatus(DOCUMENT_STATUS_EDEFAULT);
				return;
			case PrsPackage.PRS_ADMINISTRATIVE__DISTRIBUTION:
				setDistribution(DISTRIBUTION_EDEFAULT);
				return;
			case PrsPackage.PRS_ADMINISTRATIVE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case PrsPackage.PRS_ADMINISTRATIVE__COPYRIGHT:
				setCopyright(COPYRIGHT_EDEFAULT);
				return;
			case PrsPackage.PRS_ADMINISTRATIVE__DISCLAIMER:
				setDisclaimer(DISCLAIMER_EDEFAULT);
				return;
			case PrsPackage.PRS_ADMINISTRATIVE__RIGHTS:
				setRights(RIGHTS_EDEFAULT);
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
			case PrsPackage.PRS_ADMINISTRATIVE__COMPLIANCE_LEVEL:
				return COMPLIANCE_LEVEL_EDEFAULT == null ? complianceLevel != null : !COMPLIANCE_LEVEL_EDEFAULT.equals(complianceLevel);
			case PrsPackage.PRS_ADMINISTRATIVE__DOCUMENT_STATUS:
				return DOCUMENT_STATUS_EDEFAULT == null ? documentStatus != null : !DOCUMENT_STATUS_EDEFAULT.equals(documentStatus);
			case PrsPackage.PRS_ADMINISTRATIVE__DISTRIBUTION:
				return DISTRIBUTION_EDEFAULT == null ? distribution != null : !DISTRIBUTION_EDEFAULT.equals(distribution);
			case PrsPackage.PRS_ADMINISTRATIVE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case PrsPackage.PRS_ADMINISTRATIVE__COPYRIGHT:
				return COPYRIGHT_EDEFAULT == null ? copyright != null : !COPYRIGHT_EDEFAULT.equals(copyright);
			case PrsPackage.PRS_ADMINISTRATIVE__DISCLAIMER:
				return DISCLAIMER_EDEFAULT == null ? disclaimer != null : !DISCLAIMER_EDEFAULT.equals(disclaimer);
			case PrsPackage.PRS_ADMINISTRATIVE__RIGHTS:
				return RIGHTS_EDEFAULT == null ? rights != null : !RIGHTS_EDEFAULT.equals(rights);
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
		result.append(" (ComplianceLevel: ");
		result.append(complianceLevel);
		result.append(", DocumentStatus: ");
		result.append(documentStatus);
		result.append(", Distribution: ");
		result.append(distribution);
		result.append(", Language: ");
		result.append(language);
		result.append(", Copyright: ");
		result.append(copyright);
		result.append(", Disclaimer: ");
		result.append(disclaimer);
		result.append(", Rights: ");
		result.append(rights);
		result.append(')');
		return result.toString();
	}

} //PRS_AdministrativeImpl
