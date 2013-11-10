modules = {

    'foundation' {
        dependsOn 'foundation-style', 'foundation-modules'
    }

    'foundation-style' {
        resource url: 'foundation/css/foundation.css', disposition: 'head'
        resource url: 'foundation/css/normalize.css', disposition: 'head'
    }

    'foundation-modules' {
        dependsOn 'foundation-abide', 'foundation-alerts', 'foundation-clearing', 'foundation-cookie', 'foundation-dropdown', 'foundation-forms', 'foundation-interchange', 'foundation-joyride', 'foundation-magellan', 'foundation-orbit', 'foundation-placeholder', 'foundation-reveal', 'foundation-section', 'foundation-tooltips', 'foundation-topbar'
    }

    'foundation-abide' {
        dependsOn 'foundation-core'
        resource url: 'foundation/js/foundation/foundation.abide.js', disposition: 'head'
    }

    'foundation-alerts' {
        dependsOn 'foundation-core'
        resource url: 'foundation/js/foundation/foundation.alerts.js', disposition: 'head'
    }

    'foundation-clearing' {
        dependsOn 'foundation-core'
        resource url: 'foundation/js/foundation/foundation.clearing.js', disposition: 'head'
    }

    'foundation-cookie' {
        dependsOn 'foundation-core'
        resource url: 'foundation/js/foundation/foundation.cookie.js', disposition: 'head'
    }

    'foundation-dropdown' {
        dependsOn 'foundation-core'
        resource url: 'foundation/js/foundation/foundation.dropdown.js', disposition: 'head'
    }

    'foundation-forms' {
        dependsOn 'foundation-core'
        resource url: 'foundation/js/foundation/foundation.forms.js', disposition: 'head'
    }

    'foundation-interchange' {
        dependsOn 'foundation-core'
        resource url: 'foundation/js/foundation/foundation.interchange.js', disposition: 'head'
    }

    'foundation-joyride' {
        dependsOn 'foundation-core'
        resource url: 'foundation/js/foundation/foundation.joyride.js', disposition: 'head'
    }

    'foundation-magellan' {
        dependsOn 'foundation-core'
        resource url: 'foundation/js/foundation/foundation.magellan.js', disposition: 'head'
    }

    'foundation-orbit' {
        dependsOn 'foundation-core'
        resource url: 'foundation/js/foundation/foundation.orbit.js', disposition: 'head'
    }

    'foundation-placeholder' {
        dependsOn 'foundation-core'
        resource url: 'foundation/js/foundation/foundation.placeholder.js', disposition: 'head'
    }

    'foundation-reveal' {
        dependsOn 'foundation-core'
        resource url: 'foundation/js/foundation/foundation.reveal.js', disposition: 'head'
    }

    'foundation-section' {
        dependsOn 'foundation-core'
        resource url: 'foundation/js/foundation/foundation.section.js', disposition: 'head'
    }

    'foundation-tooltips' {
        dependsOn 'foundation-core'
        resource url: 'foundation/js/foundation/foundation.tooltips.js', disposition: 'head'
    }

    'foundation-topbar' {
        dependsOn 'foundation-core'
        resource url: 'foundation/js/foundation/foundation.topbar.js', disposition: 'head'
    }

    'foundation-core' {
        dependsOn 'jquery', 'foundation-dependencies'
        resource url: 'foundation/js/foundation/foundation.js', disposition: 'head'
    }

    'foundation-dependencies' {
        resource url: 'foundation/js/vendor/custom.modernizr.js', disposition: 'head'
        resource url: 'foundation/js/vendor/zepto.js', disposition: 'head'
    }

}
